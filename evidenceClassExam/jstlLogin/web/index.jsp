<%-- 
    Document   : index
    Created on : Jan 9, 2019, 9:06:09 AM
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
        <c:if test="${empty sessionScope['loginUser']}">
            <c:redirect url="login.jsp">
                
            </c:redirect>
        </c:if>
            <c:out value="${sessionScope['loginUser']}"/>
            <a href="login.jsp">jjjj</a>
    </body>
</html>
