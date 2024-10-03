<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đăng nhập</title>
    <link rel="stylesheet" href="../css/handle_form.css">
    <script src="../js/validation.js"></script>
</head>
<body>
    <div class="login-container">
    	<h1>${message}</h1>
        <h2>Đăng nhập</h2>
        <form action="form" method="post" onsubmit="return validateForm();">
            <div class="input-group">
                <label for="username">Tài khoản</label>
                <input type="text" id="username" name="username" placeholder="Nhập tài khoản">
            </div>
            <div class="input-group">
                <label for="password">Mật khẩu</label>
                <input type="password" id="password" name="password" placeholder="Nhập mật khẩu">
            </div>
            <button type="submit">Đăng nhập</button>
        </form>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</body>
</html>
