<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<meta name="layout" content="main"><%--  this tells  grails to to include "views/layouts/main.gsp" in this page http://stackoverflow.com/questions/1234290/how-does-grails-know-to-apply-a-layout-to-pages-it-renders --%>
<title>Welcome to BizGroup</title>
<g:javascript library="jquery"></g:javascript>
</head>


<body id="body">

	<div class="message notice">
		<h1>BizGroup Home page</h1>
		<p>Manage your rebates, see new opportunities to earn more!</p>
	</div>

	<g:link action="showTime" elementId="timeLink">Show the time!</g:link>
	<div id="time"></div>
	
	<br/>

	<g:if test="${!session?.user}">		<%--  user is not logged in  --%>
		<div class="colset clearfix"> 
		    <div id="loginBox">
                <g:render template="/user/loginBox"/>
            </div>
        </div>	
	</g:if>
	
		<%-- show new deals and suppliers --%>
		<div id="top5Panel" class="top5Panel" style="clear:both;">

			<ul id="tabs" class="tabs clearfix">
				<li class="selected"><a href="#suppliers">Latest Suppliers</a></li>
				<li><a href="#deals">Latest Deals</a></li>
			</ul>
           <p>
     
				<div id="suppliers" class="top5Item" style="clear:both;">
					<g:render template="/supplier/supplierList"
						model="[suppliers: top5Suppliers]"></g:render>
				</div>

				<div id="deals" class="top5Item" style="clear:both;display:none;">
					<g:render template="/supplierDeal/supplierDealList"
						model="[supplierDeals: top5SupplierDeals]"></g:render>
				</div>
			</div>	

<%-- 
search plug-in is not suppored in hinb 4.0 and there are no plans to do so. if need look for another search engine
		<div id="searchBox">
	        <h1>Instant Search</h1>
	        <g:textField id="searchField" name="searchField"/>
	        <div id="searchResults" name="searchPanel"></div>
    	</div>
    	<r:script>
			$("#searchField").keyup(function() {
			    $("#searchResults").load("${createLink(action: 'search')}?q="+this.value);
			});
		</r:script>
		--%>
</body>
	
<r:script>
			$('#timeLink').click(function() {
			    $('#time').load(this.href); return false;
				});
			
   			 $(function() {
   				 $('#loginForm').ajaxForm(function(result) {
       			 	$('#loginBox').html(result);
    			 });
			});
 
		    $("#tabs a").click(function(){
					        $("#suppliers, #deals").hide();
					        $("#tabs li").removeClass('selected');
					        $($(this).attr('href')).show();
					        $(this).parent().addClass('selected');
					        return false;
    		});

 </r:script>

</html>
