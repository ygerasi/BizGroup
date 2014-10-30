import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_groupsManager_supplierDeal_supplierDealList_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/supplierDeal/_supplierDealList.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
for( supplierDeal in (supplierDeals) ) {
printHtmlPart(1)
createTagBody(2, {->
expressionOut.print(supplierDeal?.description)
printHtmlPart(2)
})
invokeTag('link','g',9,['controller':("supplierDeal"),'action':("display"),'id':(supplierDeal.id),'elementId':("supplierDealLink${supplierDeal.id}")],2)
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
expressionOut.print(supplierDeal.id)
printHtmlPart(5)
})
invokeTag('script','r',16,[:],2)
printHtmlPart(6)
}
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1414583823678L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
