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
		<div id="myPageInfo">
			<span class="img_profile"></span>
			<!-- 프로필 이미지 -->
			<div class="my_info">
				<h1>${u_email}</h1>
			</div>
		</div>
		
		<div id="myPageMenuWrap">
			<div id="myPageMenu">
				<div class="mypagemenu_wrap">
					<div class="table_row_div">
						<a href="settings.do">계정</a>
						<a href="resumes.do">내 프로필</a>
						<a href="reviews.do">활동내역</a>
					</div>
				</div>
			</div>
		</div>
		
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
		<div id="btn_write">
			<button type="button" onclick="location.href='resumeForm.do'">새로 작성하기</button>
		</div>
	</section>
	<footer>
		<jsp:include page="../include/footer.jsp"></jsp:include>
	</footer>
</body>
</html>