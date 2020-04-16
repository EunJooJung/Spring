<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- enctype : 인코딩 타입
		enctype속성
		1. application/www-form-urlencoded : 문자들이 encoding 됨(default)
		2. multipart/form-data : file upload 가능(post)
		3. text/plain : encoding 되지 않음
	-->
	<!-- modelAttribute : 옵션은 폼에 있는 요소들의 값을 채우기 위해서 사용될 객체를 request 로부터 찾을때 사용할 이름을 지정합니다 -->
	
	<form:form method="post" enctype="multipart/form-data"
		modelAttribute="uploadFile" action="upload">
		<h3>UPLOAD Form</h3>
		<input type="file" name="mpfile"><br/>
		<p style="color:red; font-weight:bold;">
			<form:errors path="mpfile"/>	
		</p><br>
		description<br>
		<textarea rows="10" cols="60" name="desc"></textarea><br>
		<input type="submit" value="send">	
		</form:form>

</body>
</html>