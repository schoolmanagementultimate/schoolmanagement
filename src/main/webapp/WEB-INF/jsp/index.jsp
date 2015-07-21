<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/bootstrap.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/app.css" />" rel="stylesheet">

</head>
<body>
	<div id="container">
		<div id="header" class="col-md-12 header">
			<span>SchoolForYou.com</span>
		</div>

		<div class="clear-both"></div>
		<div class="row" id="search">
			<div class="col-lg-12">
				<div class="input-group search-area">
					<div class="input-group-btn">
						<button type="button" class="btn btn-default dropdown-toggle"
							data-toggle="dropdown">
							Name <span class="caret"></span>
						</button>
						<ul class="dropdown-menu">
							<li><a href="#">Name</a></li>
							<li><a href="#">Area</a></li>
						</ul>
					</div>
					<input type="text" id="search-bar" class="form-control"
						placeholder="Enter text to search.."> 
					<span class="input-group-btn">
						<button class="btn btn-primary" type="submit" id="searchbtn">Search</button>
					</span>
				</div>
			</div>
		</div>
		
		<div id="slideshow">
			<div id="school-slideshow" class="carousel slide"
				data-ride="carousel" data-interval="3000">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#school-slideshow" data-slide-to="0"
						class="active"></li>
					<li data-target="#school-slideshow" data-slide-to="1"></li>
					<li data-target="#school-slideshow" data-slide-to="2"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner">
					<div class="item active">
						<img src="<c:url value="/resources/images/slide1.jpg" />" alt="..." class="slider">
						<div class="carousel-caption">
							<h3>Caption Text</h3>
						</div>
					</div>
					<div class="item">
						<img src="<c:url value="/resources/images/slide2.jpg" />" alt="..." class="slider">
						<div class="carousel-caption">
							<h3>Caption Text</h3>
						</div>
					</div>
					<div class="item">
						<img src="<c:url value="/resources/images/slide3.jpg" />" alt="..." class="slider">
						<div class="carousel-caption">
							<h3>Caption Text</h3>
						</div>
					</div>
				</div>

				<!-- Controls -->
				<a class="left carousel-control" href="#school-slideshow"
					role="button" data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left"></span>
				</a> <a class="right carousel-control" href="#school-slideshow"
					role="button" data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right"></span>
				</a>
			</div>
			<!-- Carousel -->
		</div>
		
		<div id="details-container">
			<div class="row">
				<div class="col-sm-4 inner-container">
					<h3>Announcements</h3>
					<div>Announcement 1 by school 1</div>
					<div>Announcement 1 by school 1</div>
					<div>Announcement 1 by school 1</div>
					<div>Announcement 1 by school 1</div>
				</div>
				
				<div class="col-sm-4 inner-container">
					
				</div>
				<div class="col-sm-4 inner-container">
					
				</div>
			</div>
		</div>
	</div>
</body>

<script src="<c:url value="/resources/js/jquery-1.11.3.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.js" />"></script>
<script src="<c:url value="/resources/js/app.js" />"></script>
</html>