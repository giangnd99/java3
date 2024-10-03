<%-- 
    Document   : result
    Created on : Apr 19, 2024, 9:32:04 AM
    Author     : Computer
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <li>Giới tính:<b>${bean.gender}</b></li>
            <li>Quốc tịch:<b>${bean.country}</b></li>
            <li>Tình trạng hôn nhân:<b>${bean.married}</b></li>
            Sở thích:
            <c:forEach items="${bean.hobbies}" var="hobby">
                <li><b>${hobby}</b></li>
                </c:forEach>
            <li>Ghi chú: <b>${bean.notes}</b></li>
        </ul>
    </body>
</html>
