<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>리뷰</title>
<style>
	.star1 {
	    background: url('/resources/images/star_on.png') no-repeat 0 0;
	    background-size: auto 100%;
	    width: 15px;
	    height: 30px;
	    float:left;
	}
	.star2 {
	    background: url('/resources/images/star_on.png') no-repeat right 0;
	    background-size: auto 100%;
	    width: 15px;
	    height: 30px;
	    float:left;
	}
	.star1.on {background-image: url('/resources/images/star.png');}
	.star2.on {background-image: url('/resources/images/star.png');}
</style>
<script src="<c:url value='/resources/js/jquery-3.1.1.js'/>"></script>
<script>
	var msg = "${msg}";
	if(msg == "success")
		alert("추가되었습니다.");
	
	var allStar = (Math.round("${allStar}"*2)/2).toFixed(1);
	
	$(document).ready(function() {
		$(".review_allStar span").each(function(i, e) { //평균 평점
			if($(this).attr("id") === allStar) {
				$(this).addClass('on').prevAll('span').addClass('on');
			}
		})
		
		$(".review_list table").each(function(i, e) { //각 리뷰 평점들
			var table = $(this);
			var td = table.find("#review_list_td");
			var div = td.find(".review_star");
			var star = td.find("#star").val();
			
			div.find("span").each(function(i, e) {
				if($(this).attr("id") === star) {
					$(this).addClass('on').prevAll('span').addClass('on');
				}
			})
		});
		
		$("#cnt input").click(function() { //추천수 증가
			var cnt = $(this);
			var table = cnt.parent().parent().parent();
			var no = table.find("#no").val();
			var rev_name = $("#rev_name").text();
			
			$.ajax({
				type: "post",
				url: "reviewCntUp.do",
				data: {
					rev_no : no,
					rev_name : rev_name
				},
				success: function(result) {
					cnt.val("도움이 돼요 " + result);
				}
			})
		})
	});
	
</script>
</head>
<body>

	<h1 id="rev_name">${rev_name }</h1>
	
	<c:if test="${empty alist }">
		리뷰가 없습니다. <br>
		근무한 경험이 있으시다면, 첫 리뷰를 작성해 주세요. <br><br>
		<input type="button" value="리뷰 추가" onclick="location.href='InsertReviewForm.do?rev_name=${rev_name }';">
	</c:if>
	<c:if test="${!empty alist }">
	<div class="review_list">
		<div class="review_allStar">
			<span class="star1 on" id="0.5"></span>
			<span class="star2" id="1.0"></span>
			<span class="star1" id="1.5"></span>
			<span class="star2" id="2.0"></span>
			<span class="star1" id="2.5"></span>
			<span class="star2" id="3.0"></span>
			<span class="star1" id="3.5"></span>
			<span class="star2" id="4.0"></span>
			<span class="star1" id="4.5"></span>
			<span class="star2" id="5.0"></span>
		</div>
		
		<h2>${allStar }</h2>
		
		<br>
		
		<input type="button" value="리뷰 추가" onclick="location.href='InsertReviewForm.do?rev_name=${rev_name }';">
		
		<br><br>
		
		<c:forEach var="imsi" items="${alist }">
			<table>
				<tr>
					<td><input type="text" id="no" value="${imsi.rev_no }" style="display: none;">${imsi.rev_job } | ${imsi.rev_state } | ${imsi.rev_date }</td>
				</tr>
				<tr>
					<td id="review_list_td">
						<input type="text" id="star" value="${imsi.rev_star }" style="display: none;">
						<div class="review_star">
							<span class="star1 on" id="0.5"></span>
							<span class="star2" id="1.0"></span>
							<span class="star1" id="1.5"></span>
							<span class="star2" id="2.0"></span>
							<span class="star1" id="2.5"></span>
							<span class="star2" id="3.0"></span>
							<span class="star1" id="3.5"></span>
							<span class="star2" id="4.0"></span>
							<span class="star1" id="4.5"></span>
							<span class="star2" id="5.0"></span>
						</div>
					</td>
				</tr>
				<tr>
					<td><b>"${imsi.rev_title }"</b></td> <!-- 한 줄 평가 -->
				</tr>
				<tr>
					<td style="color: blue;"><b>장점</b></td>
				</tr>
				<tr>
					<td style="white-space: pre;">${imsi.rev_advan }</td>
				</tr>
				<tr>
					<td style="color: red;"><b>단점</b></td>
				</tr>
				<tr>
					<td style="white-space: pre;">${imsi.rev_weak }</td>
				</tr>
				<tr>
					<td><b>경영진에게 바라는 점</b></td>
				</tr>
				<tr>
					<td style="white-space: pre;">${imsi.rev_wish }</td>
				</tr>
				<tr>
					<td id="cnt"><input type="button" id="rev_cnt" value="도움이 돼요 ${imsi.rev_cnt }"></td>
				</tr>
			</table>
			<br>
		</c:forEach>
		<c:if test="${startPage > pageBlock }">
			<a href="reviewAll.do?rev_name=${rev_name }&page=${startPage - 5 }">[이전]</a>
		</c:if>
		<c:forEach var="i" begin="${startPage }" end="${endPage }" step="1">
			<c:if test="${i == page }">
				[${i }]
			</c:if>
			<c:if test="${i != page }">
				<a href="reviewAll.do?rev_name=${rev_name }&page=${i }">[${i }]</a>
			</c:if>
		</c:forEach>
		<c:if test="${endPage < pageCount }">
			<a href="reviewAll.do?rev_name=${rev_name }&page=${startPage + 5 }">[다음]</a>
		</c:if>
		</div>
	</c:if>

</body>
</html>