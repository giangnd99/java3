<%-- 
    Document   : send
    Created on : Apr 19, 2024, 11:47:32 AM
    Author     : Computer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><b>SEND EMAIL</b></h1>
        <form action="/java4/send-mail" method="post">
            <mark>${message}</mark>
            <label>From: </label><input name="emailsend" type="text"> <br>
            <label>To: </label><input name="emailreceive" type="text"> <br>
            <label>Subject: </label><input name="tittle" type="text"> <br>
            <label>Body: </label><textarea name="bodymes" cols="100" rows="10"></textarea> <hr>
            <button>Send</button>
        </form>
    </body>
</html>
