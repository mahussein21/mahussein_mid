<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 3/31/2024
  Time: 11:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <style>
        /* Style for the Add Student Form */
        form {
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #f9f9f9;
        }

        label {
            font-weight: bold;
        }

        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            margin-top: 10px;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

    </style>
</head>
<body>
<h2>Add Student</h2>
<form action="add" method="post">
    <label for="names">Names:</label><br>
    <input type="text" id="names" name="names"><br>
    <label for="programs">Programs:</label><br>
    <input type="text" id="programs" name="programs"><br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>

