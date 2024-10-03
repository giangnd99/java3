<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Request Information</title>
    <style>
        table {
            width: 70%;
            margin: 40px auto;
            border-collapse: collapse;
            font-family: Arial, sans-serif;
            font-size: 16px;
            background-color: #f9f9f9;
            box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 12px 15px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #4CAF50;
            color: white;
            font-weight: bold;
            text-transform: uppercase;
            letter-spacing: 1px;
        }

        tbody tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tbody tr:hover {
            background-color: #f1f1f1;
        }

        h2 {
            text-align: center;
            font-family: 'Arial', sans-serif;
            font-size: 2rem;
            margin-top: 20px;
            color: #333;
        }

        body {
            font-family: Arial, sans-serif;
            background-color: #eef2f3;
            color: #333;
            padding: 20px;
        }
    </style>
</head>
<body>
<h2 style="text-align: center;">Lab3_2 Information</h2>
<table>
    <thead>
    <th>No.</th>
    <th>Id</th>
    <th>Name</th>
    </thead>

    <c:forEach var="ct" items="${countries}" varStatus="vs">
        <tr>
            <td>${vs.count}</td>
            <td>${ct.id}</td>
            <td>${ct.name}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
