<%--
  Created by IntelliJ IDEA.
  User: 龙龙
  Date: 2018/11/1
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AccountSave</title>
</head>
<body>
        <form action="/params/accountSave" method="post">
            日期: <input name="date"><br>
            账号:<input name="username"><br>
            密码: <input name="password"><br>

            用户的名字:<input name="user.uname"><br>
            用户的年龄:<input name="user.uage"><br>
            <input type="submit" value="提交">
        </form>
</body>
</html>
