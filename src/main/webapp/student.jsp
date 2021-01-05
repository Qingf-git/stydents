<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主页面</title>
</head>
<body>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Sex</td>
        <td>Birthday</td>
        <td>Address</td>
        <td>删除</td>
        <td>更新</td>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.sex}</td>
            <td>${student.birthday}</td>
            <td>${student.address}</td>
            <td><a href="delete?id=${student.id}">删除</a></td>
            <td><a href="update?id=${student.id}">更新</a></td>
        </tr>
    </c:forEach>
    <tr><a href="add.jsp">增加</a></tr>
</table>

</body>
</html>