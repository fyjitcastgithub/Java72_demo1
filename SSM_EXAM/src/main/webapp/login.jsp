<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        #error_tips{
            color: red;
        }
    </style>
</head>
<body>
<h1>登陆页面</h1>
<span id="error_tips">${msg}</span>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名：<input type="text" name="name"><br/>
    密码：<input type="text" name="password"><br/>
    <button type="submit">登陆</button>
</form>
</body>
</html>
