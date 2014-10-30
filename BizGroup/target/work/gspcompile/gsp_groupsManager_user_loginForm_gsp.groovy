import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_groupsManager_user_loginForm_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/_loginForm.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('textField','g',7,['required':("true"),'placeholder':("Username"),'name':("login"),'value':(fieldValue(bean:loginCmd, field:'login'))],-1)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(3)
invokeTag('fieldError','g',9,['bean':(loginCmd),'field':("login")],-1)
printHtmlPart(4)
})
invokeTag('hasErrors','g',10,['bean':(loginCmd),'field':("login")],2)
printHtmlPart(5)
invokeTag('passwordField','g',15,['required':("true"),'placeholder':("Password"),'name':("password")],-1)
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('fieldError','g',18,['bean':(loginCmd),'field':("password")],-1)
printHtmlPart(7)
})
invokeTag('hasErrors','g',20,['bean':(loginCmd),'field':("password")],2)
printHtmlPart(8)
})
invokeTag('form','g',1,['name':("loginForm"),'url':([controller:'user',action:'login']),'class':("form")],1)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414054077187L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
