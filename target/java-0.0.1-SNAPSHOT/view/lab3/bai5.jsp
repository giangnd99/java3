<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Country Management</title>
    <style>
        table {
            width: 70%;
            margin: 40px auto;
            border-collapse: collapse;
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
        }
        th, td {
            padding: 12px 15px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        h2 {
            text-align: center;
        }
    </style>
</head>
<body>
<h2>Country Management</h2>

<c:if test="${not empty message}">
    <div style="color: green; text-align: center;">${message}</div>
</c:if>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="country" items="${countries}">
            <tr>
                <td>${country.id}</td>
                <td>${country.name}</td>
                <td>
                    <form action="bai5" method="post" style="display:inline;">
                        <input type="hidden" name="id" value="${country.id}">
                        <input type="hidden" name="name" value="${country.name}">
                        <input type="submit" name="edit" value="Edit">
                    </form>
                    <form action="bai5" method="post" style="display:inline;">
                        <input type="hidden" name="id" value="${country.id}">
                        <input type="submit" name="delete" value="Delete">
                    </form>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<h3>Add New Country</h3>
<form action="bai5" method="post">
    ID:
    <input type="text" name="id" required>
    Name:
    <input type="text" name="name" required>
    <input type="submit" name="add" value="add">
</form>
</body>
</html>
