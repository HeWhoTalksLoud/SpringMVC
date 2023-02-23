<%--
  Created by IntelliJ IDEA.
  User: Pasha
  Date: 23.02.2023
  Time: 1:26
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ввод данных</title>
</head>
<body>
    Введите название страны и ее столицу
    <br>
    <br>
    <form action="/skypro/showInfo" method="get">
        <input type="text" name="countryName" placeholder="Название страны">
        <input type="text" name="capitalName" placeholder="Название столицы">
        <input type="submit">

    </form>
</body>
</html>
