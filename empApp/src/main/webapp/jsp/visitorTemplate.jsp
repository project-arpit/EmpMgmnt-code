<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html style="height: 100%;" lang="en-US">
<head>
<meta http-equiv="content-type"
	content="text/html; charset=windows-1252">

<title><tiles:getAsString name="title" /></title>

<%@ include file="css_js.html"%>
</head>
<body>
	<br />
	<div class="container">


		<div class="row">
			<tiles:insertAttribute name="header" />
		</div>
		<!-- header  ends -->
		<hr />
		<div id="page" class="row">
			<tiles:insertAttribute name="body" />

		</div>
		<!-- contents  ends -->
		<hr />

		<div id="footer" class="row">

			<tiles:insertAttribute name="footer" />

		</div>
		<!-- footer ends -->

	</div>
	<!-- container div ends -->
	<br />
</body>
</html>


