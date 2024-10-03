<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Máy Tính Cơ Bản</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.calculator {
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 300px;
}

h1 {
	text-align: center;
	color: #333;
}

form {
	display: flex;
	flex-direction: column;
}

input[type="text"] {
	padding: 10px;
	margin-bottom: 10px;
	font-size: 1rem;
	border: 1px solid #ccc;
	border-radius: 5px;
}

.operations {
	display: flex;
	justify-content: space-between;
	margin-bottom: 10px;
}

button {
	padding: 10px;
	width: 45%;
	background-color: #28a745;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

button:hover {
	background-color: #218838;
}

.result {
	margin-top: 10px;
	font-size: 1.2rem;
	color: #333;
	text-align: center;
}

.result input {
	width: 90%;
}
</style>
</head>
<body>
	<div class="calculator">
		<h1>Máy Tính</h1>
		<form action="/java/lab2/bai5" method="post">
			<input type="text" name="num1" placeholder="Nhập số thứ nhất"
				value="${num1}"> <input type="text" name="num2"
				placeholder="Nhập số thứ hai" value="${num2}">
			<div class="operations">
				<button type="submit" name="operation" value="add">Cộng (+)</button>
				<button type="submit" name="operation" value="subtract">Trừ
					(-)</button>
			</div>
			<div class="operations">
				<button type="submit" name="operation" value="multiply">Nhân
					(*)</button>
				<button type="submit" name="operation" value="divide">Chia
					(/)</button>
			</div>
			<div class="operations">
				<button type="submit" name="operation" value="reset">Làm
					mới</button>
			</div>
		</form>
		<hr>
		<div class="result">
			<h1>Kết quả</h1>		
			<input type="text" name="message" value="${message}" readonly>
		</div>
	</div>
</body>
</html>