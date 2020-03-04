<%--
  Created by IntelliJ IDEA.
  User: akratzke1
  Date: 2020-03-03
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirm Event Ticket</title>
</head>
<body>
 Thank you,${theCustomer.fullName}
<br>
You will receive ${theCustomer.freePasses} free passes to ${theCustomer.eventCode}
<br>
Your postal code is ${theCustomer.postalCode}
</body>
</html>
