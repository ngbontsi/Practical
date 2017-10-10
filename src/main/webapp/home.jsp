<%@page import="java.util.List"%>
<%@page import="com.bontsi.service.LoginService"%>
<%@page import="java.util.Date"%>
<%@page import="com.bontsi.models.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <link href="css/style.css" rel="stylesheet" type="text/css" />
	<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
	    <link href="https://fonts.googleapis.com/css?family=Oleo+Script:400,700" rel="stylesheet">
   	<link href="https://fonts.googleapis.com/css?family=Teko:400,700" rel="stylesheet">
	<link href="font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery-3.2.1.min.js"></script>
     <title>Result Page</title>
</head>
<body>
<center>
     <div id="container">
         <h1>Result Page</h1>
             <b>This is Sample Result Page</b><br/>
             <%=new Date()%></br>
             <%
                 User user = (User) session.getAttribute("user");
             %>     
             <b>Welcome <%= user.getFirstName() + " " + user.getLastName()%></b>     
             <br/>
             <a href="logout.jsp">Logout</a>
         </p>
 
         <table>
             <thead>
                 <tr>
                     <th>User ID</th>
                     <th>First Name</th>
                     <th>Middle Name</th>
                     <th>Last Name</th>
                     <th>email</th>                
                 </tr>
             </thead>
             <tbody>
                 <%
                     LoginService loginService = new LoginService();
                     List<User> list = loginService.getListOfUsers();
                     for (User u : list) {
                 %>
                 <tr>
                     <td><%=u.getUserId()%></td>
                     <td><%=u.getFirstName()%></td>
                     <td><%=u.getMiddleName()%></td>
                     <td><%=u.getLastName()%></td>
                     <td><%=u.getEmail()%></td>
                 </tr>
                 <%}%>
             <tbody>
         </table>    
         <br/>
     </div>
    </center>
<section id="contact">
			<div class="section-content">
				<h1 class="section-header">Calculate <span class="content-header wow fadeIn " data-wow-delay="0.2s" data-wow-duration="2s"> Your Investments</span></h1>
				<h3>Below enter your investment plan and submit to get predicted amounts</h3>
			</div>
			<div class="contact-section">
			<div class="container">
				<form>
					<div class="col-md-6 form-line">
			  			<div class="form-group">
			  				<label for="exampleInputUsername">Your starting capital</label>
					    	<input type="text" class="form-control" id="" placeholder=" Enter starting capital">
				  		</div>
				  		<div class="form-group">
					    	<label for="exampleInputEmail">Expected amount</label>
					    	<input type="email" class="form-control" id="exampleInputEmail" placeholder=" Enter Expected amount">
					  	</div>	
					  	<div class="form-group">
					    	<label for="telephone">Number of years</label>
					    	<input type="tel" class="form-control" id="telephone" placeholder=" Enter number of years.">
			  			</div>
			  			<div class="dropdown">
						    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Inflation
						    <span class="caret"></span></button>
						    <ul class="dropdown-menu">
						      <li>6%</li>
						      <li>9%</li>
						      <li>10%</li>
						    </ul>
						  </div>
			  			
			  		</div>
			  		<div class="col-md-6">
			  			 <h2>Dynamic Tabs</h2>
						  <ul class="nav nav-tabs">
						    <li class="active"><a data-toggle="tab" href="#home">Home</a></li>
						    <li><a data-toggle="tab" href="#menu1">Menu 1</a></li>
						    <li><a data-toggle="tab" href="#menu2">Menu 2</a></li>
						    <li><a data-toggle="tab" href="#menu3">Menu 3</a></li>
						  </ul>
						
						  <div class="tab-content">
						    <div id="home" class="tab-pane fade in active">
						      <h3>HOME</h3>
						      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
						    </div>
						    <div id="menu1" class="tab-pane fade">
						      <h3>Menu 1</h3>
						      <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
						    </div>
						    <div id="menu2" class="tab-pane fade">
						      <h3>Menu 2</h3>
						      <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>
						    </div>
						    <div id="menu3" class="tab-pane fade">
						      <h3>Menu 3</h3>
						      <p>Eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
						    </div>
						  </div>
			  			
					</div>
				</form>
			</div>
		</section>    
    
</body>
</html>