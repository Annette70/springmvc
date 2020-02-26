<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: akratzke1
  Date: 2020-02-25
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<c:url value="/credit/processForm" var="actionUrl"/>

<form:form action="${actionUrl}" method="post" modelAttribute="bindingCredit">
    Card number: <form:input path="cardNumber"/>
    <br>
    Name on card: <form:input path="name"/>
    <br>
    Expiration date: <form:input path="expirationDate"/>
    <br>
    Confirmation code: <form:input path="confirmationCode"/>
    <br>
    <input type="submit" value="Submit Information"/>
</form:form>

</body>
</html>
