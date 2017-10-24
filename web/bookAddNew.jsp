
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>New Book</title>
    </head>
    <body>
        <%@include file="header.jsp"%>
        <form method="post" action="AddNewServlet">
            <div id="mystyle" class="myform">
                    <h1>Book</h1>
                    <p>To add new Book enter following information</p>
                    <label>Book ID<span class="small">Enter Book ID</span></label>
                    <input type="text" name="id" id="id" />
                    <label>Title<span class="small">Enter Title</span></label>
                    <input type="text" name="title" id="title" />
                    <label>Author<span class="small">Enter Author</span></label>
                    <input type="text" name="author" id="author" />                   
                    <button type="submit">Add New Book</button>
                    <div class="spacer"></div>
            </div>
        </form>    
    </body>
</html>