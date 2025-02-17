<!DOCTYPE html>
<html>
<head>
    <title>Client Form</title>
</head>
<body>
<form action="/ClientServerApplication_war_exploded/ServerServlet" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email"><br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>