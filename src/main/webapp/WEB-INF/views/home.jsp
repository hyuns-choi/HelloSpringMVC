<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" href="<c:url value="/resources/styles/default.css"/>" />
<link rel="stylesheet" href="<c:url value="/resources/styles/input.css"/>" />
</head>
<body>
	<div id="pageContainer">
		<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
	
		<div id="content">
			<br/><br/><br/>
			<h2 style="text-align:center">Welcome to Spring MVC!</h2>
		</div>
	</div>
		
		
</body>
</html>
