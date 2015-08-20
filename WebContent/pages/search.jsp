
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
			<div class="input-group">
			
			<form action="sample.jsp" method="POST">
				<input type="search" class="form-control" placeholder="Sök kunder">
				<span class="input-group-btn">
					<button class="btn btn-success" type="button">Go!</button>
				</span>
				</form>
			</div>
			<!-- /input-group -->

		</div>
		<div class="col-md-2"></div>
		<div class="col-md-2"></div>
		<div class="col-md-2"></div>

	</div>
	<div class="row" id="pInfoForm">
		<div class="col-md-6">
			<form role="form">
				<div class="form-group">
					<label for="sSecNumber">Personnummer:</label> <input
						type="sSecNumber" class="form-control" id="sSecNumber">
				</div>
				<div class="form-group">
					<label for="pName">Namn:</label> <input type="pName"
						class="form-control" id="pName">
				</div>
<div class="form-group">
					<label for="pAdress">Adress:</label> <input type="pAdress"
						class="form-control" id="pAdress">
				</div>

<div class="form-group">
					<label for="pPostalNR">Postnummer:</label> <input type="pPostalNR"
						class="form-control" id="pPostalNR">
				</div>

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
</body>
</html>
