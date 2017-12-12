<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Women's Fashion a Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Women's Fashion Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/fasthover.css" rel="stylesheet" type="text/css" media="all" />
<script src="https://www.gstatic.com/firebasejs/4.7.0/firebase.js"></script>
<!-- js -->
<script src="js/jquery.min.js"></script>
<script src="js/crearCatalogo.js"></script>
<!-- //js -->
<!-- countdown -->
<link rel="stylesheet" href="css/jquery.countdown.css" />
<!-- //countdown -->
<!-- cart -->
<script src="js/simpleCart.min.js"></script>
<script src="js/fire.js"></script>
<script src="js/login.js"></script>
<!-- cart -->
<!-- for bootstrap working -->
<script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>
<!-- //for bootstrap working -->
<link href="https://fonts.googleapis.com/css?family=Glegoo:400,700" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">

<!-- start-smooth-scrolling -->
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- //end-smooth-scrolling -->
</head>
	
<body onload="crearCatalogo()">
<!-- header -->
	<div class="modal fade" id="myModal88" tabindex="-1" role="dialog" aria-labelledby="myModal88"
		aria-hidden="true">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
					<div class="modal-header" style="margin-top: 1.5em; padding-bottom: 1.5em;">
							<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
								&times;</button>
								<div class="col-md-6">
										<h4 class="modal-title" id="myModalLabel">
												Don't Wait, Login now!<br>Sign in with
											</h4>
								</div>
							<div class="col-md-6" >
									<ul class="social">
										<li class="social_facebook" ><a class="entypo-facebook" id="facebook" onclick="login(this)"></a></li>
										<li class="social_dribbble"><a class="entypo-dribbble" id="google" onclick="login(this)"></a></li>												
									</ul>
							</div>								
						</div>
				<div class="modal-body modal-body-sub">
						<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
						<script type="text/javascript">
							$(document).ready(function () {
								$('#horizontalTab').easyResponsiveTabs({
									type: 'default', //Types: default, vertical, accordion           
									width: 'auto', //auto or any width like 600px
									fit: true   // 100% fit in a container
								});
							});
						</script>
					
				</div>
			</div>
		</div>
	</div>
	<script>
		$('#myModal88').modal('show');
	</script>
	<div class="header">
		<div class="container">
			<div class="w3l_login">
				<a href="#" data-toggle="modal" data-target="#myModal88"><span class="glyphicon glyphicon-user" aria-hidden="true"></span></a>
			</div>
			<div class="w3l_logo">
				<h1><a href="index.html">Kitty Shop<span>Hipster cats</span></a></h1>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<hr>
<!-- //header -->
<!-- banner -->
	<div class="banner" id="home1">
		<div class="container">
			<h3>Lovely kitties <span>with moustache.</span></h3>
		</div>
	</div>
<!-- //banner -->
	<div class="row special-deals">
		<h2>Los gatitos más bonitos del condado</h2>
		<div class="col-md-3"></div>
		<div class="col-md-6">
				<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, 
						nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem.</p>
		</div>		
	</div>
<!-- banner-bottom -->
	<div class="banner-bottom">
		<div class="container">			
			<div class="col-md-12 wthree_banner_bottom_right">
				<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">					
					<div id="myTabContent" class="tab-content">
						<div role="tabpanel" class="tab-pane fade active in" id="home" aria-labelledby="home-tab">
							<div class="agile_ecommerce_tabs" id="aquiVanPeque">
								<!aqui van miniaturas del catalogo>																					
								<div class="clearfix"> </div>
							</div>
						</div>						
					</div>
				</div>
					<!--modal-video-->
					<div id="aquiVanDetalles">
						<!aqui van detalles>
					</div>								
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
<!-- //banner-bottom -->


<!-- //newsletter -->
<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="w3_footer_grids">				
				<div class="col-md-3 w3_footer_grid">					
					<h4>Follow Us</h4>
					<div class="agileits_social_button">
						<ul>
							<li><a href="#" class="facebook"> </a></li>
							<li><a href="#" class="twitter"> </a></li>
							<li><a href="#" class="google"> </a></li>
							<li><a href="#" class="pinterest"> </a></li>
						</ul>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="footer-copy">
			<div class="footer-copy1">
				<div class="footer-copy-pos">
					<a href="#home1" class="scroll"><img src="images/arrow.png" alt=" " class="img-responsive" /></a>
				</div>
			</div>
			<div class="container">
				<p>&copy; 2016 Women's Fashion. All rights reserved | Design by <a href="http://w3layouts.com/">W3layouts</a></p>
			</div>
		</div>
	</div>
<!-- //footer -->
</body>
</html>
