<%-- 
    Document   : Calc
    Created on : 22-Sep-2020, 11:11:58 AM
    Author     : redma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="Calc">
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"<br>
            <br>
            <input type="submit" name="plus" value="+">
            <input type="submit" name="minus" value="-">
            <input type="submit" name="modulus" value="%">
            <input type="submit" name="multiply" value="*">
        </form>
            <p>${message}</p>
            <a href="/Week3Lab/agecalc">Age calculator</a>
    </body>
</html>
