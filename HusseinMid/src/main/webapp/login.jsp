<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Signup Form </title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f7f7f7;
      margin: 0;
      padding: 0;
    }

    .container {
      width: 400px;
      margin: 50px auto;
      background-color: #fff;
      padding: 20px;
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    h2 {
      text-align: center;
      margin-bottom: 20px;
    }

    .form-group {
      margin-bottom: 20px;
    }

    label {
      display: block;
      font-weight: bold;
      margin-bottom: 5px;
    }

    input[type="text"],
    input[type="email"],
    input[type="password"] {
      width: 100%;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 5px;
      box-sizing: border-box;
    }

    .btn {
      display: block;
      width: 100%;
      padding: 10px;
      background-color: #22e;
      color: #fff;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }

    .btn:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>

<div class="container">
  <h2>LOGIN Form</h2>
  <form action="login" method="post">
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" id="email" name="email" placeholder="Enter your email" required>
    </div>
    <div class="form-group">
      <label for="password">Password:</label>
      <input type="password" id="password" name="password" placeholder="Enter your password" required>
    </div>

    <button type="submit" class="btn">LOGIN</button>
  </form>
</div>

</body>
</html>
