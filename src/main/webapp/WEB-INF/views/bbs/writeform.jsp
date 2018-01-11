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
<link rel="stylesheet" href="<c:url value="/resources/style/input2.css"/>" />
</head>
<body>
	<div id="pageContainer">
		<%@ include file="/WEB-INF/views/include/header.jsp" %>

		<div id="content">
			<br/><br/><br/>
			<div id="inputcontent">
				<div id="inputmain">
					<div class="inputsubtitle">자료등록정보</div>
					<form:form modelAttribute="bbsForm" method="post" enctype="multipart/form-data">
						<table>
							<tr>
								<th>제목</th>
								<td>
									<form:input path="title" style="width:580px" />
								</td>
							</tr>
							<tr>
								<th>작성자</th>
								<td>
									<form:input type="hidden" path="uploader" value="${sessionScope.loginUser.memberid}" />
									${sessionScope.loginUser.memberid}
								</td>
							</tr>
							<tr>
								<th>첨부자료</th>
								<td>
									<form:input type="file" path="files" multiple="multiple" style="width:580px;height:20px" />
								</td>
							</tr>
							<tr>
								<th>자료설명</th>
								<td>
									<form:textarea path="content" style="width:580px" rows="15"></form:textarea>
								</td>
							</tr>
						</table>
						<div class="buttons">
							<input type="submit" value="등록" style="height:25px" />
							<input type="button" value="취소" style="height: 25px"
							onclick="location.href='<c:url value="/bbs/list"/>'" />
						</div>
					</form:form>
				</div>
			</div>
		</div>
			
	
		
	</div>
		
		
</body>
</html>
