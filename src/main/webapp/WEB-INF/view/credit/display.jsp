<%--
  Created by IntelliJ IDEA.
  User: akratzke1
  Date: 2020-02-25
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Confirm Information</h3>
Here is your information:
<br>
Credit card number: ${bindingCredit.cardNumber}
<br>
Name on card: ${bindingCredit.name}
<br>
Expiration date: ${bindingCredit.expirationDate}
<br>
Confirmation code: ${bindingCredit.confirmationCode}
</body>
</html>
