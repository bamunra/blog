<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div class="row">
	<div class="col-lg-12 col-md-12 col-sm-12">
		<div class="header_top">
			<div class="header_top_left">
				<ul class="top_nav">
					<li><a href="index.jsp">Home</a></li>
					<li><a href="/info">About</a></li>
					<li><a href="/contact">Contact</a></li>
				</ul>
			</div>
			<div class="header_top_right">
				<form action="/search" method="get">
					<div class="input-group" style="margin-top: 1em;">
						<input id="search" class="input-group-field" name="query"
							placeholder="Search query" type="text" value="${searchQuery }">
						<input class="button" value="Find" type="submit">
					</div>
				</form>
				<p>Friday, December 05, 2045</p>
			</div>
		</div>
	</div>
	<div class="col-lg-12 col-md-12 col-sm-12">
		<div class="header_bottom">
			<div class="logo_area">
				<a href="index.jsp" class="logo"><img src="images/logo.jpg"
					alt=""></a>
			</div>
			<div class="add_banner">
				<a href="#"><img src="images/addbanner_728x90_V1.jpg" alt=""></a>
			</div>
		</div>
	</div>
</div>