<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>学生信息列表</h1>
<table border="1" cellspacing="0">
    <tr>
        <th>学生id</th>
        <th>学生名称</th>
        <th>学生性别</th>
        <th>学生年龄</th>
        <th>居住地址</th>
    </tr>
    <c:forEach items="${students}" var="student" varStatus="vs">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.sex}</td>
            <td>${student.age}</td>
            <td>${student.address}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>

