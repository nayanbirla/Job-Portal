<%-- 
    Document   : viewjob
    Created on : 4 Dec, 2022, 12:57:40 AM
    Author     : nayan
--%>

<%@page import="java.util.List"%>
<%@page import="com.entity.Jobs"%>
<%@page import="com.dao.Jobdao"%>
<%@page import="DBConnection.DBConnection"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <title>ViewJob Page</title>
        <%@include file="Allcomponent/allcss.jsp" %>
    </head>
    <body style="background-color: #f0f1f2;">
        <%@include file="Allcomponent/navbar.jsp" %>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h5 class="text-center text-primary">All Jobs</h5>
                    
                            <%Jobdao jd=new Jobdao(DBConnection.getConnection());
                            List<Jobs> list=Jobdao.getAllJobs();
                            for(Jobs j:list)
                            {%>
                              <div class="card mt-2">
                        <div class="card-body">
                            <div class="text-center text-primary">
                                <i class="far fa-clipboard fa-2x">
                                    
                                </i>
                                <c:if test="${not empty msg}">
                                <div class="alert alert-success" role="alert">${ msg}</div>
                                <c:remove var="succMsg"/>
                            </c:if>
                            </div>  
                              <h6><%=j.getTitle()%></h6>
                            <p><%=j.getDescription()%></p>
                            <br>
                            <div class="form-row">
                                <div class="from-group col-md-3">
                                    <input type="text" class="form-control form-control-sm" value="location:<%=j.getLocation()%>" readonly>
                                </div>
                                <div class="form-group col-md-3">
                                    <input type="text" class="form-control form-control-sm" value="category:<%=j.getCategory()%>" readonly>
                                </div>
                                <div class="form-group col-md-3">
                                    <input type="text" class="form-control form-control-sm" value="Status:<%=j.getStatus()%>" readonly>
                                </div>
                                </div>
                            <h6>Publish Date:<%=j.getPdate()%></h6>
                            <div class="text-center">
                                <a href="Editjobs.jsp?id=<%=j.getId()%>" class="btn btn-sm bg-success text-white">Edit</a>
                                <a href="Delete?id=<%=j.getId()%>" class="btn btn-sm bg-danger text-white">Delete</a>
                                
                            </div>
                            </div>
                    </div>
                            <%}
                            %>
                          
                </div>
            </div>
        </div>
        
                      
    </body>
</html>
