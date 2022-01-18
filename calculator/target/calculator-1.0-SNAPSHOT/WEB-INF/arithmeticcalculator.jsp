<%-- 
    Document   : arithmeticCalculator
    Created on : Jan. 16, 2022, 2:19:14 p.m.
    Author     : peony
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
           <form action="arithmetic" method="post">
               
            <label for="firstnum">First:</label>
            <input type="text" name="firstnum" id="firstnum" >
            <br>
            <label for="secondnum">Second:</label>
            <input type="text" name="secondnum" id="secondnum" >
            <br>
            <input type="submit" name="operation" value="+" >
            <input type="submit" name="operation" value="-" >
            <input type="submit" name="operation" value="*" >
            <input type="submit" name="operation" value="%" >
            
        </form>
        <p>${message}</p>
        
        <a href="age">Age Calculator</a>
        
        
        
    </body>
</html>
