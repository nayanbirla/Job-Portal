package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.entity.Jobs;
import com.dao.Jobdao;
import DBConnection.DBConnection;
import com.entity.User;

public final class Editjobs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Allcomponent/allcss.jsp");
    _jspx_dependants.add("/Allcomponent/navbar.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Edit Jobs</title>\n");
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
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #f0f1f2;\">\n");
      out.write("        ");
      out.write('\n');
      out.write('\n');
 User u=(User)request.getSession().getAttribute("userobj");
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
      out.write("        <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
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
      out.write("        <a href=\"login.jsp\" class=\"btn btn-light mr-1\"><i class=\"fas fa-sign-in-alt\"></i>Login</a>\n");
      out.write("         <a href=\"signup.jsp\" class=\"btn btn-light\"><i class=\"fas fa-user\"></i>Signup</a>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("        <div class=\"container p-2\">\n");
      out.write("            <div class=\"col-md-10 offset-md-1\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"text-center text-success\">\n");
      out.write("                            <i class=\"fas fa-user-friends fa-3x\"></i>\n");
      out.write("                            ");
int id=Integer.parseInt(request.getParameter("id"));
                                Jobdao dao=new Jobdao(DBConnection.getConnection());
                            Jobs j=dao.getEditJobs(id);
                            
      out.write("\n");
      out.write("                            <h5>Edit Jobs</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <form action=\"addjob\" method=\"post\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Enter Title</label>\n");
      out.write("                                <input type=\"text\" name=\"title\" required class=\"form-control\" value=\"");
      out.print(j.getTitle());
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-row\">\n");
      out.write("                                <div class=\"form-group col-md-4\">\n");
      out.write("                                    <label>Location</label>\n");
      out.write("                                    <select name=\"location\" class=\"custom-select\" id=\"inlineFormCustomSelectPref\">\n");
      out.write("                                        <option selected value=\"");
      out.print(j.getLocation());
      out.write('"');
      out.write('>');
      out.print(j.getLocation());
      out.write("</option>\n");
      out.write("                                        <option value=\"odisha\">Odisha</option>\n");
      out.write("                                        <option value=\"Jharkhand\">Jharkhand</option>\n");
      out.write("                                        <option value=\"Delhi\">Delhi</option>\n");
      out.write("                                        <option value=\"Indore\">Indore</option>\n");
      out.write("                                        <option value=\"Chennai\">Chennai</option>\n");
      out.write("                                        <option value=\"Hydrabad\">Hydrabad</option>\n");
      out.write("                                        <option value=\"Mumbai\">Mumbai</option>\n");
      out.write("                                        <option value=\"Gujurat\">Gujurat</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group col-md-4\">\n");
      out.write("                                    <label>Category</label>\n");
      out.write("                                    <select class=\"custom-select\" id=\"inlineFormCustomSelectPref\" name=\"category\">\n");
      out.write("                                        <option selected value=\"");
      out.print(j.getCategory());
      out.write('"');
      out.write('>');
      out.print(j.getCategory());
      out.write("</option>\n");
      out.write("                                        <option value=\"IT\">IT</option>\n");
      out.write("                                        <option value=\"Developer\">Developer</option>\n");
      out.write("                                        <option value=\"Banking\">Banking</option>\n");
      out.write("                                        <option value=\"Engineer\">Engineer</option>\n");
      out.write("                                        <option value=\"Teacher\">Teacher</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group col-md-4\">\n");
      out.write("                                    <label>Status</label>\n");
      out.write("                                    <select class=\"form-control\" name=\"status\">\n");
      out.write("                                        <option class=\"Active\" value=\"");
      out.print(j.getStatus());
      out.write('"');
      out.write('>');
      out.print(j.getStatus());
      out.write("</option> \n");
      out.write("                                        <option class=\"Active\" value=\"Active\">Active</option>\n");
      out.write("                                         <option class=\"Inactive\" value=\"Inactive\">Inactive</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Enter Description</label>\n");
      out.write("                            <textarea required rows=\"6\" cols=\"\" name=\"desc\" class=\"form-control\" >");
      out.print(j.getDescription());
      out.write("</textarea>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                            <button class=\"btn btn-success\">Publish Job</button>\n");
      out.write("                    </form>    \n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
