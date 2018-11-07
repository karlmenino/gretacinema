<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>
<h2>PROJET CINEMA</h2>
<form action="/liste" method="get">
    <p><label for="global"> liste film alphabétique croissant :</label> <input type="checkbox" id="global" name="global" value="0" /></p>
    <p><label for="global"> liste film alphabétique décroissant :</label> <input type="checkbox" id="global" name="global" value="1" /></p>
    <p><label for="global"> liste film note croissant :</label> <input type="checkbox" id="global" name="global" value="2" /></p>
    <p><label for="global"> liste film note décroissant :</label> <input type="checkbox" id="global" name="global" value="3" /></p>
    <input type="submit"/>
    <form action="/liste" method="get">
        <input type="radio" id="global1"
               name="global">
        <label for="global1">liste film alphabetique croissant :</label>
        <br>
        <input type="radio" id="global2"
               name="global" value="1">
        <label for="global2"> liste film alphabetique décroissant :</label>
        <br>
        <input type="radio" id="global3"
               name="global" value="2">
        <label for="global3">liste film note croissant :</label>
        <br>
        <input type="radio" id="global3"
               name="global" value="3">
        <label for="global3">liste film note decroissant :</label>
        <button type="submit">Envoyer</button>
</form>
</body>
</html>
