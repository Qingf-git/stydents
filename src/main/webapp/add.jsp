<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加</title>
</head>
<body>
<form action="insert" method="post">
    Name: <input type="text" name="name"/> <br>
    Sex: 男<input type="radio" name="sex" value="M" />
        女 <input type="radio" name="sex" value="F"><br>
    Birthday: <input type="date" name="birthday" /> <br>
    Address: <input type="text" name="address" /> <br>
    <input type="submit" value="insert"/>
    <input type="reset" value="Reset"/>
</form>
</body>
</html>
