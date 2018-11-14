<%--
  Created by IntelliJ IDEA.
  User: CDI
  Date: 14/11/2018
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Liste de film</title>
</head>
<body>
<h1>les film</h1>
<ul>
<c:forEach items="${liste}" var="film">
    <li><a href='/info?id=${film.id}'>${film.titre}</a></li>
</c:forEach>
</ul>
</body>
</html>
