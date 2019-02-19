				<div class="panel panel-info">
				<div class="panel-heading">
				<h3>Your Profile Details</h3>
				</div>
				<div class="panel-body">
				
				<div class="container-fluid">
				<form  method="post" 
				action="profileUpdate.mvc" 
				class="form-horizontal">
				<div class="form-group">
				<label>Name</label>
				<input type="text"  name="name" 
				class="form-control" value="${user.name}"/>
				</div>
				<div class="form-group">
				<label>MailId</label>
				<input type="text"  name="mailId" 
				class="form-control" value="${user.mailId}"/>
				</div>
				
				</div>
				
				</div>
				<div class="panel-footer">
				<div class="form-group">
				<button type="submit" class="btn btn-primary">Update</button>
				</div>
				</form>
				</div>
				</div>
				
				
				
				
			
			
			
