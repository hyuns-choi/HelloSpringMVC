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
					<div class="inputsubtitle">업로드자료정보</div>
					<table>
							<tr>
								<th>제목</th>
								<td>
									${bbs.title}
								</td>
							</tr>
							<tr>
								<th>작성자</th>
								<td>
									${bbs.uploader}
								</td>
							</tr>
							<tr>
								<th>조회수</th>
								<td>
									${bbs.readcount}
								</td>
							</tr>
							<tr>
								<th>등록일자</th>
								<td>
									<fmt:formatDate value="${bbs.regdate}" pattern="yyyy-MM-dd" />
								</td>
							</tr>
							<tr>
								<th>첨부자료</th>
								<td>
									<c:forEach var="file" items="${bbs.fileItems}">
										<a href="<c:url value="/bbs/download/${file.bbsfileno}"/>">
										${file.userfilename}
										</a> &nbsp; ${file.downloadcount}
									</c:forEach>
								</td>
							</tr>
							<tr>
								<th>자료설명</th>
								<td>
									${bbs.content}
								</td>
							</tr>
						</table>
						<div class="buttons">
							<input type="button" value="편집" style="height:25px" />
							<input type="button" value="취소" style="height: 25px" onclick="location.href='<c:url value="/bbs/list"/>'" />
						</div>
				</div>
			</div>
		</div>
			
	
		
	</div>
		
		
</body>
</html>
