<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirmation</title>
</head>
<body>

Home country: ${exchStudent.homeCountry}
<br>
Host country: ${exchStudent.hostCountry}
<br>
Travel method: ${exchStudent.travelMethod}
<br>
Grade level: ${exchStudent.gradeLevel}

<ul>
    <c:forEach items="${exchStudent.spokenLanguages}" var="aLanguage">
        <li>${aLanguage}</li>
    </c:forEach>
</ul>

</body>
</html>
