<%--
  Created by IntelliJ IDEA.
  User: 龙龙
  Date: 2018/11/1
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>resource</title>
    <script src="js/jquery.min.js"></script>


    <script>
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    //编写json格式,属性和值
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"13321","password":"123","age":18}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        //从服务器响应回来的数据
                        alert(data.username)
                    }
                })
            })
        })
    </script>
</head>
<body>

<button id="btn">提交Ajax请求</button>

</body>
</html>
