/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.30
 * Generated at: 2013-10-04 15:29:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\"> <!--<![endif]-->\n");
      out.write("<body>\n");
      out.write("    <!--[if lt IE 7]>\n");
      out.write("        <p class=\"chromeframe\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> or <a href=\"http://www.google.com/chromeframe/?redirect=true\">activate Google Chrome Frame</a> to improve your experience.</p>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("    <!-- This code is taken from http://twitter.github.com/bootstrap/examples/hero.html -->\n");
      out.write("    <div class=\"container main\">\n");
      out.write("        \n");
      out.write("        <div class=\"well span11 center\" id=\"mission\">\n");
      out.write("            <h2>About us</h2>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <ul class=\"thumbnails\">\n");
      out.write("            <li class=\"span12 pagination-centered\">\n");
      out.write("                <img src=\"/bonboard/resources/img/about-us-3.jpg\" width=\"728\" height=\"318\"/>  \n");
      out.write("            </li>\n");
      out.write("        </ul></br></br>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"span10 center\">\n");
      out.write("                <p><span class=\"first-letter\">B</span>onboard nasce dalla passione comune di persone che credono nel futuro, nel talento e nelle diverse culture, come valore umano e come vantaggio competitivo di business.</p></br>\n");
      out.write("\n");
      out.write("                <p>In un mercato sempre più globale BonBoard, porta la multiculturalità alle imprese. Forniamo servizi sia per il mercato dell'internazionalizzazione (outdoor) che per quello interno (indoor) ad esempio per presidiare il segmento multiculturale presente in Italia e sostenere gli investimenti internazionali sul nostro territorio.</p></br>\n");
      out.write("\n");
      out.write("                <p>Bonboard aiuta le imprese nella ricerca dei migliori profili al fine di valorizzarne i percorsi aziendali, utili alla crescita dell'impresa stessa, non trascurando gli aspetti legati ai cambiamenti culturali, necessari per affrontare i nuovi processi di trasformazione.</p></br>\n");
      out.write("\n");
      out.write("                <p>La sfida della competitività è una sfida totale che si gioca su più fronti, ma che vede al centro il fattore umano, risorsa primaria di qualsiasi impresa: per questo Bonboard mette in contatto le aziende con, in modo particolare ma non esclusivo, le seconde generazioni di origine internazionale o i residenti, da lungo tempo in Italia, in grado di arricchire con la propria cultura d'origine i valori nazionali. Selezioneremo anche tutti i talenti italiani, che, grazie alla loro esperienza e percorso internazionale, sono dotati di multiculturalità.</p></br>\n");
      out.write("\n");
      out.write("                <p class=\"pagination-centered\"><font size=\"4\"><strong>Scoprire Talenti è la nostra passione.</br> Welcome on board!</strong></font></p></br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div></br></br>\n");
      out.write("</body>\n");
      out.write("</html>");
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
