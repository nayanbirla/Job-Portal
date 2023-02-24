<%-- 
    Document   : navbar
    Created on : 2 Dec, 2022, 10:04:19 PM
    Author     : nayan
--%>
<%@page import="com.entity.User"%>
<% User u=(User)request.getSession().getAttribute("obj");%>
<nav class="navbar navbar-expand-lg navbar-dark bg-custom">
  <a class="navbar-brand" href="#">Job Portal</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      <%if(u!=null){
          String s=u.getRole();
          if(s.equals("admin"))
          {    
      %>
      <li class="nav-item">
        <a class="nav-link" href="addjob.jsp"><i class="fa fa-plus-circle"></i>Post Job</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="viewjob.jsp"><i class="fas fa-eye"></i>View Job</a>
      </li>
     <%}}%>
      
      
      
      
    </ul>
    <form class="form-inline my-2 my-lg-0">
       <%if(u!=null){
          String s=u.getRole();
          if(s.equals("admin"))
          {    
          %>
            <a href="#" class="btn btn-light mr-1"><i class="fas fa-user"></i>Admin</a>
         <a href="Logout" class="btn btn-light"><i class="fas fa-sign-in-alt"></i>Logout</a>
        
         <%}
else if(s.equals("user")){%>
            <a href="#" class="btn btn-light mr-1" data-toggle="modal" data-target="#exampleModal"><i class="fas fa-sign-in-alt"></i><%=u.getName()%></a>
         <a href="Logout" class="btn btn-light"><i class="fas fa-user"></i>Logout</a>
        <%}}
        
else{%>
            
        <a href="login.jsp" class="btn btn-light mr-1"><i class="fas fa-sign-in-alt"></i>Login</a>
         <a href="signup.jsp" class="btn btn-light"><i class="fas fa-user"></i>signup</a>
        <%}%>
        
        
    </form>
  </div>
</nav>
<%if(u!=null){%>      
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Profile</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
          <div class="card">
              <div class="card-body">
                  <div class="text-center text-primary">
                      <i class="fas fa-user-circle fa-3x"></i>
                  </div>
                  <table class="table">
                      <tbody>
                          <tr>
                              <th scope="row">Name</th>
                              <th><%=u.getName()%></th>
                          </tr>
                          <tr>
                              <th scope="row">Qualification</th>
                              <th><%=u.getQualification()%></th>
                          </tr>
                          <tr>
                              <th scope="row">Email</th>
                              <th><%=u.getEmail()%></th>
                          </tr>
                      </tbody>
                  </table>
              </div>
          </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <a href="editprofile.jsp" class="btn btn-primary">Edit</a>
      </div>
    </div>
  </div>
</div>   
                <%}%>         
