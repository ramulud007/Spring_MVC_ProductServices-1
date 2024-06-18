
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Products</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body style="background-image: linear-gradient(red,yellow)">

<jsp:include page="menu.jsp"></jsp:include>

<form action="get-All-Products" method="get">
<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">Product Id</th>
      <th scope="col">Product Name</th>
      <th scope="col">Product Price</th>
      <th scope="col">Product QTY</th>
      <th scope="col">Supplier Id</th>
      <th scope="col">Category Id</th>
    </tr>
  </thead>
  
  <tbody>
    
    <c:forEach items="${products}" var="p">
    	<tr>
	    	<td>
	    	<c:out value="${p.productId}"></c:out>
	    	</td>
	    	<td>
	    	<c:out value="${p.productName}"></c:out>
	    	</td>
	    	<td>
	    	<c:out value="${p.productPrice}"></c:out>
	    	</td>
	    	<td>
	    	<c:out value="${p.productQTY}"></c:out>
	    	</td>
	    	<td>
	    	<c:out value="${p.supplierId}"></c:out>
	    	</td>
	    	<td>
	    	<c:out value="${p.categoryId}"></c:out>
	    	</td>
   	 	</tr>
    </c:forEach>
  
  </tbody>
  
</table>
</form>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>