<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/ResultDangKy.css">
</head>
<body>
	<div class="container">
		<h1>Thông tin đăng ký</h1>
		<ul>
			<li>Tên đăng nhập: ${user.username}</li>
			<li>Mật khẩu: ${user.password}</li>
			<li>Giới tính: ${user.sex}</li>
			<li>Tình trạng hôn nhân: ${user.married==true?'Da ket hon':'doc than'}</li>
			<li>Quốc Tịch: ${user.nationally}</li>
			<li>Sở thích: 
			<c:forEach var="item" items="${user.liked}">
			    ${item} 
			</c:forEach>
			</li>
			<li>Ghi chú: ${user.note}</li>
		</ul>
		<a href="register">Ve dang ky</a>
	</div>
</body>
</html>