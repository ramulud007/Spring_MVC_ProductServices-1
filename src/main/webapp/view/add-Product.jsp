
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

<jsp:include page="menu.jsp"></jsp:include>

<form action="add-Product" method="post">

<div class="container register">
	<div class="row">
		<div class="col-md-3 register-left">
			<img src="https://image.ibb.co/n7oTvU/logo_white.png" alt="" />
			<h3>Welcome</h3>
			<p>You are 30 seconds away from earning your own Product!</p>
		
		</div>
		<div class="col-md-9 register-right">
			<ul class="nav nav-tabs nav-justified" id="myTab" role="tablist">
				<li class="nav-item"><a class="nav-link active" id="home-tab"
					data-toggle="tab" href="#home" role="tab" aria-controls="home"
					aria-selected="true">Add Product</a></li>
				<li class="nav-item"><a class="nav-link" id="profile-tab"
					data-toggle="tab" href="#profile" role="tab"
					aria-controls="profile" aria-selected="false">Form</a></li>
			</ul>
			<div class="tab-content" id="myTabContent">
				<div class="tab-pane fade show active" id="home" role="tabpanel"
					aria-labelledby="home-tab">
					<h3 class="register-heading">Add Product</h3>
					<div class="row register-form">
						<div class="col-md-6">
							<div class="form-group">
								<input type="text" class="form-control"
									placeholder="PRODUCT Name *" name="productName" required="required" value="" />
							</div>
							<div class="form-group">
								<input type="number" class="form-control"
									placeholder="PRODUCT PRICE *" name="productPrice" required="required" value="" />
							</div>
							<div class="form-group">
								<input type="number" class="form-control"
									placeholder="PRODUCT QTY *" name="productQTY" required="required" value="" />
							</div>
							
							</div>
							<div class="form-group">
								<div class="form-group">
								<input type="number" min="1" class="form-control"
									placeholder="SUPPLIER ID *" name="supplierId" required="required" value="" />
								</div>
								
								<div class="form-group">
								<input type="number" min="1" class="form-control"
									placeholder="CATEGORY ID *" name="categoryId" required="required" value="" />
							</div>
							
							<input type="submit" class="btnRegister" value="Add Product" />
						</div>
					</div>
				 </div>			
			  </div>		
		    </div>				
	      </div>
	    </div>
      </form>
      <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>


