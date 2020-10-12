<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#center {
		list-style: none; 
		float: left; 
		padding : 6px;
	}
</style>
<script>
	function advertiseOrder() {
		var order = document.getElementById("order");
		var orderValue = order.options[order.selectedIndex].value;
		
		$.ajax({
			type: "post",
			url: "aOrderInfo.do",
			data: {order : orderValue},
			success: function(result) {
				var order_result = $("#companyOrder").html(result).find("#companyTable");
				$("#companyOrder").html(order_result);
			}
		});
	}
	
	$(document).ready(function() {
		$("#companyTable tr").click(function() {
			var tr = $(this);
			var td = tr.children();
			var ad_name = td.eq(0).text();
			var ad_title = td.eq(1).text();
			$.ajax({
				type: "post",
				url: "aInfo.do",
				data: {
					ad_name : ad_name,
					ad_title : ad_title
				},
				success: function(result) {
					var order_result = $("#advertisementOrder").html(result).find(".box2");
					$("#advertisementOrder").html(order_result);
				}
			});
		});
	})
	
</script>
</head>
<body>
	<div class="box1" style="overflow:scroll; width:300px; height:900px;">
	
		<select id="order" name="order" onchange="advertiseOrder()">
			<option value="마감일">마감일</option>
			<option value="평점수">평점수</option> 
		</select>
		
		<div id="companyOrder">
			<table id="companyTable">
				<c:forEach var="vo" items="${info }">
					<tr>
						<td>${vo.companyVO.c_name }</td>
						<td id="ad_title"><a href="#">${vo.ad_title }</a></td>
						<td>${vo.ad_date }</td>
						<td>${vo.companyVO.c_star }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		  <ul>
    <c:if test="${pageMaker.prev}">
    	<li id="center"><a href="aAllInfo.do${pageMaker.makeQuery(pageMaker.startPage - 1)}">이전</a></li>
    </c:if> 

    <c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
    	<li id="center"><a href="aAllInfo.do${pageMaker.makeQuery(idx)}">${idx}</a></li>
    </c:forEach>

    <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
    	<li id="center"><a href="aAllInfo.do${pageMaker.makeQuery(pageMaker.endPage + 1)}">다음</a></li>
    </c:if> 
  </ul>
</div>

</body>
</html>