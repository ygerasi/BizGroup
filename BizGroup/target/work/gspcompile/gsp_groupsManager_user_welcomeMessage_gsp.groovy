import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_groupsManager_user_welcomeMessage_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/_welcomeMessage.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (session?.user)) {
printHtmlPart(1)
expressionOut.print(session?.user?.firstName)
printHtmlPart(2)
createClosureForHtmlPart(3, 2)
invokeTag('link','g',4,['controller':("user"),'action':("logout")],2)
printHtmlPart(4)
createClosureForHtmlPart(5, 2)
invokeTag('link','g',7,['controller':("user"),'action':("infoTBD")],2)
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',8,['controller':("supplierDeals"),'action':("dealsTBD")],2)
printHtmlPart(8)
}
printHtmlPart(9)
expressionOut.print(session?.user?.firstName)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414406168785L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
