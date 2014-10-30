import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_groupsManager_homePageindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/homePage/index.gsp" }
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
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(1)
invokeTag('javascript','g',4,['library':("jquery")],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',4,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createClosureForHtmlPart(5, 2)
invokeTag('link','g',12,['action':("showTime"),'elementId':("timeLink")],2)
printHtmlPart(6)
if(true && (!session?.user)) {
printHtmlPart(7)
invokeTag('render','g',18,['template':("/user/loginBox")],-1)
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('render','g',34,['template':("/supplier/supplierList"),'model':([suppliers: top5Suppliers])],-1)
printHtmlPart(10)
invokeTag('render','g',40,['template':("/supplierDeal/supplierDealList"),'model':([supplierDeals: top5SupplierDeals])],-1)
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',41,['id':("body")],1)
printHtmlPart(12)
createClosureForHtmlPart(13, 1)
invokeTag('script','r',56,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414604374864L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
