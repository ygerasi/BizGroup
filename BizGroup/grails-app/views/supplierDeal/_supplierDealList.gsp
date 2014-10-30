<!-- grails-app/views/supplierDeal/_supplierDealList.gsp -->
<ul class="list">
    <g:each in="${supplierDeals?}" var="supplierDeal">
        <li>
            <g:link controller="supplierDeal" 
            		action="display"
              		id="${supplierDeal.id}" 
              		elementId="supplierDealLink${supplierDeal.id}">${supplierDeal?.description}
            </g:link>
        </li> 
  		<r:script>
            $('#supplierDealLink${supplierDeal.id}').click(function() {
                $('#dealPanel').load(this.href); 
                return false;
            });
        </r:script>
          
    </g:each>
    
   
</ul>

 <div id="dealPanel"></div>

	<%--
	
	development comments
	======================
	* Notice how you can use the update attribute to specify that you want the contents of the response to be placed into an HTML <div> that has a DOM ID with the value dealPannel 
	* g:link elements
		id will create the id in the link. in this example
			href="/BizGroup/supplierDeal/display/1 - supplier id 
			href="/BizGroup/supplierDeal/display/2
		elementId will populatethe id element of the <a> element. In this example:
			  <a href="/BizGroup/supplierDeal/display/1" id="supplierDealLink1">
			  <a href="/BizGroup/supplierDeal/display/2" id="supplierDealLink2">
	
	
	--%>
	