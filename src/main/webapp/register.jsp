<html>
<head>
<meta charset="utf-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<title>Registration Form</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-3.2.1.min.js"></script>
</head>
	<body>
		<div class="container">
				<h2>Registration Form</h2>
				<form action="RegisterServlet" method="POST">
					<div class="imgcontainer">
						<img alt="Avatar" src="images/login-icon.png" class="avatar">
					</div>
					
					<div class="form-group">
						<label for="firstname">First Name:</label>
						<input type="text" class="form-control" id="firstname" placeholder="Enter First Name" name="firstname"/>
					</div>
					<div class="form-group">
						<label for="middlename">Middle Name:</label>
						<input type="text" class="form-control" id="middlename" placeholder="Enter Middle Name" name="middlename"/>
					</div>
					<div class="form-group">
						<label for="lastname">Last Name:</label>
						<input type="text" class="form-control" id="lastname" placeholder="Enter Last Name" name="lastname"/>
					</div>
					<div class="form-group">
						<label for="email">Email:</label>
						<input type="email" class="form-control" id="email" placeholder="Enter Email" name="email"/>
					</div>
					<div class="form-group">
						<label for="userid">User Id:</label>
						<input type="text" class="form-control" id="userid" placeholder="Enter User Id" name="userid"/>
					</div>
					
					<div class="form-group">
						<label for="pwd">User Id:</label>
						<input type="password" class="form-control" id="pwd" placeholder="Enter Password" name="pwd"/>
					</div>
					
					<button type="submit" class="btn btn-default"><i class="fa fa-paper-plane" aria-hidden="true"></i>Submit</button>
					<button type="reset" class="btn btn-default"> Reset</button>
				
				</form>
		</div>
	</body>
</html>