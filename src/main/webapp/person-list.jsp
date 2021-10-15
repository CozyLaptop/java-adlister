<%@ page import="entity.Person" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<% request.setAttribute("people", new Person[]{
        new Person("Albert", "Dominguez", 26),
        new Person("John", "Dominguez", 35),
        new Person("Nica", "McGarfy", 80)
}); %>
<html>
<head>
    <title>3 People</title>
<%--    <%@include file="css/style.css" %>--%>
    <link type="text/css" rel="stylesheet" href="<c:url value="css/style.css" />" />

</head>
<body>
<ul>
    <c:forEach items="${people}" var="person">
        <li>
                ${person.firstName}
                ${person.lastName}
                ${person.age}
        </li>
    </c:forEach>
</ul>
<%@include file="partials/display-extra-person.jsp"%>
</body>
</html>
