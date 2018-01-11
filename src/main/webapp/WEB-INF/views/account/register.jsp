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
<title>회원등록</title>
<link rel="stylesheet" href="<c:url value="/resources/style/default.css"/>" />
<link rel="stylesheet" href="<c:url value="/resources/style/input.css"/>" />
</head>
<body>
	<div id="pageContainer">
		<%@ include file="/WEB-INF/views/include/header.jsp" %>
	
	
		<div id="inputcontent">
			<br/><br/><br/>
			<div id="inputmain">
				<div class="inputsubtitle">회원 기본 정보</div>
				
				<form:form modelAttribute="memberForm" method="post">
					<table>
						<tr>
							<th>아이디(id)</th>
							<td>
							<form:input path="memberid" cssStyle="width: 280px" />
							</td>
						</tr>
						<tr>
							<th>비밀번호</th>
							<td><form:input path="passwd" cssStyle="width: 280px" /></td>
						</tr>
						<tr>
							<th>비밀번호확인</th>
							<td><form:input path="passwd2" cssStyle="width: 280px" /></td>
						</tr>
						<tr>
							<th>이메일</th>
							<td><form:input path="email" cssStyle="width: 280px" /></td>
						</tr>
					</table>
					<div class="buttons">
						<input type="submit" value="등록" style="height: 25px" /> 
						<input type="button" value="취소" style="height: 25px"
							onclick="location.href='<c:url value="/"/>'" />
					</div>
				</form:form>
			</div>
		</div>
	</div>
		
		
</body>
</html>
