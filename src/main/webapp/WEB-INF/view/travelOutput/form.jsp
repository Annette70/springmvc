<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exchange Student</title>
</head>
<body>
<c:url value="/travel/processForm" var="actionUrl"/>
<form:form action="${actionUrl}" modelAttribute="exchStudent">

    Home Country:
    <form:select path="homeCountry">
        <form:option value="BR" label="Brazil"/>
        <form:option value="FR" label="France"/>
        <form:option value="IN" label="India"/>
    </form:select>

    <br>

    HostCountry:
    <form:select path="hostCountry">
        <form:options items="${countries.map}"/>
    </form:select>

    <br>

    Grade Level:
    <form:select path="gradeLevel">
        <form:options items="${gradeLevels}"/>
    </form:select>

    <br>

    <form:radiobuttons path="travelMethod" items="${travelMethods}"/>
    <br>
    <form:checkbox path="spokenLanguages" value="English"/> English
    <br>
    <form:checkbox path="spokenLanguages" value="Turkish"/> Turkish
    <br>
    <form:checkbox path="spokenLanguages" value="German"/> German

    <br>

    <input type="submit">
</form:form>
</body>
</html>