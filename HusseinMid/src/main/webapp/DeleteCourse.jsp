
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Delete Course</title>
    <style>
        /* Style for the Delete Course Form */
        form {
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #f9f9f9;
        }

        p {
            margin-bottom: 10px;
        }

        input[type="submit"] {
            background-color: #f44336;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #d32f2f;
        }

    </style>
</head>
<body>
<h2>Delete Course</h2>
<form action="delete" method="get">
    <input type="hidden" name="id" value="${course.course_id}">
    <p>Are you sure you want to delete course "${course.course_name}"?</p>
    <input type="submit" value="Delete">
</form>
</body>
</html>
