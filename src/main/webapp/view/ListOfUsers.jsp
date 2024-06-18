<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.jbk.Entity.User"%>
<%@page import="org.springframework.beans.factory.annotation.Autowired"%>
<%@page import="com.jbk.Dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>List Of Users</title>
</head>
<body style="background-image: linear-gradient(red,yellow)">

<jsp:include page="menu.jsp"></jsp:include>
<br>
<br>
<form action="get-All-Users" method="get">
<table class="table table-bordered">
  
  <thead>
    <tr>
     
      
       <%
  if(session.getAttribute("role").equals("Admin")){
	  %>
      <th scope="col">User Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Password</th>
      <th scope="col">Role</th>
      <th scope="col">Gender</th>
      <th scope="col">E-Mail</th>
	  <th scope="col">Mobile Number</th>
      <th scope="col">Question</th>
      <th scope="col">Answer</th>
      <th scope="col">Action</th>
    <%  
  }else{
	  %>
	  <th scope="col">User Name</th>
      <th scope="col">Last Name</th>
	  <th scope="col">E-Mail</th>
	  <th scope="col">Mobile Number</th>
      <th scope="col">Gender</th>
	  
   <%
  }
  %>
      
     
      
      
    </tr>  
  </thead>
  
  
  <tbody>

 <c:forEach items="${users}" var="u">
  
  <tr>
  
  
  <%
  if(session.getAttribute("role").equals("Admin")){
	  %>
	  
  	  <td> <c:out value="${u.userName}"></c:out> </td>
  	  <td> <c:out value="${u.lastName}"></c:out> </td>
	  <td> <c:out value="${u.password}"></c:out> </td>
	  <td> <c:out value="${u.role}"></c:out> </td>
	  <td> <c:out value="${u.gender}"></c:out> </td>
	  <td> <c:out value="${u.email}"></c:out> </td>
	  <td> <c:out value="${u.mobileNo}"></c:out> </td>
	  <td> <c:out value="${u.question}"></c:out> </td>
  	  <td> <c:out value="${u.answer}"></c:out> </td>
	  
	  
	  <td>
    	<a class="btn btn-danger btn-sm around-7" href="delete-User-By-Id?username=<c:out value="${u.userName}"></c:out>">Delete</a> |
 		<a class="btn btn-success btn-sm around-7" href="get-User-By-Id?username=<c:out value="${u.userName}"></c:out>">Edit</a>
 	  </td>
	  
	  
	  <%  
  }else{
	  %>
 	   <td> <c:out value="${u.userName}"></c:out> </td>
  	   <td> <c:out value="${u.lastName}"></c:out> </td>
	   <td> <c:out value="${u.email}"></c:out> </td>
	   <td> <c:out value="${u.mobileNo}"></c:out> </td>
	   <td> <c:out value="${u.gender}"></c:out> </td>
  <%
  }
  %>
  
  
  
  	
  
  
  </tr>
 
  </c:forEach>
 
  
  </tbody>
  
</table>

</form>

<br>
<br>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>