<%-- 
    Document   : login
    Created on : 3 Dec, 2022, 11:32:55 PM
    Author     : nayan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
         <%@include file="Allcomponent/allcss.jsp" %>
    </head>
    <body style="background-color: #f0f1f2;">
        <%@include file="Allcomponent/navbar.jsp" %>
        <div class="container-fluid">
            <div class="row p-5">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-body">
                            <div class="text-center">
                                <i class="fa fa-user-plus fa-2x" aria-hidden="true"></i>
                                <h5>Login Page</h5>
                               
                            </div>
                            <c:if test="${not empty succMsg}">
                                <h4 class="text-center text-danger">${succMsg }</h4>
                                <c:remove var="succMsg"/>
                            </c:if>
                                <form action="Login" method="post">
                                    <div class="form-group">
                                        <label>Enter Mail</label><input type="email" required="required" class="form-control"
                                                                        id="exampleInputEmail" aria-describedby="emailHelp" name="em">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Enter Password</label>
                                        <input required="required" type="password" class="form-control" id="exampleInputPassword1" name="ps">
                                    </div>
                                    <button type="submit" class="btn btn-primary badge-pill btn-block">Login</button>
                                        
                                </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
