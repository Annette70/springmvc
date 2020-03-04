<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: akratzke1
  Date: 2020-03-03
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
    .error {
    font-size: smaller;
    color: red;
    }
    </style>
</head>
<body>
<h3>Claim Your Free Tickets</h3>

<form:form modelAttribute="theCustomer" action="processForm">
First Name:
    <form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error">
    </form:errors>
    <br>
    <br>
    Last Name:
    <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error">
    </form:errors>
    <br>
    <br>
    Free Passes:
    <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error">
    </form:errors>
    <br>
    <br>
    Postal Code:
    <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error">
    </form:errors>
    <br>
    <br>
    Event Code:
    <form:input path="eventCode"/>
    <form:errors path="eventCode" cssClass="error">
    <input type="submit">
    </form:errors>
</form:form>
</body>
</html>
