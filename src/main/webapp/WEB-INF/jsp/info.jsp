<%--
  Created by IntelliJ IDEA.
  User: CDI
  Date: 14/11/2018
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Info de ${film.titre}</title>
</head>
<body>
<h1>${film.titre}</h1>
<img height='150' width='150' src="/affiche?id=${film.id}">
<h2>la note de ce film est ${film.note} </h2>
<a href='/Session' type='button'>acceuil</a>

</body>
</html>
