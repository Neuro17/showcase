/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.30
 * Generated at: 2013-10-05 12:09:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registerNew_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<script src=\"/bonboard/resources/js/vendor/jQuery.js\"></script>\n");
      out.write("\t<script src=\"/bonboard/resources/js/login/registration.js\"></script>\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!--[if lt IE 7]>\n");
      out.write("        <p class=\"chromeframe\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> or <a href=\"http://www.google.com/chromeframe/?redirect=true\">activate Google Chrome Frame</a> to improve your experience.</p>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("    <!-- This code is taken from http://twitter.github.com/bootstrap/examples/hero.html -->\n");
      out.write("\t<br><br><br>\n");
      out.write("\t<div class=\"container well\">\n");
      out.write("\t\t<div class=\"\">\n");
      out.write("\t\t\t<form class=\"form-horizontal\" role=\"form\">\n");
      out.write("\t\t\t\t<legend>Sign Up</legend>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"fname\" class=\"col-lg-2 control-label\">First Name</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3\">\n");
      out.write("\t\t\t\t  \t\t<input type=\"text\" class=\"form-control\" id=\"fname\" name=\"fname\" placeholder=\"First Name\">\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t<div class=\"alert alert-danger hidden col-md-3\" id=\"fnamelabel\"></div>\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"lname\" class=\"col-lg-2 control-label\">Last Name</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3\">\n");
      out.write("\t\t\t\t  \t\t<input type=\"text\" class=\"form-control\" id=\"lname\" name=\"lname\" placeholder=\"Last Name\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"alert alert-danger hidden col-md-3\" id=\"lnamelabel\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"username\" class=\"col-lg-2 control-label\">Username</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3\">\n");
      out.write("\t\t\t\t  \t\t<input type=\"text\" class=\"form-control\" id=\"username\" name=\"username\" placeholder=\"Username\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"alert alert-danger hidden col-md-3\" id=\"userlabel\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"email\" class=\"col-lg-2 control-label\">Email</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3\">\n");
      out.write("\t\t\t\t  \t\t<input type=\"mail\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Email\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"alert alert-danger hidden col-md-3\" id=\"maillabel\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t        <label for=\"gender\" class=\"col-lg-2 control-label\">Gender</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3\">\n");
      out.write("\t\t\t\t\t\t<div id=\"gender\" name=\"gender\" class=\"btn-group\" data-toggle=\"buttons\">\n");
      out.write("\t\t\t                <button id=\"male\" type=\"button\" class=\"btn btn-info\">Male</button>\n");
      out.write("\t\t\t                <button id=\"female\" type=\"button\" class=\"btn btn-info\">Female</button>\n");
      out.write("\t\t              \t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"password\" class=\"col-lg-2 control-label\">Password</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3\">\n");
      out.write("\t\t\t\t\t  <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"Password\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"alert alert-danger hidden col-md-3\" id=\"passlabel\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"cpassword\" class=\"col-lg-2 control-label\">Confirm Password</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-3\">\n");
      out.write("\t\t\t\t\t  <input type=\"Password\" id=\"cpassword\" class=\"form-control\" name=\"cpassword\" placeholder=\"Re-enter Password\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"alert alert-danger hidden col-md-3\" id=\"cpasslabel\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-offset-2 col-lg-10\">\n");
      out.write("\t\t\t\t\t  <input type=\"button\" id=\"signBtn\" type=\"submit\" class=\"btn btn-success\" value=\"submit\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t.alert{\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tpadding: 5px 5px 5px 10px;\n");
      out.write("\t\t\tmargin-bottom: 0px;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- <div class=\"container\">\n");
      out.write("   \t\t<div class=\"well\">\n");
      out.write("      <form id=\"signup\" class=\"form-horizontal\">\n");
      out.write("\t\t<legend>Sign Up</legend>\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t        <label class=\"control-label\">First Name</label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t    <div class=\"input-prepend\">\n");
      out.write("\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-user\"></i></span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"input-xlarge\" id=\"fname\" name=\"fname\" placeholder=\"First Name\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<span class=\"add-on hidden\" id=\"fnamelabel\"></span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"control-group \">\n");
      out.write("\t        <label class=\"control-label\">Last Name</label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t    <div class=\"input-prepend\">\n");
      out.write("\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-user\"></i></span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"input-xlarge\" id=\"lname\" name=\"lname\" placeholder=\"Last Name\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<span class=\"add-on hidden\" id=\"lnamelabel\"></span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"control-group \">\n");
      out.write("\t        <label class=\"control-label\">Username</label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t    <div class=\"input-prepend\">\n");
      out.write("\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-user\"></i></span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"input-xlarge\" id=\"username\" name=\"username\" placeholder=\"Username\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<span class=\"add-on hidden\" id=\"userlabel\"></span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t        <label class=\"control-label\">Email</label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t    <div class=\"input-prepend\">\n");
      out.write("\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-envelope\"></i></span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"input-xlarge\" id=\"email\" name=\"email\" placeholder=\"Email\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<span class=\"add-on hidden\" id=\"maillabel\"></span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t        <label class=\"control-label\">Gender</label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<p><div id=\"gender\" name=\"gender\" class=\"btn-group\" data-toggle=\"buttons-radio\">\n");
      out.write("                    <button id=\"male\" type=\"button\" class=\"btn btn-info\">Male</button>\n");
      out.write("                    <button id=\"female\" type=\"button\" class=\"btn btn-info\">Female</button>\n");
      out.write("\n");
      out.write("                  </div></p>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t        <label class=\"control-label\">Password</label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t    <div class=\"input-prepend\">\n");
      out.write("\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-lock\"></i></span>\n");
      out.write("\t\t\t\t\t<input type=\"Password\" id=\"password\" class=\"input-xlarge\" name=\"password\" placeholder=\"Password\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<span class=\"add-on hidden\" id=\"passlabel\"></span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t        <label class=\"control-label\">Confirm Password</label>\n");
      out.write("\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t    <div class=\"input-prepend\">\n");
      out.write("\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-lock\"></i></span>\n");
      out.write("\t\t\t\t\t<input type=\"Password\" id=\"cpassword\" class=\"input-xlarge\" name=\"cpassword\" placeholder=\"Re-enter Password\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<span class=\"add-on hidden\" id=\"cpasslabel\"></span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"control-group\">\n");
      out.write("\t\t<label class=\"control-label\"></label>\n");
      out.write("\t      <div class=\"controls\">\n");
      out.write("\t       <input type=\"button\" id=\"signBtn\" type=\"submit\" class=\"btn btn-success\" value=\"submit\"\n");
      out.write("\t      </div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t  </form>\n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("  \t</div> -->\n");
      out.write("</body>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
