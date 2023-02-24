<%-- 
    Document   : moveview
    Created on : 3 Jan, 2023, 11:45:40 PM
    Author     : nayan
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.entity.Jobs"%>
<%@page import="com.dao.Jobdao"%>
<%@page import="DBConnection.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User :View Jobs</title>
        <%@include file="Allcomponent/allcss.jsp"%>
        
    </head>
    <body style="background-color: #f0f1f2">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h5 class="text-center text-primary">All Jobs</h5>
                    <%String loc=request.getParameter("loc");
                      String cat=request.getParameter("cat");
                      String msg="";
                      Jobdao dao=new Jobdao(DBConnection.getConnection());
                      List<Jobs> list=null;
                      if("lo".equals(loc) && "ca".equals(cat))
                      {
                         list=new ArrayList<Jobs>();
                         msg="Job not available";
                         
                      }else if("lo".equals(loc) || "ca".equals(cat))
                      {
                          list=dao.getJobscl(cat,loc);
                      }
                      else{
                          list=dao.getJobsclboth(cat,loc);
                      }
                      if(list.isEmpty()){
                          
                      
                    %>
                    <h4 class="text-center text-danger">Job Not Available</h4>
                    <%}
                    if(list!=null){
for(Jobs j: list){
%>
<div class="cart mt-2">
    <div class="card-body">
        <div class="text-center text-primary">
            <i class="far fa-clipboard fa-2x"></i>
            
        </div>
        <h6><%=j.getTitle()%></h6>
        <p><%=j.getDescription()%>
            <br>
        <div class="form-row">
            <div class="form-group col-md-3">
                <input type="text" class="form-control form-control-sm" value="location: <%=j.getLocation()%>" readonly>
                
            </div>
                <div class="form-group col-md-3">
                    <input type="text" class="form-control form-control-sm" value="category: <%=j.getCategory()%>" readonly>
                    
        </div>
                    <h6>
                        Publish Date:
                        <%=j.getPdate().toString()%></h6>
                        <div class="text-center">
                            <a href="oneview.jsp?id=<%=j.getId()%>" class="btn btn-sm bg-success text-white">View</a>
        </div>
        </div>
    </div>
        <%}
}else{%>
<h4 class="text-center text-danger"><%=msg%></h4>
<%}%>
    
</div>
                </div></div></div>

                    
                    
                    
    </body>
</html>
