<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Home</title>
</head>
<body style="background-image:linear-color(red,yellow)">

<jsp:include page="menu.jsp"></jsp:include>


	<%
	String msg=(String)request.getAttribute("msg");
	
	Integer Status=(Integer)request.getAttribute("status");
	
	if(msg!=null){
		
		if(Status==1){
			
		%>	
			
			<h4 style="color:Green;">${msg}</h4>
				
		<%	
		}else{
	     
	     %>
			<h3 style="color:red;">${msg}</h3>
			
			<% 
			}
	
			}
		%>	
	

	<div class=img>
		<img src="images/Reneesh.jpg" class="image" width=100% height=100% alt="Reneesh">
	</div>

	<div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
	
	

</body>
</html>