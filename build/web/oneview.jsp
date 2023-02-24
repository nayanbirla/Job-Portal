<%-- 
    Document   : oneview
    Created on : 3 Jan, 2023, 11:21:40 PM
    Author     : nayan
--%>

<%@page import="com.entity.Jobs"%>
<%@page import="com.dao.Jobdao"%>
<%@page import="DBConnection.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View More</title>
        <%@include file="Allcomponent/allcss.jsp"%>
    </head>
    <body style="background-color: #f0f1f2;">
        <%@include file="Allcomponent/navbar.jsp"%>
       <div class="container">
           <div class="row">
               <div class="col-md-12">
                   <%
                       int id=Integer.parseInt(request.getParameter("id"));
                       Jobdao dao=new Jobdao(DBConnection.getConnection());
                       Jobs j=dao.getEditJobs(id);
                       %>
                       <div class="card mt-5">
                           <div class="card-body">
                               <div class="text-center text-primary">
                                   <i class="far fa-clipboard fa-2x"></i>
                               </div>
                               <h6><%=j.getTitle()%></h6>
                               <p><%=j.getDescription()%></p>
                               <br>
                               <div class="form-row">
                                   <div class="form-group col-md-3">
                                       <input type="text" class="form-control form-control-sm" value="location: <%=j.getLocation()%>" readonly>
                                       
                                   </div>
                                       <div class="form-group col-md-3">
                                           <input type="text" class="form-control-sm" value="location: <%=j.getLocation()%>" readonly>
                               </div>
                               <div class="form-group col-md-3">
                                   <input type="text" class="form-control form-control-sm" value="Category: <%=j.getCategory()%>" readonly>
                               </div>    
                                   
                           </div>
                               <h6>
                                   Publish Date:
                                   <%=j.getPdate().toString()%></h6>
                                   
                                                        </div>
                       </div>
               </div>
           </div>
       
       </div>
    </body>
</html>
