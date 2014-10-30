package com.bizgroup

class UserController {
	//static scaffold = true
	def register() {
		if(request.method == 'POST') {
			def u = new User()
			u.properties['login', 'password', 'firstName', 'lastName','eMail','jobTitle'] = params
			u.active = true
			if(u.password != params.confirm) {
				u.errors.rejectValue("password", "user.password.dontmatch")
				return [user:u]
			} else if(u.save()) {
				session.user = u
				redirect controller:"homePage"
			} else {
				return [user:u]
			}
		}		
	}
	def login(LoginCommand cmd) { // In order to use a command object, you need to specify the command as the first argument in a controller action.
		if(request.method == 'POST') {
		  if(!cmd.hasErrors()) {
			session.user = cmd.getUser()
			//redirect controller:'bizGroup'
			render template: '/user/welcomeMessage'
		  } else {
			//render view:'/store/index', model:[loginCmd:cmd]
		  render template: '/user/loginBox', model: [loginCmd: cmd] // this is in the book - but this showes only login no frame. instead it will be redirected to the home page.
		  //redirect controller:"homePage"
		  }
		} else {
		  //render view:'/store/index'
		  render template: '/user/loginBox'
		}
	  }
	def logout() {
		session.invalidate()
		redirect controller:"HomePage"
	}
}

// command object is not persistent
class LoginCommand {
	String login
	String password
	private  u // this is a definition of a generic object no need for def. see  http://blog.cacoethes.co.uk/groovyandgrails/a-couple-of-notes-about-groovy-syntax
	User getUser() {
		if(!u && login) {
			u = User.findByLogin(login) //yg , [fetch:[purchasedSongs:'join']])  
		}
		return u
	}
	// validator syntax
	// A custom validator is implemented by a Closure that takes up to three parameters. If the Closure accepts zero or one parameter, the parameter value will be the one being validated ("it" in the case of a zero-parameter Closure). If it accepts two parameters the first is the value and the second is the domain class instance being validated.
	// from: http://grails.org/doc/latest/ref/Constraints/validator.html
	
	static constraints = {
		login blank:false, validator:{ val, obj ->
			if(!obj.user)
				return "user.not.found"
		}
		password blank:false, validator:{ val, obj ->
			if(obj.user && obj.user.password != val)
				return "user.password.invalid"
		}
	}
}






