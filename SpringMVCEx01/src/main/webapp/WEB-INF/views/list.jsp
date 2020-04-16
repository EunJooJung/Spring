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

	<h1>글 목록</h1>
	
	<table border="1">
	<colgroup>
         <col width="50">
         <col width="100">
         <col width="300">
         <col width="100">
      </colgroup>
	<tr>
		<th>번호</th>
		<th>작성자</th>
		<th>제목</th>
		<th>작성일</th>
	</tr>
	<c:choose>
		<c:when test="${empty list }">
			<tr>
			<td colspan="4">-------등록 된 게시글이 없습니다--------</td>
			</tr>
		</c:when>
		<c:otherwise>
			<c:forEach items="${list }" var="dto">
				<tr>
					<td>${dto.myno }</td>
					<td>${dto.myname }</td>
					<td><a href="detail.do?myno=${dto.myno }">${dto.mytitle }</a></td>
					<td>${dto.mydate }</td>
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>
	<tr>
		<td colspan="4" align="right">
			<input type="button" value="글작성" onclick="location.href='insert.do'">
		</td>
	</tr>
	
	</table>

</body>
</html>