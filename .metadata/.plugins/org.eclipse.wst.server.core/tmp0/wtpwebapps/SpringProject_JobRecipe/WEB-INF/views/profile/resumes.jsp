<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>잡레시피</title>
<link type="text/css" href="<c:url value="/resources/css/jobCSS.css" />" rel="stylesheet">
<script type="text/javascript" src="<c:url value="/resources/js/jobJS.js"/>"></script>
</head>
<body>
	<header>
		<jsp:include page="../include/header.jsp"></jsp:include>
	</header>
	<section>
	<table>
		<thead>
			<tr>
				<th>이력서 제목</th>
				<th>관리</th>
				<th>최종수정일</th>
			</tr>
		</thead>
		<tbody>
		<c:choose>
			<c:when test="${resumeVOList.size() eq 0}">
				<tr>
					<td colspan="3">작성한 이력서가 없습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="resumeVO" items="${resumeVOList}">
				<tr>
					<td>${resumeVO.res_title}</td>
					<td>
						<button onclick="">수정</button>
						<button onclick="">삭제</button>
					</td>
					<td>${resumeVO.write_date}</td>
				</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
		</tbody>
	</table>
	</section>
	<footer>
		<jsp:include page="../include/footer.jsp"></jsp:include>
	</footer>
</body>
</html>