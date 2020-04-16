<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<form action="updateForm.do" method="get">
			<input type="hidden" name="myno" value="${dto.myno }"/>
		<table border="1">
			<tr>
				<th>작성자</th>
				<td>${dto.myname }</td>
			</tr>
			<tr>
				<th>글제목</th>
				<td><input type="text" name="mytitle" value="${dto.mytitle }"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="6" cols="10" name="mycontent">${dto.mycontent }</textarea></td>
			</tr>
			<tr>
				<th>작성일</th>
				<td>${dto.mydate }</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="수정하기"> 
					<button onclick="list.do">취소</button>
				</td>
			</tr>
		</table>

	</form>

</body>
</html>