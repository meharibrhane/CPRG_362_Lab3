<%-- 
    Document   : arithmeticcalculator
    Created on : May 31, 2022, 12:15:57 PM
    Author     : mehari
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
        <form method="POST" action="agecalculator.jsp">
            <label for="firstNumber">First:</label>
            <input type="text" name="firstNumber" value="${firstNum}">
            <br>
             <label for="secondNumber">Second:</label>
            <input type="text" name="secondNumber" value="${secondNum}">
            <br>
            <button type="submit" name="operation" value="a">+</button>
            <button type="submit" name="operation" value="b">-</button>
            <button type="submit" name="operation" value="c">*</button>
            <button type="submit" name="operation" value="d">%</button>
        </form>
            <p>Result: ${message}</p>
            <a href="/Calculator/age">Age Calculator</a>
    </body>
</html>
