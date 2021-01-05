<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="update" method="post">
    Id: <input name="id" value="${student.id}" readonly/> <br>
    Name: <input name="name" value="${student.name}"/> <br>
    Sex: <input name="sex" value="${student.sex}"/> <br>
    Birthday: <input name="birthday" value="${student.birthday}"/> <br>
    Address: <input name="address" value="${student.address}"/> <br>
    <input type="submit" value="Update"/>
    <input type="reset" value="Reset"/>
</form>
</body>
</html>
