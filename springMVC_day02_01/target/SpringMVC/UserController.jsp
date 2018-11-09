<%--
  Created by IntelliJ IDEA.
  User: 龙龙
  Date: 2018/11/1
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserController</title>
</head>
<body>
    <form action="/user/userController" method="post">
        账号:<input name="username"><br>
        密码:<input name="password"><br>
        年龄:<input name="age"><br>
        <input type="submit" value="提交">
    </form>

    <br>

    <a href="/user/userController1">User测试</a><br>

    <a href="/user/userController2">ModelAndView测试</a>


    <a href="/user/forwordAndRedirect">forwordAndRedirect的测试</a>
</body>
</html>
