<%--
  Created by IntelliJ IDEA.
  User: 龙龙
  Date: 2018/11/3
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>success</title>
</head>
<body>
    <h2>跳转成功</h2>
    <c:forEach items="${list}" var="account">
        <c:out value="${account.name}"></c:out>
    </c:forEach>
</body>
</html>
