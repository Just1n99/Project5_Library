<%--
  Created by IntelliJ IDEA.
  User: hoans
  Date: 2023-12-15 0015
  Time: 오후 3:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    .alert {
        text-align: center;
    }
</style>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <style>
        img, label {display: inline-block;}
        label{width:130px}
        button{background-color:blue; color:white; font-size:15px}
    </style>
</head>
<body>
<div style='width:100%; text-align: center; padding-top:100px'>
    <form method="post" action="loginOk">
        <div><label>User ID: </label><input type="text" name="userid"/></div>
        <div><label>Password: </label>
        <input type="password" name="password"/></div>
        <button type="submit">login</button>
    </form>
</div>

<c:if test="${not empty error}">
    <div class="alert alert-danger">${error}</div>
</c:if>

</body>
</html>
