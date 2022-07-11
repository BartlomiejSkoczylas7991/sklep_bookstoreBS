<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List books</title>
</head>
<body>
<h2>Books:</h2>
<div>
    <table>
        <tr>
            <th>Nazwa</th>
            <th>Wydawnictwo</th>
            <th>Cena</th>
            <th>Kategoria</th>
        </tr>
        <c:forEach var="books" items="${books}" >
            <tr>
                <td>${books.nazwa}</td>
                <td>${books.wydawnictwo}</td>
                <td>${books.cena}</td>
                <td>${books.kategoria.nazwa}</td>
            </tr>
        </c:forEach>
    </table>

    <div>
        <input type="button" value="Add Book"
               onclick="window.location.href='formadd';return false;" />
    </div>


</div>
</body>
</html>