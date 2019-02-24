<%@ taglib uri="http://tiles.apache.org/tags-tiles" 
prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html style="height: 100%;" lang="en-US">
<head>
<meta http-equiv="content-type" content="text/html; charset=windows-1252">

<title><tiles:getAsString name="title"/></title>
 
<%@ include file="css_js.html" %>
</head>
<body> 
<br/>
<div class="container">
     
     
	<div class="row">
	<tiles:insertAttribute name="header"/>		
	</div><!-- header  ends -->
<hr/>
<div id="page" class="row">
<div class="col-md-2">
<c:choose>
<c:when test="${user.role == 1}">
<c:import url="userMenu.jsp" />
</c:when>
<c:otherwise>
<c:import url="adminMenu.jsp" />
</c:otherwise>
</c:choose>	
</div><!-- side bar ends -->
<div class="col-md-9 col-md-offset-1">
<tiles:insertAttribute name="body"/>
</div><!-- contents ends -->


</div><!-- contents  ends -->
<hr/>

<div id="footer" class="row">
			
<tiles:insertAttribute name="footer"/>
			
</div><!-- footer ends -->

</div><!-- container div ends -->
<br/>
</body>   
</html>			
		
		
