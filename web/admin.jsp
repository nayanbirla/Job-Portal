<%-- 
    Document   : admin
    Created on : 4 Dec, 2022, 12:10:58 AM
    Author     : nayan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.entity.User"%>
<%
User auth=(User)request.getSession().getAttribute("obj");
if(auth!=null)
{
    String s=(String)auth.getRole();
    if(s.equals("admin"))
    {
        
    }
    else
    {
        response.sendRedirect("login.jsp");
    }
}
else
{
    response.sendRedirect("login.jsp");
}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
        <%@include file="Allcomponent/allcss.jsp" %>
        <style type="text/css">
            .back-img{
                background-image: url('img/admin.jpeg');
                height: 89vh;
                width: 100%;
                background-repeat: no-repeat;
                background-size: cover;
            }
        </style>
    </head>
    <body>
        <%@include file="Allcomponent/navbar.jsp" %>
        <div class="container-fluid back-img">
            <div class="text-center">
                <h1 class="text-white p-4">Welcome Admin</h1>
            </div>
        </div>
    </body>
</html>
