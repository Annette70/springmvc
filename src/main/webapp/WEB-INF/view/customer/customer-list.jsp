<%@ taglib prefix="c" uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<table>
    <tr>
    <th>Name</th>
    <th>Free Passes</th>
    <th>Postal Code</th>
    <th>Event Code</th>
</tr>
    <c:ForEach items="${allCustomers}" var="aCustomer">
        <tr>
            <td>${aCustomer.fullName}</td>
            <td>${aCustomer.freePasses}</td>
            <td>${aCustomer.postalCode}</td>
            <td>${aCustomer.eventCode}</td>
        </tr>
    </c:ForEach>
</table>
</body>
</html>
