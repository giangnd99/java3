<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="../css/DangKy.css">
</head>
<body>
<div class="container">
    <form action="register" method="POST">
        <div>
            <label>Tên đăng nhập: </label>
            <input type="text" name="username" value="${user.username}">
        </div>
        <div>
            <label>Mật khẩu: </label>
            <input type="password" name="password" value="${user.password}">
        </div>
        <div>
            <label>Giới tính: </label>
            <input type="radio" name="sex" value="male" ${user.sex=='male'?'checked':''}> Nam
            <input type="radio" name="sex" value="female"> Nữ
        </div>
        <div>
            <label>Đã có gia đình ?</label><input type="checkbox" name="married"
                                                  value="true" ${user.married==true?'checked':''}> <label>Có</label>
        </div>
        <div>
            <label>Quốc tịch: </label>
            <select name="nationally">
                <option value="US" ${user.nationally=='US'?'selected':''}>Mỹ</option>
                <option value="VN" ${user.nationally=='VN'?'selected':''}>Việt Nam</option>
            </select>
        </div>
        <div>
            <label>Sở thích: </label>
            <c:forTokens items="Đọc sách,Du lịch,Âm nhạc,Khác" delims="," var="like">

                <input type="checkbox" name="liked" value="${like}" ${fn:contains(user.liked,like)?'checked':''}>
                <label>${like}</label>

            </c:forTokens>
        </div>
        <div>
            <label>Ghi chú:</label>
            <textarea name="note" placeholder=" !!!!"></textarea>
        </div>
        <br>
        <button type="submit">Đăng ký</button>
    </form>
</div>
</body>
</html>