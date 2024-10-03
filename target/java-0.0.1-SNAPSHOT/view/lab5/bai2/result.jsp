<%-- 
    Document   : result
    Created on : Apr 19, 2024, 9:32:04 AM
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
        <ul>
            <li>Họ và tên:<b>${bean.fullname}</b></li>
            <li>Ngày sinh:<b>${bean.birthday}</b></li>
            <li>Hình ảnh:<b>${bean.photo}</b></li>
            <li>Giới tính:<b>${bean.gender}</b></li>
            <li>Quốc tịch:<b>${bean.country}</b></li>
            <li>Tình trạng hôn nhân:<b>${bean.married}</b></li>
            <li>Sở thích:<b>${bean.hobbies}</b></li>
            <li>Ghi chú: <b>${bean.notes}</b></li>
        </ul>
        
        <img src="/java4/files/${bean.photo}" />
    </body>
</html>
