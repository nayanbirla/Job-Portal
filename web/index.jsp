<%-- 
    Document   : index
    Created on : 2 Dec, 2022, 10:45:56 PM
    Author     : nayan
--%>

<%@page import="DBConnection.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="Allcomponent/allcss.jsp" %>
        <style type="text/css">
            .back-img{
                background: url("img/job3.jpg");
                width: 100%;
                height: 80vh;
                /*container-fluid: 100vh;*/
                background-repeat: no-repeat;
                background-size: cover;
                
            }
        </style>
    </head>
    <body>
        <%@include file="Allcomponent/navbar.jsp" %>
        <%Connection conn=DBConnection.getConnection();%>
        <div class="container-fluid back-img">
            <div class="text-centre">
                <h1 class="text-white p-4">
                    <i class="fa fa-book" aria-hidden="true"></i>Online Job Portal
                </h1>
            </div>
        </div> 
   
        <%@include file="Allcomponent/footer.jsp" %>
    </body>
</html>
