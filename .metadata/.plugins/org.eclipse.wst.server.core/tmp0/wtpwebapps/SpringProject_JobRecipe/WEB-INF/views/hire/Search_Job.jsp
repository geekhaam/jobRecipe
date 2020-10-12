<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<%
    request.setCharacterEncoding("UTF-8");
%>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
Date todate = new Date();
SimpleDateFormat date = new SimpleDateFormat("yyyyMMdd");
date.format(todate);
%>
</head>
<body>

<input type="text" name="search"> <input type="submit" value="검색">
	<div> 
		<a href="<c:url value='/Search.do'/>">[검색]</a>
	</div>
<%=date.format(todate) %> 
<table border=2>
<tr>
<td colspan="14"><h1>채용공고</h1></td> 
</tr>
<tr>
<c:forEach var="imsi" items="${list}">
<hr>
<td><a href="aAllInfo.do?ad_title=${imsi.ad_title}">${imsi.ad_title }</a></td>
<td><a href="aAllInfo.do?ad_name=${imsi.ad_name}">${imsi.ad_name }</a></td>
<td>${imsi.companyVO.c_addr }</td>
<td>${imsi.companyVO.c_loc }</td>
<td>${imsi.ad_name }</td>
<td>${imsi.ad_upmu }</td>
<td>${imsi.ad_lien }</td>
<td>${imsi.ad_date }</td>
</tr>
</c:forEach>
</table>
</body>
</html>