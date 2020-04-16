<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>

<script type="text/javascript">

$(function(){
	$("#loginchk").hide();
});

function login(){
	var memberid = $("#memberid").val().trim();
	var memberpw = $("#memberpw").val().trim();
	
	console.log(memberid + "/" + memberpw);
	
	if(memberid == null || memberid == "" || memberpw == null || memberpw == ""){
		alert("ID or PW를 다시 확인해 주세요");
	} else {
		//자바스크립트 오브젝트
		var loginVal = {
				"memberid": memberid,
				"memberpw": memberpw
		}  
		
		$.ajax({
			url: "ajaxlogin.do",
			method: "post",
			contentType: "application/json",
			data: JSON.stringify(loginVal),
			dataType: "json",
			success: function(msg){
				if(msg.check == true){
					location.href="list.do";
				}else{
					$("#loginchk").show();
					$("#loginchk").html("ID or PW가 잘못되었습니다.").css("color","red");
				}
			},
			error: function(){
				alert("통신 실패");
			}
		});
		
	}
	
}

</script>

</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<td><input type="text" id="memberid"></td>
		</tr>
		<tr>
			<th>PW</th>
			<td><input type="password" id="memberpw"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" value="login" onclick="login();">
			</td>
		</tr>
		<tr>
			<td colspan="2" id="loginchk"></td>
		</tr>
	
	</table>

</body>
</html>