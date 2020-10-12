<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	#center {
		list-style: none; 
		float: left; 
		padding : 6px;
	}
	.title{
    	font-family: 'Roboto', 'Noto Sans Korean', '돋움', dotum, Arial, sans-serif;
    	-webkit-font-smoothing: antialiased;
    	list-style: none;
    	cursor: pointer;
    	margin: 0;
    	padding: 0;
    	font-size: 16px;
    	line-height: 26px;
    	color: #323438;
    	font-weight: bold;
}
    .company{
        font-family: 'Roboto', 'Noto Sans Korean', '돋움', dotum, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        list-style: none;
        cursor: pointer;
        margin: 0;
        padding: 0;
        font-size: 14px;
        line-height: 22px;
        color: #686a6d;
        
    }

    .star{
        font-family: 'Roboto', 'Noto Sans Korean', '돋움', dotum, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        list-style: none;
        cursor: pointer;
        margin: 0;
        padding: 0;
        font-size: 14px;
        line-height: 22px;
        color: #a4a6ad;
    }
</style>
<%
    request.setCharacterEncoding("UTF-8");
	pageContext.setAttribute("newLienChar", "#");
%>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/Company.css" />" rel="stylesheet">
<link type="text/css" href="<c:url value="/resources/css/jobCSS.css" />" rel="stylesheet">
<script type="text/javascript" src="<c:url value="/resources/js/jobJS.js"/>"></script>
<script src="<c:url value='/resources/js/jquery-3.1.1.js'/>"></script>
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
		$("#companyTable li").click(function() {
			var li = $(this);
			var p = li.children();
			var ad_name = p.eq(0).text();
			var ad_title = p.eq(1).text();
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

<header>
	<jsp:include page="../include/header.jsp"></jsp:include>
</header> 


  	<div class="box1" style="overflow:scroll; width:300px; height:900px;">
	
		<select id="order" name="order" onchange="advertiseOrder()">
			<option value="마감일">마감일</option>
			<option value="평점수">평점수</option> 
		</select>
		
		<div id="companyOrder">
			<%-- <table id="companyTable">
				<c:forEach var="vo" items="${info }">
					<tr>
						<td class="company">${vo.companyVO.c_name }</td>
						<td id="ad_title"><a href="#">${vo.ad_title }</a></td>
						<td class="star">${vo.ad_date }</td>
						<td>${vo.companyVO.c_star }</td>
					</tr>
				</c:forEach>
			</table>
			 --%>
			<ul id="companyTable">
				<hr>
				<c:forEach var="vo" items="${info }">
					<li>
						<p class="company">${vo.companyVO.c_name }</p>
						<p id="ad_title" class="title"><a href="#">${vo.ad_title }</a></p>
						<p class="star">${vo.ad_date }</p>
						<p>${vo.companyVO.c_star }</p>
					</li>
					<hr>
				</c:forEach>
			</ul>		
</div>
		
<ul>  
	<!-- 게시판 하단의 페이징  -->
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

<%-- <jsp:include page="CompanyInfo1.jsp" /> --%>

<!-- ----------------------------------------------------------------------------- -->

<div id="advertisementOrder">
	<div class="box2">	  		
          		<h1 font-size = "12px">
            		${imsi.ad_title}          
            	</h1>       
        		<span >
            	${imsi.ad_name }
        		</span>
            	<span>|</span>           
            	<span>${imsi.companyVO.c_loc }</span>	 	
		
	<hr>
	<ul id="ulist">
		<h3>※요약</h3>
		<br>
		<li>
			<span>             
                 	⊙마감일:
            </span>
			<span>
                <span >${imsi.ad_date }</span>
            </span>
		</li>
		
		<br>
		
		<li>
			<span>             
                 	⊙직무:
            </span>
			<span>
                <span >${imsi.ad_job }</span>
            </span>
		</li>
		
			<br>
			
		<li>
			<span>             
                 	⊙경력:
            </span>
			<span>
                <span >${imsi.ad_carr}</span>
            </span>
		</li>
		
			<br>
		
		<li>
			<span>             
                 	⊙교용형태:
            </span>
			<span>
                <span >${imsi.ad_emp}</span>
            </span>
		</li>
		
			<br>
		
		<li>
			<span>             
                 	⊙스킬:
            </span>    
			<span>
               <c:if test="${not empty imsi.ad_skill }">
					<span>${imsi.ad_skill }</span>
			   </c:if>
            </span>
		</li>
		
		<br>
		
	</ul>
	
	<c:if test="${not empty imsi.ad_upmu }">
		<ul>
			<h3>※주요업무 : </h3>
		   	<li>${imsi.ad_upmu}</li>
		</ul>
	</c:if>
	
	<br>
	
	<c:if test="${not empty imsi.ad_lien }">
		<ul>
			<h3>※자격요건 : </h3>
			<li>${fn:replace(imsi.ad_lien, newLienChar, "<br>") }</li>
		</ul>
	</c:if>
	
	<br>
	
	<c:if test="${not empty imsi.ad_deals }">
		<ul>
			<h3>※우대사항 : </h3>
			<li>${fn:replace(imsi.ad_deals, newLienChar, "<br>") }</li>
		</ul>
	</c:if>
	
	<br>
	
	<c:if test="${not empty imsi.ad_pro }">
		<ul>
			<h3>※채용절차 : </h3>
			<li>${imsi.ad_pro }</li>
		</ul>
	</c:if>
	
	<br>
	
	<c:if test="${not empty imsi.ad_cp }">
		<ul>
			<h3>※복리후생 : </h3>
			<li>${fn:replace(imsi.ad_cp, newLienChar, "<br>") }</li>
		</ul>
	</c:if>
	
	<br>
	
	<c:if test="${not empty imsi.ad_ect }">
		<ul>
			<h3>※기타 : </h3>
			<li>${fn:replace(imsi.ad_ect, newLienChar, "<br>") }</li>
		</ul>
	</c:if>
	
	<br>
	
	<ul>
		<h3>※주소 : </h3>
		<li>${imsi.companyVO.c_addr }</li>
		
	</ul>
	</div>
	
</div>

	<footer>
		<jsp:include page="../include/footer.jsp"></jsp:include>
	</footer>
</body>
</html>