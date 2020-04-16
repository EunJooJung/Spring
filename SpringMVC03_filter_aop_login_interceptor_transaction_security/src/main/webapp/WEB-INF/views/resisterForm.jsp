<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<h1>회원가입</h1>
	
	<form action="regist" method="get">
		<table border="1">
			<tr>
				<th>ID</th>
				<td><input type="text" name="myid"></td>
			</tr>
			<tr>
				<th>PW</th>
				<td><input type="text" name="mypw"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="myname"></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="회원가입">
					<input type="button" value="취소" onclick="">
				</td>
			</tr>
		</table>
	
	</form>

</body>
</html>