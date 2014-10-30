import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_groupsManager_userregister_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/register.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(1)
invokeTag('javascript','g',6,['library':("jquery")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('textField','g',18,['required':("true"),'name':("login"),'value':(user?.login)],-1)
printHtmlPart(6)
createTagBody(3, {->
printHtmlPart(7)
invokeTag('fieldError','g',20,['bean':(user),'field':("login")],-1)
printHtmlPart(8)
})
invokeTag('hasErrors','g',21,['bean':(user),'field':("login")],3)
printHtmlPart(9)
invokeTag('passwordField','g',25,['required':("true"),'name':("password"),'value':(user?.password)],-1)
printHtmlPart(6)
createTagBody(3, {->
printHtmlPart(7)
invokeTag('fieldError','g',27,['bean':(user),'field':("password")],-1)
printHtmlPart(8)
})
invokeTag('hasErrors','g',28,['bean':(user),'field':("password")],3)
printHtmlPart(10)
invokeTag('passwordField','g',32,['required':("true"),'name':("confirm"),'value':(params?.confirm)],-1)
printHtmlPart(6)
createTagBody(3, {->
printHtmlPart(7)
invokeTag('fieldError','g',34,['bean':(user),'field':("confirm")],-1)
printHtmlPart(8)
})
invokeTag('hasErrors','g',35,['bean':(user),'field':("confirm")],3)
printHtmlPart(11)
invokeTag('textField','g',39,['required':("true"),'name':("firstName"),'value':(user?.firstName)],-1)
printHtmlPart(6)
createTagBody(3, {->
printHtmlPart(7)
invokeTag('fieldError','g',41,['bean':(user),'field':("firstName")],-1)
printHtmlPart(8)
})
invokeTag('hasErrors','g',42,['bean':(user),'field':("firstName")],3)
printHtmlPart(12)
invokeTag('textField','g',46,['required':("true"),'name':("lastName"),'value':(user?.lastName)],-1)
printHtmlPart(6)
createTagBody(3, {->
printHtmlPart(7)
invokeTag('fieldError','g',48,['bean':(user),'field':("lastName")],-1)
printHtmlPart(8)
})
invokeTag('hasErrors','g',49,['bean':(user),'field':("lastName")],3)
printHtmlPart(13)
invokeTag('textField','g',53,['required':("true"),'name':("jobTitle"),'value':(user?.jobTitle)],-1)
printHtmlPart(6)
createTagBody(3, {->
printHtmlPart(7)
invokeTag('fieldError','g',55,['bean':(user),'field':("jobTitle")],-1)
printHtmlPart(8)
})
invokeTag('hasErrors','g',56,['bean':(user),'field':("jobTitle")],3)
printHtmlPart(14)
invokeTag('textField','g',60,['required':("true"),'name':("eMail"),'value':(user?.eMail)],-1)
printHtmlPart(6)
createTagBody(3, {->
printHtmlPart(7)
invokeTag('fieldError','g',62,['bean':(user),'field':("eMail")],-1)
printHtmlPart(8)
})
invokeTag('hasErrors','g',63,['bean':(user),'field':("eMail")],3)
printHtmlPart(15)
invokeTag('submitButton','g',66,['class':("btn"),'name':("register"),'value':("Register")],-1)
printHtmlPart(16)
})
invokeTag('form','g',68,['action':("register"),'name':("registerForm"),'class':("form form-horizontal")],2)
printHtmlPart(3)
})
invokeTag('captureBody','sitemesh',69,['id':("body")],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1413969621191L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
