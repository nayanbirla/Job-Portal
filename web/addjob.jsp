<%-- 
    Document   : addjob
    Created on : 4 Dec, 2022, 12:24:18 AM
    Author     : nayan
--%>

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
        <title>JSP Page</title>
        <%@include file="Allcomponent/allcss.jsp" %>
    </head>
    <body style="background-color: #f0f1f2;">
        <%@include file="Allcomponent/navbar.jsp" %>
        <div class="container p-2">
            <div class="col-md-10 offset-md-1">
                <div class="card">
                    <div class="card-body">
                        <div class="text-center text-success">
                            <i class="fas fa-user-friends fa-3x"></i>
                            <c:if test="${not empty msg}">
                                <div class="alert alert-success" role="alert">${ msg}</div>
                                <c:remove var="succMsg"/>
                            </c:if>
                                <h5>Add Jobs</h5>
                        </div>
                        <form action="addjob" method="post">
                            <div class="form-group">
                                <label>Enter Title</label>
                                <input type="text" name="title" required class="form-control">
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-4">
                                    <label>Location</label>
                                    <select name="location" class="custom-select" id="inlineFormCustomSelectPref">
                                        <option selected>Choose...</option>
                                        <option value="odisha">Odisha</option>
                                        <option value="Jharkhand">Jharkhand</option>
                                        <option value="Delhi">Delhi</option>
                                        <option value="Indore">Indore</option>
                                        <option value="Chennai">Chennai</option>
                                        <option value="Hydrabad">Hydrabad</option>
                                        <option value="Mumbai">Mumbai</option>
                                        <option value="Gujurat">Gujurat</option>
                                    </select>
                                </div>
                                <div class="form-group col-md-4">
                                    <label>Category</label>
                                    <select class="custom-select" id="inlineFormCustomSelectPref" name="category">
                                        <option selected>Choose...</option>
                                        <option value="IT">IT</option>
                                        <option value="Developer">Developer</option>
                                        <option value="Banking">Banking</option>
                                        <option value="Engineer">Engineer</option>
                                        <option value="Teacher">Teacher</option>
                                    </select>
                                </div>
                                
                                <div class="form-group col-md-4">
                                    <label>Status</label>
                                    <select class="form-control" name="status">
                                        <option class="Active" value="Active">Active</option>
                                         <option class="Inactive" value="Inactive">Inactive</option>
                                    </select>
                                </div>
                            </div>
                        
                        <div class="form-group">
                            <label>Enter Description</label>
                            <textarea required rows="6" cols="" name="desc" class="form-control"></textarea>
                            
                        </div>
                            <button class="btn btn-success">Publish Job</button>
                    </form>    
                    </div>
                    </div>
            </div>
        </div>
    </body>
</html>
