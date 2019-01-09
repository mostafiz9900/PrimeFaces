<%-- 
    Document   : login
    Created on : Jan 9, 2019, 9:06:46 AM
    Author     : User
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="authentic.jsp">
            Username : <input type="text" name="username"/><br>
            Password : <input type="password" name="password"/><br>
            <input type="submit" value="Login"/>
        </form>
    </body>
    <font color="red">
    <c:if test="${empty param.errMsg}">
        <c:out value="${param.errMsg}"/>
    </c:if>
    </font>
</html>
