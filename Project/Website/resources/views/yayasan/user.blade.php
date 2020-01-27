<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Yayasan - Data User</title>
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
				<div class="profile-usertitle-name">Yayasan</div>
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
			<li><a href="fpengajuan"><em class="fa fa-pencil">&nbsp;</em>Pengajuan</a></li>
			<li><a href="inventory"><em class="fa fa-briefcase">&nbsp;</em> Inventory</a></li>
			<li><a href="vendor"><em class="fa fa-users">&nbsp;</em> Vendor</a></li>
			<li class="active"><a href="user"><em class="fa fa-user">&nbsp;</em> User</a></li>
			<li><a href="approval"><em class="fa fa-check-square-o">&nbsp;</em> Approval</a></li>
			<li><a href="checkout"><em class="fa fa-credit-card-alt">&nbsp;</em> Check Out</a></li>
			<li><a href="report"><em class="fa fa-square"">&nbsp;</em> Report</a></li>
			<!-- <li class="parent "><a data-toggle="collapse" href="#sub-item-1">
				<em class="fa fa-navicon">&nbsp;</em> Multilevel <span data-toggle="collapse" href="#sub-item-1" class="icon pull-right"><em class="fa fa-plus"></em></span>
				</a>
				<ul class="children collapse" id="sub-item-1">
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Sub Item 1
					</a></li>
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Sub Item 2
					</a></li>
					<li><a class="" href="#">
						<span class="fa fa-arrow-right">&nbsp;</span> Sub Item 3
					</a></li>
				</ul>
			</li> -->
			<li><a href="../login.html"><em class="fa fa-power-off">&nbsp;</em> Logout</a></li>
		</ul>
	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#">
					<em class="fa fa-briefcase"></em>
				</a></li>
				<li class="active">User</li>
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter">
  					Tambah
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
						  	  	<label for="nama">Nama</label>
						    	<input type="text" class="form-control" id="nama" placeholder="Masukkan Nama Anda">
						  	</div>
						  	<div class="form-group">
						  	  	<label for="nip">NIP</label>
						    	<input type="text" class="form-control" id="nip" placeholder="Masukkan Kode NIP">
						  	</div>
						  	<div class="form-group">
						  	  	<label for="alamat">Alamat</label>
						    	<textarea type="text" class="form-control" id="alamat" placeholder="Masukkan Alamat"></textarea>
						  	</div>
						  	<div class="form-group">
						  	  	<label for="tml">Tempat Lahir</label>
						    	<input type="text" class="form-control" id="tml" placeholder="Masukkan Tempat Lahir">
						  	</div>
						  	<div class="form-group">
						  	  	<label for="tl">Taggal Lahir</label>
						    	<input type="date" class="form-control" id="tl" placeholder="Masukkan Tanggal Lahir">
						  	</div>
							<div class="form-group">
						  	  	<label for="jk">Jenis Kelamin</label></br>
						    	<input type="radio" name="gender" value="laki"> Laki-laki<br>
								<input type="radio" name="gender" value="perempuan"> Perempuan
						    </div>
						    <div class="form-group">
						  	  	<label for="no">No.Handphone</label>
						    	<input type="number" class="form-control" id="no" placeholder="Masukkan No.Handphone">
						  	</div>
						  	<div class="form-group">
						  	  	<label for="Umur">Umur</label>
						    	<input type="number" class="form-control" id="umur" placeholder="Masukkan Umur">
						  	</div>
						  	<div class="form-group">
						  	  	<label for="email">E-mail</label>
						    	<input type="email" class="form-control" id="email" placeholder="Masukkan email">
						  	</div>
						</form>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-primary" data-dismiss="modal">Simpan</button>
				        <button type="button" class="btn btn-danger">Hapus</button>
				      </div>
				    </div>
				  </div>
				</div>
			</ol>
		</div><!--/.row-->
		
		<div class="panel panel-container inventory">

			<div class="row data-item1">
				<div class="col-sm-2">
					<h3 class="text-center">Data Item</h3>
				</div>
				<div class="col-sm-1 col-sm-offset-7">
					<div class="button"><a class="btn btn-default btndataitem" href="">Copy</a></div>
				</div>
				<div class="col-sm-1">
					<div class="button"><a class="btn btn-default btndataitem" href="">Excel</a></div>
				</div>
				<div class="col-sm-1">
					<div class="button"><a class="btn btn-default btndataitem" href="">Pdf</a></div>
				</div><hr>
			</div><!--/.row-->

			<table class="table table-striped table-bordered table-responsive">
				<thead>
		          	<tr>
		              	<th>Aksi</th>
		              	<th>No</th>
		              	<th>Nama</th>
		              	<th>NIP</th>
		              	<th>Alamat</th>
		              	<th>Tempat Lahir</th>
		              	<th>Tanggal Lahir</th>
		              	<th>Jenis Kelamin</th>
		              	<th>No.Hp</th>
		              	<th>Umur</th>
		              	<th>E-mail</th>
		          	</tr>
		        </thead>

		        <tbody>
		          	<tr>
		            	<td><input type="checkbox"></td>
		            	<td>1</td>
		            	<td>Ardian</td>
		            	<td>09765</td>
		            	<td>Bandung</td>
		            	<td>Lampung</td>
		            	<td>17-10-2002</td>
		            	<td>Laki-laki</td>
		            	<td>0895332845179</td>
		            	<td>17</td>
		            	<td>ardian98@gmail.com</td>
		          	</tr>
		          	<tr>
		            	<td><input type="checkbox"></td>
		            	<td>1</td>
		            	<td>Ardian</td>
		            	<td>09765</td>
		            	<td>Bandung</td>
		            	<td>Lampung</td>
		            	<td>17-10-2002</td>
		            	<td>Laki-laki</td>
		            	<td>0895332845179</td>
		            	<td>17</td>
		            	<td>ardian98@gmail.com</td>
		          	</tr>
		          	<tr>
		            	<td><input type="checkbox"></td>
		            	<td>1</td>
		            	<td>Ardian</td>
		            	<td>09765</td>
		            	<td>Bandung</td>
		            	<td>Lampung</td>
		            	<td>17-10-2002</td>
		            	<td>Laki-laki</td>
		            	<td>0895332845179</td>
		            	<td>17</td>
		            	<td>ardian98@gmail.com</td>
		          	</tr>
		          	<tr>
		            	<td><input type="checkbox"></td>
		            	<td>1</td>
		            	<td>Ardian</td>
		            	<td>09765</td>
		            	<td>Bandung</td>
		            	<td>Lampung</td>
		            	<td>17-10-2002</td>
		            	<td>Laki-laki</td>
		            	<td>0895332845179</td>
		            	<td>17</td>
		            	<td>ardian98@gmail.com</td>
		          	</tr>
		          	<tr>
		            	<td><input type="checkbox"></td>
		            	<td>1</td>
		            	<td>Ardian</td>
		            	<td>09765</td>
		            	<td>Bandung</td>
		            	<td>Lampung</td>
		            	<td>17-10-2002</td>
		            	<td>Laki-laki</td>
		            	<td>0895332845179</td>
		            	<td>17</td>
		            	<td>ardian98@gmail.com</td>
		          	</tr>
		          	<tr>
		            	<td><input type="checkbox"></td>
		            	<td>1</td>
		            	<td>Ardian</td>
		            	<td>09765</td>
		            	<td>Bandung</td>
		            	<td>Lampung</td>
		            	<td>17-10-2002</td>
		            	<td>Laki-laki</td>
		            	<td>0895332845179</td>
		            	<td>17</td>
		            	<td>ardian98@gmail.com</td>
		          	</tr>
		          	<tr>
		            	<td><input type="checkbox"></td>
		            	<td>1</td>
		            	<td>Ardian</td>
		            	<td>09765</td>
		            	<td>Bandung</td>
		            	<td>Lampung</td>
		            	<td>17-10-2002</td>
		            	<td>Laki-laki</td>
		            	<td>0895332845179</td>
		            	<td>17</td>
		            	<td>ardian98@gmail.com</td>
		          	</tr>
		          	<tr>
		            	<td><input type="checkbox"></td>
		            	<td>1</td>
		            	<td>Ardian</td>
		            	<td>09765</td>
		            	<td>Bandung</td>
		            	<td>Lampung</td>
		            	<td>17-10-2002</td>
		            	<td>Laki-laki</td>
		            	<td>0895332845179</td>
		            	<td>17</td>
		            	<td>ardian98@gmail.com</td>
		          	</tr>
		          	<tr>
		            	<td><input type="checkbox"></td>
		            	<td>1</td>
		            	<td>Ardian</td>
		            	<td>09765</td>
		            	<td>Bandung</td>
		            	<td>Lampung</td>
		            	<td>17-10-2002</td>
		            	<td>Laki-laki</td>
		            	<td>0895332845179</td>
		            	<td>17</td>
		            	<td>ardian98@gmail.com</td>
		          	</tr>
		          	
		        </tbody>
			</table>
			
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