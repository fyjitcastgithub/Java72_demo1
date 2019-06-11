<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/6/3
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery/jquery.min.js"></script>
    <script>
        $(function(){
            $("#btn").click(function(){
                $.post("account/findAll2",function(data){
                    alert(data.msg);
                },"json");
            });
        });
    </script>
</head>
<body>
<a href="account/findAll">查看所有用户</a><br/>
<button id="btn">查询所有ajax</button>
<a href="account/findAll3">查看所有用户3</a><br/>
</body>
</html>
