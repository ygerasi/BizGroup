package com.bizgroup

class User extends Person{

	String login
	String password
	Boolean active
	
	static mapping = {
		autoTimestamp true
	}
	
    static constraints = {
		login blank:false, size:5..15,matches:/[\S]+/, unique:true
		password blank:false, size:5..15,matches:/[\S]+/		
    }
}
