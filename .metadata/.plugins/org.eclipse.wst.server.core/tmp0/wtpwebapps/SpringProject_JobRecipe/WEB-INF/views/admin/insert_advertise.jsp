<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>채용 제목</th>
			<td><input type="text" name="ad_name" required="required"></td>
		</tr>
		<tr>
			<th>기업명</th>
			<td><input type="text" name="ad_name" value="${c_name }" readonly="readonly"></td>
		</tr>
		<tr>
			<th>위치</th>
			<td><input type="text" name="c_loc" value="${c_loc }" readonly="readonly"></td>
		</tr>
		<tr>
			<th>마감일</th>
			<td><input type="date" name="ad_date" required="required"></td>
		</tr>
		<tr>
			<th>직무</th>
			<td>
				<input type="text" name="ad_job" required="required">
				<input type="button" value="검색">
			</td>
		</tr>
		<tr>
			<th>경력</th>
			<td>
				<input type="checkbox" name="ad_carrBae" value="신입">신입
				<input type="checkbox" name="ad_carrBae" value="경력">경력
				<input type="checkbox" name="ad_carrBae" value="경력무관">경력무관
			</td>
		</tr>
		<tr>
			<th>고용형태</th>
		</tr>
		<tr>
			<th>스킬</th>
			<td><input type="text" name="ad_skill" required="required"></td>
		</tr>
		<tr>
			<th>주요업무</th>
			<td><input type="text" name="ad_upmy" required="required"></td>
		</tr>
		<tr>
			<th>자격요건</th>
		</tr>
		<tr>
			<th>우대사항</th>
		</tr>
		<tr>
			<th>채용절차</th>
		</tr>
		<tr>
			<th>복리후생</th>
		</tr>
		<tr>
			<th>기타</th>
		</tr>
		<tr>
			<th>회사 주소</th>
			<td><input type="text" name="c_addr" value="${c_addr }" readonly="readonly"> 
		</tr>
	</table>
<!-- 유진 -->
</body>
</html>