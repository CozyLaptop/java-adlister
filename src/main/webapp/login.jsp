<%--
  Created by IntelliJ IDEA.
  User: ajd
  Date: 10/15/21
  Time: 10:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username != null && password != null){
        if (username.equals("admin") && password.equals("password")){
            response.sendRedirect("/profile.jsp");
        }
    }

%>
<html>
<head>
    <title>Logging in</title>
</head>
<body>
<h1>Login</h1>
<form method="post">
    <label for="username"></label>
    <input type="text" placeholder="username" id="username" name="username">
    <label for="password"></label>
    <input type="password" placeholder="password" id="password" name="password">
    <button type="submit">Submit</button>
</form>
</body>
</html>
