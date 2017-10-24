
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <div id="mystyle" style="border: none;">
            <p>
                <%=new Date()%><br>  <br>
                <a href="bookAddNew.jsp">Add New Book</a> &NegativeThickSpace; |
                <a href="bookView.jsp">View Book</a>
            </p>
        </div>
    </center>
</body>
</html>