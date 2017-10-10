<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<title>Login Page</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-3.2.1.min.js"></script>
</head>
<body>
<div class="container">
		<h2>Login Page</h2>
	<form method="post" action="LoginServlet">
			<div class="imgcontainer">
				<img alt="Avatar" src="images/login-icon.png" class="avatar">
			</div>
	
			<div class="form-group required">
				<label for="userid">User Id:</label>
				<input type="text" class="form-control" id="userid" placeholder="Enter User Id" name="userid" required="required"/>
			</div>
			<div class="form-group required">
				<label for="pwd">Password:</label>
				<input type="password" class="form-control" id="pwd" placeholder="Enter Password" name="pwd" required="required"/>
			</div>
			<div>
				<span class="login-box-options">
				New User?  <a href="register.jsp" style="margin-left:30px;">Register Here</a>
				</span>
			</div>
			<button type="submit" class="btn btn-default"><i class="fa fa-paper-plane" aria-hidden="true"></i>Login</button>
	</form>
</div>	
</body>
</html>