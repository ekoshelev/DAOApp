<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>
        <div>
            <table>
                <thead>
                    <tr>
                        <th>Book ID</th><th>Title</th><th>Author</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="e" items="${books}">
                        <tr>
                            <td>${e.getId()}</td> <td>${e.getTitle()}</td>
                            <td>${e.getAuthor()}</td> <td>
                            <td style="border: none;">
                                <div>
                                    <form method="post" action="bookUpdate.jsp">
                                        <input type="hidden"  name="id" value="${e.getId()}"/> 
                                        <input type="hidden"  name="title" value="${e.getTitle()}"/> 
                                        <input type="hidden"  name="author" value="${e.getAuthor()}"/> 
                                        <input type="submit" value="Update"/> 
                                    </form>
                                </div>
                            </td>
                            <td style="border: none;">
                                <div>
                                    <form method="post" action="DeleteServlet">
                                        <input type="hidden"  name="id" value="${e.getId()}"/> 
                                        <input type="submit" value="Delete"/> 
                                    </form>
                                </div>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>