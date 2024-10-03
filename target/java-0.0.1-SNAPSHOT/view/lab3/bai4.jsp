<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>News Information</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f8f9fa;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            color: #333;
            margin: 0;
        }

        .container {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            max-width: 600px;
            width: 100%;
        }

        h1 {
            font-size: 2rem;
            text-align: center;
            color: #2c3e50;
            margin-bottom: 20px;
            text-transform: uppercase;
        }

        ul {
            list-style: none;
            padding: 0;
            margin: 0;
        }

        li {
            margin-bottom: 15px;
            font-size: 1.2rem;
        }

        li span {
            font-weight: bold;
            color: #34495e;
        }

        .content {
            background-color: #ecf0f1;
            padding: 15px;
            border-radius: 5px;
            font-size: 1rem;
            color: #2d3436;
        }

        .highlight {
            color: #e74c3c;
            font-weight: bold;
        }

        .button {
            display: inline-block;
            margin-top: 20px;
            background-color: #3498db;
            color: white;
            padding: 10px 20px;
            text-align: center;
            border-radius: 5px;
            text-decoration: none;
            transition: background-color 0.3s ease;
        }

        .button:hover {
            background-color: #2980b9;
        }

        @media (max-width: 600px) {
            h1 {
                font-size: 1.5rem;
            }

            li {
                font-size: 1rem;
            }

            .button {
                padding: 8px 16px;
            }
        }
    </style>
</head>
<body>
<div class="container">
    <h1>News</h1>
    <ul>
        <li><span>Title:</span> ${fn:toUpperCase(item.title)}</li>
        <li><span>Content:</span>
            <div class="content">
                <c:choose>
                    <c:when test="${fn:length(item.content) > 100}">
                        ${fn:substring(item.content, 0, 100)}<span class="highlight"></span>
                    </c:when>
                    <c:otherwise>
                        ${item.content}
                    </c:otherwise>
                </c:choose>
            </div>
        </li>
    </ul>
</div>
</body>
</html>
