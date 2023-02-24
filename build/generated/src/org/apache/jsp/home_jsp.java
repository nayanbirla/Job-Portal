package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.entity.Jobs;
import DBConnection.DBConnection;
import com.dao.Jobdao;
import com.entity.User;
import com.entity.User;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Allcomponent/allcss.jsp");
    _jspx_dependants.add("/Allcomponent/navbar.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_remove_var_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_remove_var_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_remove_var_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User : View Jobs</title>\n");
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
      out.write("                          ");

User auth=(User)request.getSession().getAttribute("obj");
if(auth==null)
{
    response.sendRedirect("login.jsp");
}


      out.write("\n");
      out.write("                        ");
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
      out.write("         <a href=\"#\" class=\"btn btn-light\"><i class=\"fas fa-sign-in-alt\"></i>Logout</a>\n");
      out.write("        \n");
      out.write("         ");
}
        else{
      out.write("\n");
      out.write("            <a href=\"login.jsp\" class=\"btn btn-light mr-1\"><i class=\"fas fa-sign-in-alt\"></i>Login</a>\n");
      out.write("         <a href=\"signup.jsp\" class=\"btn btn-light\"><i class=\"fas fa-user\"></i>signup</a>\n");
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
      out.write("</nav>");
      out.write("\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <h5 class=\"text-center text-primary\">All Jobs</h5>\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        <div class=\"card\">\n");
      out.write("                                            <div class=\"card-body\">\n");
      out.write("                                                <form class=\"form-inline\" action=\"moveview.jsp\" method=\"get\">\n");
      out.write("                                                    <div class=\"form-group col-md-5 mt-1\">\n");
      out.write("                                                        <h5>Location</h5>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group col-md-4 mt-1\">\n");
      out.write("                                                        <h5>Category</h5>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    \n");
      out.write("                                                    <div class=\"form-group col-md-5\">\n");
      out.write("                                                        <select name=\"loc\" class=\"custom-select\" id=\"inlineFormCustomSelectPref\">\n");
      out.write("                                        <option selected value=\"lo\">Choose...</option>\n");
      out.write("                                        <option value=\"odisha\">Odisha</option>\n");
      out.write("                                        <option value=\"Jharkhand\">Jharkhand</option>\n");
      out.write("                                        <option value=\"Delhi\">Delhi</option>\n");
      out.write("                                        <option value=\"Indore\">Indore</option>\n");
      out.write("                                        <option value=\"Chennai\">Chennai</option>\n");
      out.write("                                        <option value=\"Hydrabad\">Hydrabad</option>\n");
      out.write("                                        <option value=\"Mumbai\">Mumbai</option>\n");
      out.write("                                        <option value=\"Gujurat\">Gujurat</option>\n");
      out.write("                                                            \n");
      out.write("                                                        </select>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group col-md-5\">\n");
      out.write("                                                        <select class=\"custom-select\" id=\"inlineFormCustomSelectPref\" name=\"cat\">\n");
      out.write("                                                            <option value=\"ca\" selected>Choose...</option>\n");
      out.write("                                        <option value=\"IT\">IT</option>\n");
      out.write("                                        <option value=\"Developer\">Developer</option>\n");
      out.write("                                        <option value=\"Banking\">Banking</option>\n");
      out.write("                                        <option value=\"Engineer\">Engineer</option>\n");
      out.write("                                        <option value=\"Teacher\">Teacher</option>\n");
      out.write("                                                        </select>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <button class=\"btn btn-success\">Submit</button>\n");
      out.write("                                                    \n");
      out.write("                                                </form>\n");
      out.write("                                            </div>\n");
      out.write("                                         </div>\n");
      out.write("                                        ");

                                        Jobdao jd=new Jobdao(DBConnection.getConnection());    
                                        List<Jobs> list=jd.getAllJobsuser();
                                        for(Jobs j: list)
                                        {
                                        
      out.write("\n");
      out.write("                                        <div class=\"card mt-2\">\n");
      out.write("                                            <div class=\"card-body\">\n");
      out.write("                                                <div class=\"text-center text-primary\">\n");
      out.write("                                                    <i class=\"far fa-clipboard fa-2x\"></i>\n");
      out.write("                                                </div> \n");
      out.write("                                                <h6>");
      out.print(j.getTitle());
      out.write("</h6>\n");
      out.write("                                                ");

                                                    if(j.getDescription().length()>0 && j.getDescription().length()<120)
                                                    {
                                                        
      out.write("\n");
      out.write("                                                        <p>");
      out.print(j.getDescription());
      out.write("</p>\n");
      out.write("                                                        ");
}else{
      out.write("\n");
      out.write("                                                        <p>");
      out.print(j.getDescription().substring(0,120));
      out.write("...</p>\n");
      out.write("                                                        ");
}
                                                        
      out.write("\n");
      out.write("                                                        <br>\n");
      out.write("                                                        <div class=\"form-row\">\n");
      out.write("                                                            <div class=\"form-group col-md-3\">\n");
      out.write("                                                                <input type=\"text\" class=\"form-control form-control-sm\" value=\"Location: ");
      out.print(j.getLocation());
      out.write("\" readonly>\n");
      out.write("                                                                \n");
      out.write("                                                            </div>\n");
      out.write("                                                                <div class=\"form-group col-md-3\">\n");
      out.write("                                                                <input type=\"text\" class=\"form-control form-control-sm\" value=\"Category: ");
      out.print(j.getCategory());
      out.write("\" readonly>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                                <h6>\n");
      out.write("                                                                    Publish Date:\n");
      out.write("                                                                    ");
      out.print(j.getPdate().toString());
      out.write("</h6>\n");
      out.write("                                                                    <div class=\"text-center\">\n");
      out.write("                                                                        <a href=\"oneview.jsp?id=");
      out.print(j.getId());
      out.write("\" class=\"btn btn-sm bg-success text-white\">View More</a>         \n");
      out.write("                                                                    </div>\n");
      out.write("                                                    \n");
      out.write("                                                                 </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                               \n");
      out.write("                                                                        ");
}
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                                                              \n");
      out.write("        \n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty succmsg}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <h4 class=\"text-center text-danger\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${succmsg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h4>\n");
        out.write("                                        ");
        if (_jspx_meth_c_remove_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_remove_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_0.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_remove_0.setVar("succmsg");
    int _jspx_eval_c_remove_0 = _jspx_th_c_remove_0.doStartTag();
    if (_jspx_th_c_remove_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_nobody.reuse(_jspx_th_c_remove_0);
      return true;
    }
    _jspx_tagPool_c_remove_var_nobody.reuse(_jspx_th_c_remove_0);
    return false;
  }
}
