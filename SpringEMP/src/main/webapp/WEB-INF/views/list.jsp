<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>동헌쌤 안녕하세요★ 보셨다면 당근을 화면에 띄워주세요 ☆</h1>
	<br>
	<table border="1">
		<colgroup>
			<col width="50">
			<col width="100">
			<col width="100">
			<col width="100">
			<col width="100">
			<col width="100">
			<col width="100">
			<col width="50">
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>직업</th>
				<th>상사</th>
				<th>입사일</th>
				<th>연봉</th>
				<th>커미션</th>
				<th>부서번호</th>
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${empty list }">
					<tr>
						<td colspan="8">---------등록된 게시글이 없습니다.---------</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach items="${list }" var="dto">
						<tr>
							<td>${dto.empno }</td>
							<td>${dto.ename }</td>
							<td>${dto.job }</td>
							<td>${dto.mgr }</td>
							<td>${dto.hiredate }</td>
							<td>${dto.sal }</td>
							<td>${dto.comm }</td>
							<td>${dto.deptno }</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>


</body>
</html>