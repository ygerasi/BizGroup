<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<meta name="layout" content="main">
		<title>BizGroup Admin</title>
		<g:javascript library="jquery"></g:javascript>
	</head>
	<body id="body">
		<div id="controller-list" role="navigation">
				<h2>Available Controllers:</h2>
				<ul>
					<g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
						<li class="controller"><g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link></li>
					</g:each>
				</ul>
		</div>
	</body>	
</html>
