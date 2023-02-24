package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import com.entity.Jobs;
import com.dao.Jobdao;
import DBConnection.DBConnection;

public final class moveview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Allcomponent/allcss.jsp");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User :View Jobs</title>\n");
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
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #f0f1f2\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <h5 class=\"text-center text-primary\">All Jobs</h5>\n");
      out.write("                    ");
String loc=request.getParameter("loc");
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
                          
                      
                    
      out.write("\n");
      out.write("                    <h4 class=\"text-center text-danger\">Job Not Available</h4>\n");
      out.write("                    ");
}
                    if(list!=null){
for(Jobs j: list){

      out.write("\n");
      out.write("<div class=\"cart mt-2\">\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("        <div class=\"text-center text-primary\">\n");
      out.write("            <i class=\"far fa-clipboard fa-2x\"></i>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <h6>");
      out.print(j.getTitle());
      out.write("</h6>\n");
      out.write("        <p>");
      out.print(j.getDescription());
      out.write("\n");
      out.write("            <br>\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"form-group col-md-3\">\n");
      out.write("                <input type=\"text\" class=\"form-control form-control-sm\" value=\"location: ");
      out.print(j.getLocation());
      out.write("\" readonly>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("                <div class=\"form-group col-md-3\">\n");
      out.write("                    <input type=\"text\" class=\"form-control form-control-sm\" value=\"category: ");
      out.print(j.getCategory());
      out.write("\" readonly>\n");
      out.write("                    \n");
      out.write("        </div>\n");
      out.write("                    <h6>\n");
      out.write("                        Publish Date:\n");
      out.write("                        ");
      out.print(j.getPdate().toString());
      out.write("</h6>\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <a href=\"oneview.jsp?id=");
      out.print(j.getId());
      out.write("\" class=\"btn btn-sm bg-success text-white\">View</a>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        ");
}
}else{
      out.write("\n");
      out.write("<h4 class=\"text-center text-danger\">");
      out.print(msg);
      out.write("</h4>\n");
}
      out.write("\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("                </div></div></div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
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
