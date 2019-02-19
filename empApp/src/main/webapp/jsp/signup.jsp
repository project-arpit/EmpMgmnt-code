<%@ taglib prefix="form" 
uri="http://www.springframework.org/tags/form"%>			
				<div class="panel panel-info">
				<div class="panel-heading">
				<h3>New User Registration Form</h3>
				</div>
				<div class="panel-body">
				
				<div class="container-fluid">
				<form:form  method="post" 
				action="register.mvc" modelAttribute="user"
				class="form-horizontal">
				<div class="form-group">
				<label>Name</label>
				<form:input type="text"  path="name" class="form-control"/>
				<p><form:errors path="name" class="text-danger"/></p>
				</div>
				<div class="form-group">
				<label>MailId</label>
				<form:input type="text"  path="mailId" class="form-control"/>
				<p><form:errors path="mailId" class="text-danger"/></p>
				</div>
				<div class="form-group">
				<label>Password</label>
				<form:input type="password"  path="password" class="form-control"/>
				<p><form:errors path="password" class="text-danger"/></p>
				</div>
				</div>
				
				</div>
				<div class="panel-footer">
				<div class="form-group">
				<button type="submit" class="btn btn-primary">Register</button>
				</div>
				</form:form>
				</div>
				</div>
				
				
				
				
			
			
			
