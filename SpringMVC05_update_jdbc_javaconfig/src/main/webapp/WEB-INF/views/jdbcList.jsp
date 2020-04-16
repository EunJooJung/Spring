<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>LIST</h1>

	<table border="1">
		<colgroup>
			<col width="70">
			<col width="70">
			<col width="200">
			<col width="100">
		</colgroup>
		<tr>
			<th>번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>날짜</th>
		</tr>
		
		<c:forEach items="${list }" var="dto">
			<tr>
			<td>${dto.seq }</td>
			<td>${dto.writer }</td>
			<td><a href="">${dto.title }</a></td>
			<td>${dto.refdate }</td>
			</tr>
		</c:forEach>
			<tr>
				<td colspan="4" align="right">
					<input type="button" value="글 작성" onclick="location.href='insertForm.do'" >
				</td>
			</tr>
	</table>

	

</body>
</html>