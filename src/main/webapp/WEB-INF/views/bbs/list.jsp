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
<link rel="stylesheet" href="<c:url value="/resources/style/default.css"/>" />
<link rel="stylesheet" href="<c:url value="/resources/style/input.css"/>" />
</head>
<body>
	<div id="pageContainer">
		<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
		<div style="padding-top:25px;text-align:center">
				[<a href="<c:url value="/bbs/write"/>">자료등록</a>]
				<br/><br/>
				
			<table border="1" style="width:600px" align="center">
				<tr style="background-color:orange;height:30px">
					<th style="width:50px">번호</th>
					<th style="width:400px">제목</th>
					<th style="width:150px;text-align:center">작성일</th>
				</tr>
				<c:forEach var="bbs" items="${bbslist}">
				<tr style="height:30px">
					<td>${bbs.bbsno}</td>
					<td style="text-align:left;padding-left:10px">
						<a href="<c:url value="/bbs/detail/${bbs.bbsno}"/>">${bbs.title}</a>
					</td>
					<td>
						<fmt:formatDate value="${bbs.regdate}" pattern="yyyy-MM-dd"/>
					</td>
				</tr>
				</c:forEach>
					
			</table>
				
		</div>
	</div>
		
		
</body>
</html>
