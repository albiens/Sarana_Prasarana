<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Kepsek - PBJ-K</title>
	<link type="text/css" href="/assets/css/bootstrap.min.css" rel="stylesheet">
	<link type="text/css" href="/assets/css/font-awesome.min.css" rel="stylesheet">
	<link type="text/css" href="/assets/css/datepicker3.css" rel="stylesheet">
	<link type="text/css" href="/assets/css/styles.css" rel="stylesheet">
	<link type="text/css" href="/assets/css/mystyle.css" rel="stylesheet">
	
	<!--Custom Font-->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
	<!--[if lt IE 9]>
	<script src="js/html5shiv.js"></script>
	<script src="js/respond.min.js"></script>
	<![endif]-->
</head>
<body>
	<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse"><span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span></button>
				<a class="navbar-brand" href="#"><span>W-</span>SARPRAS</a>
				<ul class="nav navbar-top-links navbar-right">
					<li class="dropdown"><a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
						<em class="fa fa-envelope"></em><span class="label label-danger">15</span>
					</a>
						<ul class="dropdown-menu dropdown-messages">
							<li>
								<div class="dropdown-messages-box"><a href="profile.html" class="pull-left">
									<img alt="image" class="img-circle" src="http://placehold.it/40/30a5ff/fff">
									</a>
									<div class="message-body"><small class="pull-right">3 mins ago</small>
										<a href="#"><strong>John Doe</strong> commented on <strong>your photo</strong>.</a>
									<br /><small class="text-muted">1:24 pm - 25/03/2015</small></div>
								</div>
							</li>
							<li class="divider"></li>
							<li>
								<div class="dropdown-messages-box"><a href="profile.html" class="pull-left">
									<img alt="image" class="img-circle" src="http://placehold.it/40/30a5ff/fff">
									</a>
									<div class="message-body"><small class="pull-right">1 hour ago</small>
										<a href="#">New message from <strong>Jane Doe</strong>.</a>
									<br /><small class="text-muted">12:27 pm - 25/03/2015</small></div>
								</div>
							</li>
							<li class="divider"></li>
							<li>
								<div class="all-button"><a href="#">
									<em class="fa fa-inbox"></em> <strong>All Messages</strong>
								</a></div>
							</li>
						</ul>
					</li>
					<li class="dropdown"><a class="dropdown-toggle count-info" data-toggle="dropdown" href="#">
						<em class="fa fa-bell"></em><span class="label label-info">5</span>
					</a>
						<ul class="dropdown-menu dropdown-alerts">
							<li><a href="#">
								<div><em class="fa fa-envelope"></em> 1 New Message
									<span class="pull-right text-muted small">3 mins ago</span></div>
							</a></li>
							<li class="divider"></li>
							<li><a href="#">
								<div><em class="fa fa-heart"></em> 12 New Likes
									<span class="pull-right text-muted small">4 mins ago</span></div>
							</a></li>
							<li class="divider"></li>
							<li><a href="#">
								<div><em class="fa fa-user"></em> 5 New Followers
									<span class="pull-right text-muted small">4 mins ago</span></div>
							</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div><!-- /.container-fluid -->
	</nav>
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<div class="profile-sidebar">
			<div class="profile-userpic">
				<img src="/assets/img/pilogo.png" class="img-responsive" alt="">
			</div>
			<div class="profile-usertitle">
				<div class="profile-usertitle-name">Kepsek</div>
				<div class="profile-usertitle-status"><span class="indicator label-success"></span>Online</div>
			</div>
			<div class="clear"></div>
		</div>
		<div class="divider"></div>
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<ul class="nav menu">
			<li><a href="index"><em class="fa fa-home">&nbsp;</em> Home</a></li>
			<li><a href="approval"><em class="fa fa-check-square-o">&nbsp;</em> Approval</a></li>
			<li class="active"><a href="fpengajuan"><em class="fa fa-pencil">&nbsp;</em>Pengajuan</a></li>


			<li><a href="../login.html"><em class="fa fa-power-off">&nbsp;</em> Logout</a></li>
		</ul>
	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#">
					<em class="fa fa-briefcase"></em>
				</a></li>
				<li class="active">PBJ-K</li>
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">
  					Tambah Barang
				</button>

				<!-- Modal -->
				<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
				  <div class="modal-dialog modal-dialog-centered" role="document">
				    <div class="modal-content">
				      <div class="modal-header">
				        <h2 class="modal-title text-center" id="exampleModalLongTitle">Tambah Barang</h2>
				        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
				          <span aria-hidden="true">&times;</span>
				        </button>
				      </div>
				      <div class="modal-body col-sm-10 col-sm-offset-1">
				        <form>
						  	<div class="form-group">
						  	  	<label>Nama Barang</label>
						    	<input type="text" class="form-control" placeholder="Masukkan Nama Barang">
						  	</div>
						  	<div class="form-group">
						  	  	<label>QYT</label>
						    	<input type="text" class="form-control" placeholder="Masukkan QYT">
						  	</div>
						  	<div class="form-group">
						  	  	<label>Perkiraan Harta</label>
						    	<input type="text" class="form-control" placeholder="Masukkan Harga">
						  	</div>
						</form>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-primary" data-dismiss="modal">Simpan</button>
				        <button type="reset" class="btn btn-danger">Reset</button>
				      </div>
				    </div>
				  </div>
				</div>
			</ol>
		</div><!--/.row-->
		
		<div class="panel panel-container">

			<center><h2>FORM PBJ-K</h2></center>
			<br>
			<br>

			<div class="row">
				<form class="col-sm-8 col-sm-offset-1">
				  	<div class="form-group row">
				    	<label class="col-sm-2 col-form-label">Diminta Oleh</label>
				    	<div class="col-sm-4">
				      		<input type="text" class="form-control"  placeholder="Diminta Oleh">
				    	</div>
				    	<label class="col-sm-1 col-form-label">Tanggal</label>
				    	<div class="col-sm-4">
				      		<input type="date" class="form-control" >
				    	</div>
				  	</div>
				</form>
				<form class="col-sm-8 col-sm-offset-1">
				  	<div class="form-group row">
				    	<label class="col-sm-2 col-form-label">Jabatan</label>
				    	<div class="col-sm-4">
				      		<input type="text" class="form-control" placeholder="Isi Jabatan">
				    	</div>
				    	<label class="col-sm-1 col-form-label">Bidang</label>
				    	<div class="col-sm-4">
				      		<input type="text" class="form-control" placeholder="Isi Bidang">
				    	</div>
				  	</div>
				</form>
				<form class="col-sm-8 col-sm-offset-1">
				  	<div class="form-group row">
				    	<label class="col-sm-2 col-form-label">Tgl Dibutuhkan</label>
				    	<div class="col-sm-4">
				      		<input type="date" class="form-control"  >
				    	</div>
				  	</div>
				</form>
			</div><!--/.row-->

		</br>
	    </br>
			

			<div class="row">
			 <div class = "col-md-10 col-sm-offset-1">
				<table class="table table-striped table-bordered table-responsive">
					<tr>
		              	<th>No</th>
		              	<th>Nama Barang</th>
		              	<th>QYT</th>
		              	<th>Perkiraan Harga</th>
		          	</tr>
		        </thead>

		        <tbody>
		          	<tr>
		            	<td>1</td>
		            	<td>Meja</td>
		            	<td>20</td>		        
		            	<td>99.000,00</td>
		          	</tr>
		          	<tr>
		            	<td>2</td>
		            	<td>Meja</td>
		            	<td>20</td>
		            	<td>48.000,00</td>
		          	</tr>
		          	<tr>
		            	<td>3</td>
		            	<td>Meja</td>
		            	<td>20</td>
		            	<td>52.000,00</td>
		          	</tr>
		          	<tr>
		            	<td>4</td>
		            	<td>Meja</td>
		            	<td>20</td>
		            	<td>145.000,00</td>
		          	</tr>
		          	<tr>
		            	<td>5</td>
		            	<td>Meja</td>
		            	<td>20</td>
		            	<td>145.000,00</td>
		          	</tr>
		        </tbody>
			</table>
			<form>
			<div class="form-group">
				<label>Alasan  :</label>
				<textarea style="margin-bottom: 10px;  height:150px;" name="alasan" class="col-md-12"></textarea>
			</div>
		    <br>
			<div>
				<button type="button" class="btn btn-primary" data-dismiss="modal">Submit</button>
				<button type="button" class="btn btn-danger"><a href="fpengajuan">Kembali</a></button>
			</div><!--/.row-->	
		</div>
	</div>	<!--/.main-->
	
	<script type="text/javascript" src="/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/js/chart.min.js"></script>
	<script type="text/javascript" src="/js/chart-data.js"></script>
	<script type="text/javascript" src="/js/easypiechart.js"></script>
	<script type="text/javascript" src="/js/easypiechart-data.js"></script>
	<script type="text/javascript" src="/js/bootstrap-datepicker.js"></script>
	<script type="text/javascript" src="/js/custom.js"></script>
	<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
	<script type="text/javascript" src="/js/myjs.js"></script>
	<script>

		window.onload = function () {
	var chart1 = document.getElementById("line-chart").getContext("2d");
	window.myLine = new Chart(chart1).Line(lineChartData, {
	responsive: true,
	scaleLineColor: "rgba(0,0,0,.2)",
	scaleGridLineColor: "rgba(0,0,0,.05)",
	scaleFontColor: "#c5c7cc"
		});
	};

	</script>
		
</body>
</html>