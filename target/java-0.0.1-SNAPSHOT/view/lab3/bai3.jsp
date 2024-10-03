<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Information</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f7f6;
            color: #333;
            padding: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .container {
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            width: 100%;
            text-align: center;
        }

        h1 {
            font-size: 2rem;
            color: #4CAF50;
            margin-bottom: 20px;
            text-transform: uppercase;
            letter-spacing: 1.2px;
        }

        ul {
            list-style: none;
            padding: 0;
        }

        li {
            font-size: 1.2rem;
            margin: 10px 0;
        }

        li span {
            font-weight: bold;
            color: #333;
        }

        li::before {
            color: #4CAF50;
        }

        .price {
            color: #E74C3C;
            font-weight: bold;
        }

        .date {
            color: #3498DB;
        }

        @media (max-width: 600px) {
            h1 {
                font-size: 1.5rem;
            }

            li {
                font-size: 1rem;
            }
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Product Information</h1>
    <ul>
        <li>Name:${item.name}</li>
        <li>Price: <span class="price"><fmt:formatNumber value="${item.price}" pattern="#,###.00"/></span></li>
        <li>Date:<span class="date"><fmt:formatDate value="${item.date}" pattern="MMM, dd, yyyy"/></span></li>
    </ul>
</div>
</body>
</html>
