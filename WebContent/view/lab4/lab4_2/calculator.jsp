<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Máy tính đơn giản</title>
    <link rel="stylesheet" href="../css/calculator.css"> <!-- Liên kết file CSS -->
</head>
<body>
    <div class="calculator-container">
        <h2>Máy tính</h2>
        <form action="calculator" method="post">
            <div class="input-group">
                <label for="num1">Số thứ nhất</label>
                <input type="number" id="num1" name="num1" placeholder="Nhập số thứ nhất" required>
            </div>
            <div class="input-group">
                <label for="num2">Số thứ hai</label>
                <input type="number" id="num2" name="num2" placeholder="Nhập số thứ hai" required>
            </div>
            <div class="button-group">
                <button type="submit" name="operation" value="+">Cộng</button>
                <button type="submit" name="operation" value="-">Trừ</button>
            </div>
        </form>
        <div class="result">
            <c:if test="${not empty result}">
                <h3>Kết quả: ${result}</h3>
            </c:if>
        </div>
    </div>
</body>
</html>
