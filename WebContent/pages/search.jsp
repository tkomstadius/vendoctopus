<jsp:useBean id="customer" class="customer.CustomerInfo" scope="session"/>
<jsp:setProperty name="customer" property="*"/>
<link href="../css/bootstrap.css" rel="stylesheet">
<link href="../style.css" rel="stylesheet">
<%@include file="header.jsp"%>
<%@include file="navbar.jsp"%>

<div class="container">
	<div class="row">
		<div class="col-md-3">
			<h1 id="heading">Sök kund</h1>
		</div>
		<div class="col-md-3"></div>
		<div class="col-md-3">
			<div class="col-md-3"></div>
		</div>
	</div>

	<div class="row">
		<div class="col-md-6">
			
				<form method="POST">
					<input type="text" class="form-control" placeholder="Sök på personnummer" name="social">
					<span class="input-group-btn">
						<button class="btn btn-success" type="submit" id="searchNum">Go!</button>
					</span>
				</form>
			
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
					<input type="number" class="form-control" id="sSecNumber" value="<%= customer.getSocial() %>" placeholder="Personnummer">
				</div>
				<div class="form-group">
					<label for="pName">Namn:</label> <input type="text"
						class="form-control" id="pName" value="<%= customer.getName() %>" placeholder="För- och Efternamn" name="name">
				</div>
<div class="form-group">
					<label for="pAdress">Adress:</label> <input type="text"
						class="form-control" id="pAdress" value="<%= customer.getAdress() %>" placeholder="Adress" name="adress">
				</div>

<div class="form-group">
					<label for="pPostalNR">Postnummer:</label> <input type="number"
						class="form-control" id="pPostalNR" value="<%= customer.getZip() %>" placeholder="Postnummer" name="zip">
				</div>
				<button type="submit" class="btn btn-success"  id="send" >Spara ändringar</button>
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

</script>
</body>
</html>
