/* javascript쓰는 곳 */

		function admin_company_search() {
			var name = $("#c_name").val();
			if(name == null || name == "") {
				$("#company_search").hide();
				alert("회사명을 입력해주세요!");
			} else {
				$.ajax({
					type: "post",
					url: "selectCompany.do",
					data: {c_name : name},
					dataType: "html",
					success: function(result) {
						console.log(result);
						$("#company_search").show();
						var search_result = $("#company_search").html(result).find(".company_search_table");
						$("#company_search").html(search_result);
					}
				});
			}
		}
		
		function admin_company_add() {
			var name = $("#name").val();
			var loc = $("#loc").val();
			var addr = $("#addr").val();
			
			if(name == null || name == "") {
				alert("회사명을 입력해주세요.");
			} else if(loc == null || loc == "") {
				alert("회사위치를 입력해주세요.");
			} else if(addr == null || addr == "") {
				alert("회사주소를 입력해주세요.");
			} else {
				$.ajax({
					type: "post",
					url: "insertCompany.do",
					data: {
						c_name : name,
						c_loc : loc,
						c_addr : addr
					},
					success: function(result) {
						if(result == "no") {
							alert("이미 존재하는 회사입니다.");
						} else {
							alert("회사가 추가되었습니다.");
						}
						$("#name").val("");
						$("#loc").val("");
						$("#addr").val("");
					}
				});
			}
		}
		
		function admin_company_update() {
			var name = $("#name1").val();
			var loc = $("#loc1").val();
			var addr = $("#addr1").val();
			
			if(loc == null || loc == "") {
				alert("회사위치를 입력해주세요.");
			} else if(addr == null || addr == "") {
				alert("회사주소를 입력해주세요.");
			} else {
				$.ajax({
					type: "post",
					url: "updateCompany.do",
					data: {
						c_name : name,
						c_loc : loc,
						c_addr : addr
					},
					success: function(result) {
						alert("회사 정보가 수정되었습니다.");
					}
				});
			}
		}
		
		function admin_company_del() {
			var name = $("#name1").val();
			$.ajax({
				type: "post",
				url: "deleteCompany.do",
				data: {c_name : name},
				success: function(result) {
					alert("회사 정보가 삭제되었습니다.");
					$("#c_name").val("");
					$("#company_search").hide();
				}
			});
		}