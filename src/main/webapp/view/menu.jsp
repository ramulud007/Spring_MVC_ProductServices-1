
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-primary">
  <a class="navbar-brand" href="#">PMS</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home-Page">Home <span class="sr-only">(current)</span></a>
      </li>
      
      <%
      if(session.getAttribute("role").equals("Admin")){
    	  %>  
    	 <li class="nav-item">
         	 <a class="nav-link" href="add-User-Page">Add-User</a>
        </li>  
    	  
    	  <li class="nav-item">
         	 <a class="nav-link" href="get-All-Users">List of Users</a>
        </li>
    	 
        <li class="nav-item">
          <a class="nav-link" href="add-Product-Page">Add-Product</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="get-All-Products">List of Product</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="get-User-By-Id?username=<%=session.getAttribute("username")%>"><%=session.getAttribute("username")%></a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link" href="/">Logout</a>
        </li>
        
        
        
        
    <%	  
      }
      else{
    	  %> 
    	   
    	 <li class="nav-item">
         	 <a class="nav-link" href="get-All-Users">List of Users</a>
        </li>
    	 
        <li class="nav-item">
          <a class="nav-link" href="add-Product-Page">Add-Product</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="get-All-Products">List of Product</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="get-User-By-Id?username=<%=session.getAttribute("username")%>"><%=session.getAttribute("username")%></a>
        </li>
         <li class="nav-item">
           <a class="nav-link" href="/">Logout</a>
        </li>
        
        
     <%	  
      }
      
      %>
      
    
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

</body>

</html>


