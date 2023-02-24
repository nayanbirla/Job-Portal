<%-- 
    Document   : editprofile
    Created on : 16 Jan, 2023, 5:15:50 PM
    Author     : nayan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="com.entity.User"%>
<%
User ur=(User)request.getSession().getAttribute("obj");
if(ur==null)
{
    response.sendRedirect("login.jsp");
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile Page</title>
        <%@include file="Allcomponent/allcss.jsp"%>
    </head>
    <body style="background-color: #f7f7f7;">
        <%@include file="Allcomponent/navbar.jsp"%>
        <div class="container-fluid">
            <div class="row p-4">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-body">
                            <div class="text-centre">
                                <i class="fa fa-user-plus fa-2x" aria-hidden="true"></i>
                                <h5>Edit Profile</h5>
                            </div>
                            <form action="Updateprofile" method="post">
                                <input type="hidden" name="id" value="<%=ur.getId()%>">
                                <div class="form-group">
                                    <label>Enter Full Name</label>
                                    <input type="text" required="required" class="form-control" id="exampleInputEmail" aria-describedby="emailHelp"
                                           name="name" value="<%=ur.getName()%>">
                                </div>
                                <div class="form-group">
                                    <label>Enter Qualification</label>
                                    <input type="text" required="required" class="form-control" id="exampleInputEmail" aria-describedby="emailHelp" name="qua" value="<%=ur.getQualification()%>">
                                </div>
                                <div class="form-group">
                                    <label>Enter Email</label>
                                    <input type="text" required="required" class="form-control" id="exampleInputEmail" aria-describedby="emailHelp" name="email" value="<%=ur.getEmail()%>">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword">Enter Password</label>
                                    <input type="password" required="required" class="form-control" id="exampleInputEmail" aria-describedby="emailHelp" name="ps" value="<%=ur.getPassword()%>">
                                </div>
                                <button type="submit" class="btn btn-primary badge-pill btn-block">Update</button>
                                          
                            </form>                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
