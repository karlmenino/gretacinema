<%--
  Created by IntelliJ IDEA.
  User: CDI
  Date: 14/11/2018
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Info de connexion</title>
</head>
<body>
<h1>liste des films vue par ${sessionScope.get("user").login}</h1>
<ul>
    <c:forEach items="${sessionScope.get('user').film}" var="film">
        <li><a href='/info?id=${film.id}'>${film.titre}</a></li>
    </c:forEach>
</ul>
<a href='/index.jsp' type='button'>acceuil</a>
</body>
</html>
