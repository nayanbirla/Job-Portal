<%-- 
    Document   : addjob
    Created on : 4 Dec, 2022, 12:24:18 AM
    Author     : nayan
--%>

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
        <title>Edit Jobs</title>
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
                            <%int id=Integer.parseInt(request.getParameter("id"));
                                Jobdao dao=new Jobdao(DBConnection.getConnection());
                            Jobs j=dao.getEditJobs(id);
                            %>
                            <h5>Edit Jobs</h5>
                        </div>
                        <form action="Up" method="post">
                            <input type="hidden" value="<%=j.getId()%>" name="id">
                            <div class="form-group">
                                <label>Enter Title</label>
                                <input type="text" name="title" required class="form-control" value="<%=j.getTitle()%>">
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-4">
                                    <label>Location</label>
                                    <select name="location" class="custom-select" id="inlineFormCustomSelectPref">
                                        <option selected value="<%=j.getLocation()%>"><%=j.getLocation()%></option>
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
                                        <option selected value="<%=j.getCategory()%>"><%=j.getCategory()%></option>
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
                                        <option class="Active" value="<%=j.getStatus()%>"><%=j.getStatus()%></option> 
                                        <option class="Active" value="Active">Active</option>
                                         <option class="Inactive" value="Inactive">Inactive</option>
                                    </select>
                                </div>
                            </div>
                        
                        <div class="form-group">
                            <label>Enter Description</label>
                            <textarea required rows="6" cols="" name="desc" class="form-control" ><%=j.getDescription()%></textarea>
                            
                        </div>
                            <button class="btn btn-success">Update Job</button>
                    </form>    
                    </div>
                    </div>
            </div>
        </div>
    </body>
</html>
