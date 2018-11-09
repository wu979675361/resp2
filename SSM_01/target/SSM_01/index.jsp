<%--
  Created by IntelliJ IDEA.
  User: 龙龙
  Date: 2018/11/3
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!--导入jquery-->
    <script src="js/jquery-3.3.1.js"></script>
    <title>首页</title>
    <%--<script>
        $(function () {
            $("#save").click(function () {
                //将数据异步加载到controller中
                $.post("user/login",$("#form").serialize(),function (data) {

                })
            });
        })
    </script>--%>
</head>
<body>
    <a href="user/test02">点击测试</a>


    <form action="user/test03" id="form">
        名字:<input name="name">
        存款:<input name="money">
        <%--<button id="save">保存按钮</button>--%>
        <input type="submit" value="提交">
    </form>
</body>
</html>
