<%--
  Created by IntelliJ IDEA.
  User: ajd
  Date: 10/14/21
  Time: 11:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="partials/navbar.html"%>
<jsp:include page="partials/navbar.html" />
<%
String name = "Albert";
%>
<html>
<head>
    <title>My first JSP</title>
</head>
<body>
<h1>
    Hello
    <%=name%>
</h1>
</body>
</html>
