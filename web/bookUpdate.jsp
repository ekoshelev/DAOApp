
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Book Update Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>
        <div id="mystyle" class="myform">
            <form id="form" name="form" action="UpdateServlet" method="get">
                <h1>Update Book ID:${param.id}</h1>
                <p>Modify the following information to update book ID:${param.id}</p>
                <label><input type="hidden" name="id" id="id" value="${param.id}"/>
                <span class="small"></span></label>                    
                <label>Name<span class="small">Enter Title</span></label>
                <input type="text" name="title" id="title" value="${param.title}"/>
                <label>Phone<span class="small">Enter Author</span></label>
                <input type="text" name="author" id="author" value="${param.author}"/>                         
                <button type="submit">Update Book</button>
                <div class="spacer"></div>
            </form>
        </div>   
    </body>
</html>