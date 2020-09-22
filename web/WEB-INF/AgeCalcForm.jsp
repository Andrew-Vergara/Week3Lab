<%-- 
    Document   : AgeCalcForm
    Created on : 22-Sep-2020, 10:20:31 AM
    Author     : redma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator </h1>
        <form method="post" action="agecalc">
            Age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="submit">
        </form>
        <p>${message}</p>
        <a href="Calc.jsp">Arithmetic Calculator</a>
    </body>
</html>
