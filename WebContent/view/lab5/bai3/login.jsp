<%-- 
    Document   : login
    Created on : Apr 19, 2024, 11:00:45 AM
    Author     : Computer
--%>

<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>JSP Page</title>
    </head>
    <body>


        <h1><b>ĐĂNG NHẬP</b></h1>
        <form action="login" method="post" >
            <label >Tên tài khoản:</label><input type="text" name="username" value="${username}"> <br>
            <label>Mật khẩu:</label><input type="password" name="password" value="${password}"><br>
            <input name="remember" type="checkbox"> Remember me?
            <hr>
            <button>Login</button>
        </form>
        <mark>${message}</mark>
    </body>
</html>
