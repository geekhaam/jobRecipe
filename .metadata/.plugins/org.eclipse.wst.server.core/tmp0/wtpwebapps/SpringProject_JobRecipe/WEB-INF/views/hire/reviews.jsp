<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h1> 리뷰 게시판</h1>
<!-- <script>
location.href="reviewAll.do"
</script>
 -->

<c:forEach var="rev" items="${alist }">

${rev.c_rev_no }
${rev.c_rev_title }

</c:forEach>



<h2>테스트</h2>
</body>
</html>