<%--
  Created by IntelliJ IDEA.
  User: tsimafei.shostka
  Date: 10/16/2019
  Time: 4:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>People</title>
</head>
<body>
<table>
    <tr>
        <th>Id</th>
    <th>Name</th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>
                    <a href="people/${user.id}">${user.id}</a>
            </td>
            <td>${user.name}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
