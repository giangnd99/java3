<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h2>Uploaded Images:</h2>
<c:if test="${not empty imgs}">
    <ul>
        <c:forEach var="imgName" items="${imgs}">
            <li>
                <img src="${pageContext.request.contextPath}/files/${imgName}" alt="${imgName}" width="200" height="auto">
                <p>${imgName}</p>
            </li>
        </c:forEach>
    </ul>
</c:if>
<c:if test="${empty imgs}">
    <p>No images uploaded yet.</p>
</c:if>

<form action="upload" method="post" enctype="multipart/form-data">
    <input name="photo" type="file" multiple="multiple"><br>
    <button>Upload</button>
</form>
</body>
</html>