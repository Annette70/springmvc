<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Invoice</title>
</head>
<body>

<c:url value="/check" var="actionUrl"/>

<form method="get" action="${actionUrl}">
    <input type="text" name="cardNumber" placeholder="1234567890123456">
    <br>
    <input type="text" name="nameOnCard" placeholder="Ex. John Smith">
    <br>
    <input type="text" name="expirationDate" placeholder="01/19">
    <br>
    <input type="text" name="securityCode" placeholder="123">
    <br>
    <input type="submit">
</form>
</body>
</html>
