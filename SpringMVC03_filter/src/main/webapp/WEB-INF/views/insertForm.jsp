<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>글작성</h1>
	
	<form action="insertForm.do" method="get">
		<table border="1">
		<tr>
			<th>작성자</th>
			<td><input type="text" name="myname"></td>
		</tr>
		<tr>
			<th>글제목</th>
			<td><input type="text" name="mytitle"></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="6" cols="10" name="mycontent"></textarea></td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="글작성">
				<button onclick="">취소</button>
			</td>
		</tr>
	</table>
	</form>

</body>
</html>