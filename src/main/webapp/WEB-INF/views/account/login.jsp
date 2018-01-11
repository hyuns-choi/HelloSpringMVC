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
	
	
		<div id="inputcontent">
			<br/><br/><br/>
			<div id="inputmain">
				<div class="inputsubtitle">로그인정보</div>
				
				<form action="<c:url value="/account/login"/>" method="post">
					<table>
						<tr>
							<th>아이디(id)</th>
							<td><input type="text" name="memberid" style="width: 280px" />
							</td>
						</tr>
						<tr>
							<th>비밀번호</th>
							<td><input type="password" name="passwd"
								style="width: 280px" /></td>
						</tr>
					</table>
					<div class="buttons">
						<input type="submit" value="로그인" style="height: 25px" /> 
						<input type="button" value="취소" style="height: 25px"
							onclick="location.href='<c:url value="/"/>'" />
					</div>
				</form>
			</div>
		</div>
	</div>
		
		
</body>
</html>
