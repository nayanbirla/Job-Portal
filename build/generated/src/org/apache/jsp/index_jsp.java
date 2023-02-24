package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DBConnection.DBConnection;
import java.sql.Connection;
import com.entity.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Allcomponent/allcss.jsp");
    _jspx_dependants.add("/Allcomponent/navbar.jsp");
    _jspx_dependants.add("/Allcomponent/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css\" integrity=\"sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"Allcomponent/style.css\">");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .back-img{\n");
      out.write("                background: url(\"img/job3.jpg\");\n");
      out.write("                width: 100%;\n");
      out.write("                height: 80vh;\n");
      out.write("                /*container-fluid: 100vh;*/\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write('\n');
      out.write('\n');
 User u=(User)request.getSession().getAttribute("obj");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\">Job Portal</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      ");
if(u!=null){
          String s=u.getRole();
          if(s.equals("admin"))
          {    
      
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"addjob.jsp\"><i class=\"fa fa-plus-circle\"></i>Post Job</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"viewjob.jsp\"><i class=\"fas fa-eye\"></i>View Job</a>\n");
      out.write("      </li>\n");
      out.write("     ");
}}
      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("       ");
if(u!=null){
          String s=u.getRole();
          if(s.equals("admin"))
          {    
          
      out.write("\n");
      out.write("            <a href=\"#\" class=\"btn btn-light mr-1\"><i class=\"fas fa-user\"></i>Admin</a>\n");
      out.write("         <a href=\"Logout\" class=\"btn btn-light\"><i class=\"fas fa-sign-in-alt\"></i>Logout</a>\n");
      out.write("        \n");
      out.write("         ");
}
else if(s.equals("user")){
      out.write("\n");
      out.write("            <a href=\"#\" class=\"btn btn-light mr-1\" data-toggle=\"modal\" data-target=\"#exampleModal\"><i class=\"fas fa-sign-in-alt\"></i>");
      out.print(u.getName());
      out.write("</a>\n");
      out.write("         <a href=\"Logout\" class=\"btn btn-light\"><i class=\"fas fa-user\"></i>Logout</a>\n");
      out.write("        ");
}}
        
else{
      out.write("\n");
      out.write("            \n");
      out.write("        <a href=\"login.jsp\" class=\"btn btn-light mr-1\"><i class=\"fas fa-sign-in-alt\"></i>Login</a>\n");
      out.write("         <a href=\"signup.jsp\" class=\"btn btn-light\"><i class=\"fas fa-user\"></i>signup</a>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        <!-- Button trigger modal -->\n");
      out.write("<button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModal\">\n");
      out.write("  Launch demo modal\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Modal title</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <div class=\"card\">\n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                  <div class=\"text-center text-primary\">\n");
      out.write("                      <i class=\"fas fa-user-circle fa-3x\"></i>\n");
      out.write("                  </div>\n");
      out.write("                  <table class=\"table\">\n");
      out.write("                      <tbody>\n");
      out.write("                          <tr>\n");
      out.write("                              <th scope=\"row\">Name</th>\n");
      out.write("                              <th>");
      out.print(u.getName());
      out.write("</th>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <th scope=\"row\">Qualification</th>\n");
      out.write("                              <th>");
      out.print(u.getQualification());
      out.write("</th>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <th scope=\"row\">Email</th>\n");
      out.write("                              <th>");
      out.print(u.getEmail());
      out.write("</th>\n");
      out.write("                          </tr>\n");
      out.write("                      </tbody>\n");
      out.write("                  </table>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\">Edit</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        ");
Connection conn=DBConnection.getConnection();
      out.write("\n");
      out.write("        <div class=\"container-fluid back-img\">\n");
      out.write("            <div class=\"text-centre\">\n");
      out.write("                <h1 class=\"text-white p-4\">\n");
      out.write("                    <i class=\"fa fa-book\" aria-hidden=\"true\"></i>Online Job Portal\n");
      out.write("                </h1>\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("   \n");
      out.write("        ");
      out.write("\n");
      out.write("<div class=\"container-fluid p-1 bg-custom\">\n");
      out.write("    <p class=\"text-center text-white\">Design & Developed By Nayan Birla</p>\n");
      out.write("</div>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
