<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Select Country</title>
</head>
<body>
<h1>Select your country</h1>
    <select name="country">
        <c:forEach var="ct" items="${countries}"  varStatus="vs">
            <option value="${ct.id}"><p>${vs.count} </p>${ct.name}</option>
        </c:forEach>
    </select>
</body>
</html>
