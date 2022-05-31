<%-- 
    Document   : agecalculator
    Created on : May 25, 2022, 12:59:40 PM
    Author     : mehar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age"> 
            <label>Enter your age</label>
            <input type="number" name = "age" value="number">
            <br>
            <label>
                <input type="submit" name="age_next_birthday" value="Age next birthday">
                
                
            </label>   
        </form> 
        <p>${message}</p> 
        <a href="/Calculator/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
