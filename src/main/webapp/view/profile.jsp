


<%@page import="com.jbk.Entity.User"%>
<html>

<head>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">

<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link rel="stylesheet" type="text/css" href="/css/addUser.css">


</head>

<body style="backgroung-color:linear-gradient(red,yellow)">

<%

User user=(User)request.getAttribute("user");

%>


<jsp:include page="menu.jsp"></jsp:include>


<form action="update-user" method="post">

<div class="container register">
	<div class="row">
		<div class="col-md-3 register-left">
			<img src="https://image.ibb.co/n7oTvU/logo_white.png" alt="" />
			<h3>Welcome</h3>
			<p>You are 30 seconds away from earning your own Product!</p>
		
		</div>
		<div class="col-md-9 register-right">
			
			<div class="tab-content" id="myTabContent">
				<div class="tab-pane fade show active" id="home" role="tabpanel"
					aria-labelledby="home-tab">
					<h3 class="register-heading">My Profile</h3>
					<div class="row register-form">
						<div class="col-md-6">
							<div class="form-group">
								<input type="text" class="form-control"
									placeholder="User Name *" name="userName" required="required" readonly="readonly" value="<%=user.getuserName() %>" />
							</div>
							<div class="form-group">
								<input type="text" class="form-control"
									placeholder="Last Name *" name="lastName" required="required" value="<%=user.getLastName() %>" />
							</div>
							<div class="form-group">
								<input type="password" class="form-control"
									placeholder="password *" name="password" required="required" min="10" max="10"; value="<%=user.getPassword() %>" />
							</div>
							<div class="form-group">
								<select class="form-control" name="role" required="required">
									<option><%=user.getRole() %></option>
									<option>Admin</option>
									<option>Employees</option>
								</select>

							</div>
							
							<%String gender=user.getGender();%>
							
							<%
							if(gender.equalsIgnoreCase("male")){
							%>
								
							 <label class="radio inline"> <input type="radio"
				     				name="gender" required="required" value="male" checked="checked"> <span>Male</span>
						   	 </label>
						   	 
							 <label class="radio inline"> <input type="radio"
									name="gender" value="female"> <span>Female </span>
					   		 </label>
							
							<%	
							}
							else{
								%>
									
							 <label class="radio inline"> <input type="radio"
									name="gender" required="required" value="male"> <span>Male</span>
							 </label> 
							
							 <label class="radio inline"> <input type="radio"
									name="gender" value="female" checked="checked"> <span>Female </span>
							 </label>
									
							<%	
							}
							%>
							
							
							<div class="form-group">
								<div class="maxl">
									
										
								</div>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<input type="email" class="form-control"
								 placeholder="Your Email *" name="email" required="required" value="<%=user.getEmail() %>" />
							</div>

							<div class="form-group">
								<input type="tel" min="10" max="10"
								 name="mobileNo" required="required" class="form-control"
								 placeholder="12314 53678" pattern="[0-9]{5} [0-9]{5}" value="<%=user.getMobileNo() %>" />
							</div>


						
							<div class="form-group">
								<select class="form-control" name="question" required="required">
								
								<option<%=user.getQuestion()%>>
									
									<option>What is your Birth Year?</option>
									<option>What is Your old Phone Number</option>
									<option>What is your Pet Name?</option>
								</select>

							</div>

							

							<div class="form-group">
								<input type="text" class="form-control"
								 placeholder="Enter Your Answer *" name="answer" required="required" value="<%=user.getAnswer() %>" />
							</div>

							<input type="submit" class="btnRegister" value="update" />
						</div>
					</div>
				 </div>			
			  </div>		
		    </div>				
	      </div>
	    </div>
      </form>
    </body>
</html>


