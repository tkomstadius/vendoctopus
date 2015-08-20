<jsp:useBean id="customer" class="customer.CustomerInfo" scope="session"/>
<jsp:setProperty name="customer" property="*"/>
<link href="../css/bootstrap.css" rel="stylesheet">
<link href="../style.css" rel="stylesheet">
<%@include file="header.jsp"%>
<%@include file="navbar.jsp"%>

<<<<<<< HEAD
=======



>>>>>>> df5512383319aea3449802c5a7567fd6fbd45b30
<div class="container">
	<div class="row">
		<div class="col-md-3">
			<h1 id="heading">S�k kund</h1>
		</div>
		<div class="col-md-3"></div>
		<div class="col-md-3">
			<div class="col-md-3"></div>
		</div>
	</div>

	<div class="row">
		<div class="col-md-6">
			<div class="input-group">
			

				<input type="text" class="form-control" placeholder="S�k p� personnummer" name="social">
				<span class="input-group-btn">
					<button class="btn btn-success" type="submit">Go!</button>
				</span>
				
			</div>
			<!-- /input-group -->

		</div>
		<div class="col-md-2"></div>
		<div class="col-md-2"></div>
		<div class="col-md-2"></div>

	</div>
	<div class="row" id="pInfoForm">
		<div class="col-md-6">
			<form role="form" method="post">
				<div class="form-group">
					<label for="sSecNumber">Personnummer:</label> 
					<input type="sSecNumber" class="form-control" id="sSecNumber" value="<%= customer.getSocial() %>" readonly>
				</div>
				<div class="form-group">
					<label for="pName">Namn:</label> <input type="pName"
						class="form-control" id="pName" value="<%= customer.getName() %>" name="name">
				</div>
<div class="form-group">
					<label for="pAdress">Adress:</label> <input type="pAdress"
						class="form-control" id="pAdress" value=" <%= customer.getAdress() %>" name="adress">
				</div>

<div class="form-group">
					<label for="pPostalNR">Postnummer:</label> <input type="pPostalNR"
						class="form-control" id="pPostalNR" value="<%= customer.getZip() %>" name="zip">
				</div>
				<button>�ndra</button>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
		<div class="col-md-2"></div>
		<div class="col-md-2"></div>
		<div class="col-md-2"></div>

	</div>
</div>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript">
	 $("#sSecNumber").prop(disabled, true);
</script>
<!--

//-->
</script>
</body>
</html>
