<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<title>NewsFeed</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"
	href="static/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="static/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="static/css/animate.css">
<link rel="stylesheet" type="text/css" href="static/css/font.css">
<link rel="stylesheet" type="text/css" href="static/css/li-scroller.css">
<link rel="stylesheet" type="text/css" href="static/css/slick.css">
<link rel="stylesheet" type="text/css"
	href="static/css/jquery.fancybox.css">
<link rel="stylesheet" type="text/css" href="static/css/theme.css">
<link rel="stylesheet" type="text/css" href="static/css/style.css">
<!--[if lt IE 9]>
<script src="static/js/html5shiv.min.js"></script>
<script src="static/js/respond.min.js"></script>
<![endif]-->
</head>
<body>
	<div id="preloader">
		<div id="status">&nbsp;</div>
	</div>
	<a class="scrollToTop" href="#"><i class="fa fa-angle-up"></i></a>
	<div class="container">
		<header id="header">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12">
					<div class="header_top">
						<div class="header_top_left">
							<ul class="top_nav">
								<li><a href="index.html">Home</a></li>
								<li><a href="#">About</a></li>
								<li><a href="pages/contact.html">Contact</a></li>
							</ul>
						</div>
						<div class="header_top_right">
							<p>Friday, December 05, 2045</p>
						</div>
					</div>
				</div>
				<div class="col-lg-12 col-md-12 col-sm-12">
					<div class="header_bottom">
						<div class="logo_area">
							<a href="index.html" class="logo"><img src="images/logo.jpg"
								alt=""></a>
						</div>
						<div class="add_banner">
							<a href="#"><img src="images/addbanner_728x90_V1.jpg" alt=""></a>
						</div>
					</div>
				</div>
			</div>
		</header>
		<section id="navArea">
			<nav class="navbar navbar-inverse" role="navigation">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav main_nav">
						<jsp:include page="page/navBar.jsp"></jsp:include>
					</ul>
				</div>
			</nav>
		</section>
		<section id="newsSection">
			<div class="row">
				<jsp:include page="page/latestNews.jsp"></jsp:include>
			</div>
		</section>
		<section id="sliderSection">
			<div class="row">
				<div class="col-lg-8 col-md-8 col-sm-8">
					<div class="slick_slider">
						<jsp:include page="page/slider.jsp"></jsp:include>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4">
					<div class="latest_post">
						<jsp:include page="page/latestPost.jsp"></jsp:include>
					</div>
				</div>
			</div>
		</section>
		<section id="contentSection">
			<div class="row"><jsp:include page="${currentPage }"></jsp:include>
			</div>
		</section>
		<footer id="footer">
			<div class="footer_top">
				<div class="row">
					<jsp:include page="page/info.jsp"></jsp:include>
				</div>
			</div>
			<div class="footer_bottom">
				<p class="copyright">
					Copyright &copy; 2045 <a href="index.html">NewsFeed</a>
				</p>
				<p class="developer">Developed By Wpfreeware</p>
			</div>
		</footer>
	</div>
	<script src="static/js/jquery.min.js"></script>
	<script src="static/js/wow.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	<script src="static/js/slick.min.js"></script>
	<script src="static/js/jquery.li-scroller.1.0.js"></script>
	<script src="static/js/jquery.newsTicker.min.js"></script>
	<script src="static/js/jquery.fancybox.pack.js"></script>
	<script src="static/js/custom.js"></script>
</body>
</html>