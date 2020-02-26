<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>A Simple Form</title>
</head>
<body>
<h2>Be Shouted At</h2>
<c:url value="/shout" var="actionUrl"/>

<form method="get" action="${actionUrl}">
    <input type="text" name="studentName" placeholder="StudentName">
    <br>
    <input type="submit">
</form>


<h2>Be Shouted At Again</h2>
<c:url value="/shoutAgain" var="actionUrl"/>
<form method="get" action="${actionUrlAgain}">
    <input type="text" name="studentName" placeholder="StudentName">
    <br>
    <input type="submit">
</form>

</body>
</html>
