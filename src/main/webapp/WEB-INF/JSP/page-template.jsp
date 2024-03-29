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
			<jsp:include page="fragment/header.jsp"></jsp:include>
		</header>

		<section id="contentSection">
			<jsp:include page="${currentPage }"></jsp:include>
		</section>
		<footer id="footer">
			<jsp:include page="fragment/footer.jsp"></jsp:include>
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