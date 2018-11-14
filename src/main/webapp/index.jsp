<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>
<h2>PROJET CINEMA</h2>
<c:if test="${sessionScope.get('connection')!= true }">
    <form action="/Session" method="post">
        <p>
            <input type="text"  placeholder="login" required="required" name="login"/>
            <input type="text" placeholder="pass" required="required" name="pass"/>
            <button type="submit" action="/info">Envoyer</button>
        </p>
    </form>
</c:if>
<c:if test="${sessionScope.get('connection')== true }">
        <form action="/liste" method="get">
            <input checked type="radio" id="global1" name="global" value="0">
            <label for="global1">liste film alphabetique croissant :</label>
            <br>
            <input type="radio" id="global2" name="global" value="1">
            <label for="global2"> liste film alphabetique decroissant :</label>
            <br>
            <input type="radio" id="global3" name="global" value="2">
            <label for="global3">liste film par classement croissant :</label>
            <br>
            <input type="radio" id="global4" name="global" value="3">
            <label for="global3">liste film par classement decroissant :</label>
            <br>
            <button type="submit">Envoyer</button>
        </form>
        <form action="/info" method="post">
            <p>
                <label for="recherche">recherche :</label>
                <input type="text" id="recherche" name="name"/>
                <button type="submit" action="/info">Envoyer</button>
            </p>
        </form>
</c:if>
</body>
</html>