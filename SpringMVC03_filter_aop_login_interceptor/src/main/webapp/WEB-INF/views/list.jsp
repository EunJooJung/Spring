<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
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
			<th>�̸�</th>
			<th>����</th>
			<th>�ۼ���</th>
		</tr>
		<c:forEach items="${list }" var="dto">
		<tr>
			<td>${dto.myno }</td>
			<td>${dto.myname }</td>
			<td><a href="detail.do?myno=${dto.myno }">${dto.mytitle }</a></td>
			<td>${dto.mydate }</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="4" align="right">
				<input type="button" value="���ۼ�" onclick="location.href='insert.do'">
			</td>
		</tr>
	</table>

</body>
</html>