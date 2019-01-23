<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html style="height: 100%;" lang="en-US">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<title>Employee Portal</title>
<%@ include file="jsp/css_js.html" %>
</head>
<body>
	<div class="container">
		<div class="row">
			<jsp:include page="jsp/header.jsp" />
		</div>
		<!-- header  ends -->
		<hr />
		<div class="row">
			<div class="col-md-6 col-md-offset-6">
				<jsp:include page="jsp/login.jsp" />
			</div>
		</div>
	<!-- content  ends -->
	<hr />
	<div class="row">
		<jsp:include page="jsp/footer.jsp" />
	</div>
	<!-- footer ends -->
	</div>
	<!-- container  ends -->
</body>
</html>




