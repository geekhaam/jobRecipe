<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회사 추가</title>
	<link type="text/css" href="<c:url value="/resources/css/jobCSS.css" />" rel="stylesheet">
	<script type="text/javascript" src="<c:url value="/resources/js/jobJS.js"/>"></script>
	<script src="<c:url value='/resources/js/jquery-3.1.1.js'/>"></script>	
	
	<script>
	
		window.onload = function() {
			$("#company_search").hide();
		}
		
	</script>
	
</head>
<body>

	<h2>회사 검색</h2>

	<input type="text" id="c_name" name="c_name" placeholder="회사명" onclick=this.value="">
	<input type="button" value="검색" onclick="admin_company_search()">
	
	
	<div id="company_search">
		<table class="company_search_table">
			<c:choose>
				<c:when test="${empty vo }">
					<tr>
						<td colspan="2">해당하는 회사가 없습니다.</td>
					</tr>
				</c:when>
				<c:otherwise>
					<tr>
						<th>회사명</th>
						<td><input type="text" id="name1" name="c_name" value="${vo.c_name }" readonly="readonly">
					</tr>
					<tr>
						<th>회사위치</th>
						<td><input type="text" id="loc1" name="c_loc" value="${vo.c_loc }">
					</tr>
					<tr>
						<th>회사주소</th>
						<td><input type="text" id="addr1" name="c_addr" value="${vo.c_addr }">
					</tr>
					<tr>
						<td colspan="2">
							<input type="button" value="수정" onclick="admin_company_update()">
							<input type="button" value="삭제" onclick="admin_company_del()">
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<form action="insertAdvertiseForm.do" method="post">
								<input type="hidden" name="c_name" value="${vo.c_name }">
								<input type="hidden" name="c_loc" value="${vo.c_loc }">
								<input type="hidden" name="c_addr" value="${vo.c_addr }">
								<input type="submit" value="공고 입력">
							</form>
						</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
	
	<br><br><hr>

	<h2>회사 추가</h2>


	<table>
		<tr>
			<th>회사명</th>
			<td><input type="text" id="name" name="c_name"></td>
		</tr>
		<tr>
			<th>회사위치</th>
			<td><input type="text" id="loc" name="c_loc"></td>
		</tr>
		<tr>
			<th>회사주소</th>
			<td><input type="text" id="addr" name="c_addr"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="button" value="추가" onclick="admin_company_add()"></td>
		</tr>
	</table>



<!-- 유진 -->
</body>
</html>