<%-- 
    Document   : home.jsp
    Created on : 23 Dec, 2022, 7:41:41 PM
    Author     : nayan
--%>

<%@page import="java.util.List"%>
<%@page import="com.entity.Jobs"%>
<%@page import="DBConnection.DBConnection"%>
<%@page import="com.dao.Jobdao"%>
<%@page import="com.entity.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User : View Jobs</title>
        <%@include file="Allcomponent/allcss.jsp"%>
    </head>
    <body style="background-color: #f0f1f2;">
                          <%
User auth=(User)request.getSession().getAttribute("obj");
if(auth==null)
{
    response.sendRedirect("login.jsp");
}

%>
                        <%@include file="Allcomponent/navbar.jsp"%>
                        <div class="container">
                            <div class="row">
                                <div class="col-md-12">
                                    <h5 class="text-center text-primary">All Jobs</h5>
                                    <c:if test="${not empty succmsg}">
                                        <h4 class="text-center text-danger">${succmsg}</h4>
                                        <c:remove var="succmsg"/>
                                    </c:if>
                                        <div class="card">
                                            <div class="card-body">
                                                <form class="form-inline" action="moveview.jsp" method="get">
                                                    <div class="form-group col-md-5 mt-1">
                                                        <h5>Location</h5>
                                                    </div>
                                                    <div class="form-group col-md-4 mt-1">
                                                        <h5>Category</h5>
                                                    </div>
                                                    
                                                    <div class="form-group col-md-5">
                                                        <select name="loc" class="custom-select" id="inlineFormCustomSelectPref">
                                        <option selected value="lo">Choose...</option>
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
                                                    <div class="form-group col-md-5">
                                                        <select class="custom-select" id="inlineFormCustomSelectPref" name="cat">
                                                            <option value="ca" selected>Choose...</option>
                                        <option value="IT">IT</option>
                                        <option value="Developer">Developer</option>
                                        <option value="Banking">Banking</option>
                                        <option value="Engineer">Engineer</option>
                                        <option value="Teacher">Teacher</option>
                                                        </select>
                                                    </div>
                                                    <button class="btn btn-success">Submit</button>
                                                    
                                                </form>
                                            </div>
                                         </div>
                                        <%
                                        Jobdao jd=new Jobdao(DBConnection.getConnection());    
                                        List<Jobs> list=jd.getAllJobsuser();
                                        for(Jobs j: list)
                                        {
                                        %>
                                        <div class="card mt-2">
                                            <div class="card-body">
                                                <div class="text-center text-primary">
                                                    <i class="far fa-clipboard fa-2x"></i>
                                                </div> 
                                                <h6><%=j.getTitle()%></h6>
                                                <%
                                                    if(j.getDescription().length()>0 && j.getDescription().length()<120)
                                                    {
                                                        %>
                                                        <p><%=j.getDescription()%></p>
                                                        <%}else{%>
                                                        <p><%=j.getDescription().substring(0,120)%>...</p>
                                                        <%}
                                                        %>
                                                        <br>
                                                        <div class="form-row">
                                                            <div class="form-group col-md-3">
                                                                <input type="text" class="form-control form-control-sm" value="Location: <%=j.getLocation()%>" readonly>
                                                                
                                                            </div>
                                                                <div class="form-group col-md-3">
                                                                <input type="text" class="form-control form-control-sm" value="Category: <%=j.getCategory()%>" readonly>
                                                                </div>
                                                            </div>
                                                                <h6>
                                                                    Publish Date:
                                                                    <%=j.getPdate().toString()%></h6>
                                                                    <div class="text-center">
                                                                        <a href="oneview.jsp?id=<%=j.getId()%>" class="btn btn-sm bg-success text-white">View More</a>         
                                                                    </div>
                                                    
                                                                 </div>
                                                                </div>
                                                               
                                                                        <%}%>
                        
                        
                                                              
        
    </body>
</html>
