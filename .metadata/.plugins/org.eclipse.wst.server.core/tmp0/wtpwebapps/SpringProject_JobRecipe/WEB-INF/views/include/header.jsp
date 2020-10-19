<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

<!-- <script type="text/javascript">
	function test(){
		
		if(document.getElementById("test").style.display=='none')
			document.getElementById("test").style.display='flex';
		else
			document.getElementById("test").style.display='none';
	}	
</script>
 -->
</head>
<body>
	<div 
	style="display:flex; flex-direction: row; justify-content: space-between; flex-wrap: nowrap;line-height:7vh"
	>
		<div style="display:flex; flex-direction: row; flex-wrap: nowrap;">
			<div style="cursor:pointer;font-size: 25pt; font-weight: bold; font-style: italic;
				margin-right:10px; margin-left: 10px;text-align: center;color:#6273ff"
				onclick="location.href='/hire/Search_Job.do'">
				Job Recipe
			</div>
			<div style="cursor:pointer;font-size: 12pt;margin-right:10px;margin-top:3%; 
				margin-left: 10px;text-align: center;color:#6273ff" onclick="location.href='/hire/allAdvertise.do'">
				채용
			</div>
		</div>
		<!--test  -->
		<div>
			<a href="editPw.do">EDIT</a>
				<!--test용 버튼  -->
				<button onclick="location.href='/admin/insertCompanyForm.do'">admin</button>
				<!--test용 버튼  -->
				<a href="../hire/Search_Job.do">검색</a>
				<!-- 채용공고 검색 -->
		</div>
		<div style="display:flex; flex-direction: row;flex-wrap: nowrap;">
			<c:if test="${login == null }">
				<div style="cursor:pointer;font-size: 12pt;margin-right:10px; margin-left: 10px;
					text-align: center;margin-top:13%;color:#6273ff " onclick="location.href='/sign_up.do'">
					회원가입
				</div>
				<div style="cursor:pointer;font-size: 12pt;margin-right:10px; margin-left: 10px;
					text-align: center;margin-top:13%;color:#6273ff " onclick="location.href='/sign_in.do'">
					로그인
				</div>
			</c:if>
			
			<c:if test="${login != null }">
					<div style="cursor:pointer;font-size: 12pt;margin-right:10px; margin-left: 10px;
					text-align: center;margin-top:13%;color:#6273ff " onclick="location.href='/settings.do'">
					마이페이지
				</div>
				<div style="cursor:pointer;font-size: 12pt;margin-right:10px; margin-left: 10px;
					text-align: center;margin-top:13%;color:#6273ff " onclick="location.href='/logout.do'">
					로그아웃
				</div>
			</c:if>	
		</div>
	</div>
	<hr style="border:solid 1px #6273ff">
	
	
	<!-- 팝업 구현부분 -->
	<!-- <button onclick="test()">click</button>
	<div id="test" style="width: 100%; height: 100vh;display: none; align-items: center; position:absolute;
		top:0; left:0; justify-content: center;background-color: rgba(0,0,0,0.3);z-index: 99;">
		popup
		<div style="width: 50%; height: 50vh; background-color: white; z-index: 100;">
			여기는 팝업<br>
			<button onclick="test()">팝업닫기</button>
		</div>
	</div> -->
</body>
</html>