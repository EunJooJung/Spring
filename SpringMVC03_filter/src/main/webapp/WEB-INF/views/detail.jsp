<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>번호</th>
			<td>${dto.myno }</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${dto.myname }</td>
		</tr>
		<tr>
			<th>글제목</th>
			<td>${dto.mytitle }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="6" cols="10" readonly="readonly">${dto.mycontent }</textarea></td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${dto.mydate }</td>
		</tr>
		<tr>
			<td>
				<input type="button" value="수정" onclick="location.href='update.do?myno=${dto.myno}'">
				<input type="button" value="삭제" onclick="location.href='delete.do?myno=${dto.myno }'">
				<button onclick="list.do">취소</button>
			</td>
		</tr>
	</table>

</body>
</html>