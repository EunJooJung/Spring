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
			<th>��ȣ</th>
			<td>${dto.myno }</td>
		</tr>
		<tr>
			<th>�ۼ���</th>
			<td>${dto.myname }</td>
		</tr>
		<tr>
			<th>������</th>
			<td>${dto.mytitle }</td>
		</tr>
		<tr>
			<th>����</th>
			<td><textarea rows="6" cols="10" readonly="readonly">${dto.mycontent }</textarea></td>
		</tr>
		<tr>
			<th>�ۼ���</th>
			<td>${dto.mydate }</td>
		</tr>
		<tr>
			<td>
				<input type="button" value="����" onclick="location.href='update.do?myno=${dto.myno}'">
				<input type="button" value="����" onclick="location.href='delete.do?myno=${dto.myno }'">
				<button onclick="list.do">���</button>
			</td>
		</tr>
	</table>

</body>
</html>