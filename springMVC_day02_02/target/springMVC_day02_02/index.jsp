<%--
  Created by IntelliJ IDEA.
  User: 龙龙
  Date: 2018/11/2
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <form action="user/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="upload"><br>
        <input type="submit" value="点击上传文件">
    </form>
</body>
</html>
