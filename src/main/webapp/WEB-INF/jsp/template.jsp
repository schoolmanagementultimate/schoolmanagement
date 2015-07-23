<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<tiles:importAttribute name="stylesheets"/>
<!DOCTYPE html>
<html>
<head>
<c:forEach var="cssValues" items="${stylesheets}">
	<link type="text/css" rel="stylesheet" href="<c:url value="${cssValues}"/>"/>
</c:forEach>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div>
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="body" />
	</div>
	<tiles:insertAttribute name="footer" />
	<tiles:importAttribute name="javascripts" />
	<c:forEach var="script" items="${javascripts}">
		<script type="text/javascript" src="<c:url value="${script}"/>"></script>
	</c:forEach>
</body>
</html>