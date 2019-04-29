package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script> \n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/icon.png\"/>\n");
      out.write("        <title>Go Bus !</title>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                position: relative;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                box-shadow: 0px 0px 10px lightblue;\n");
      out.write("                font-family: cursive;\n");
      out.write("                padding: 5px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                font-weight: bolder;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("                margin: 10px;\n");
      out.write("                position: relative;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                background-image: url(\"images/bus_banner.jpg\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("\t\tbackground-position: center bottom;\n");
      out.write("\t\theight: auto;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .header{\n");
      out.write("                /*background-color: lightblue;*/\n");
      out.write("                position: relative;\n");
      out.write("                height: 190px;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                padding: 5px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .logo{\n");
      out.write("                height: 50px;\n");
      out.write("                width: 50px;\n");
      out.write("                background-image: url(\"images/icon.png\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("\t\tbackground-position: center;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .container{\n");
      out.write("                display: flex;\n");
      out.write("                position: relative;\n");
      out.write("                height: auto;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .left{\n");
      out.write("                /*background-color: dodgerblue;*/\n");
      out.write("                height: 100%;\n");
      out.write("                width: 20%;\n");
      out.write("                margin-right: 5px;\n");
      out.write("                padding: 5px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .right{\n");
      out.write("                /*background-color: aliceblue;*/\n");
      out.write("                height: 100%;\n");
      out.write("                width: 80%;\n");
      out.write("                margin-left: 5px;\n");
      out.write("                padding: 5px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input{\n");
      out.write("                border-color: lightblue;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input:invalid{\n");
      out.write("                border-color: red;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input:valid{\n");
      out.write("                border-color: lightgreen;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .footer{\n");
      out.write("                /*background-color: lightblue;*/\n");
      out.write("                position: relative;\n");
      out.write("                height: 70px;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-top: 10px;\n");
      out.write("                padding: 5px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--<h1>Admin Panel</h1>-->\n");
      out.write("        <div class=\"header\"><h2>Go Bus ! Welcomes You...</h2>\n");
      out.write("            <div class=\"logo\"></div>\n");
      out.write("            <a href=\"logout.jsp\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"left\">\n");
      out.write("                <h3>User's Profile</h3>\n");
      out.write("                <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                    <!-- Indicators -->\n");
      out.write("                    <ol class=\"carousel-indicators\">\n");
      out.write("                      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                    </ol>\n");
      out.write("\n");
      out.write("                    <!-- Wrapper for slides -->\n");
      out.write("                    <div class=\"carousel-inner\">\n");
      out.write("                      <div class=\"item active\">\n");
      out.write("                        <img src=\"images/icon.png\" alt=\"Welcome to Go Bus !\">\n");
      out.write("                      </div>\n");
      out.write("\n");
      out.write("                      <div class=\"item\">\n");
      out.write("                        <img src=\"images/bus_icon.png\" alt=\"Welcome to Go Bus !\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Left and right controls -->\n");
      out.write("                    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("                      <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("                      <span class=\"sr-only\">Previous</span>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("                      <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("                      <span class=\"sr-only\">Next</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                ");

                    String uname =(String) session.getAttribute("uname");
                    String acco = (String) session.getAttribute("acco");
                
      out.write("\n");
      out.write("                <div>User-Name : ");
      out.print( uname);
      out.write("<br><br>\n");
      out.write("                    Account-type : ");
      out.print( acco);
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right\"><h3>Services at Go Bus !</h3>\n");
      out.write("                <div style=\"width: 100%;  display: flex;\">\n");
      out.write("                    <div style=\"width: 25%;\"><a href=\"seaSch.jsp\">Search Routes/Buses</a><br><br><br>\n");
      out.write("                        <a href=\"ViewSch\">View Routes/Buses</a><br><br><br>\n");
      out.write("                        <a href=\"updSch.jsp\">Update Routes/Buses</a><br><br><br>\n");
      out.write("                        <a href=\"addSch.jsp\">Add New Routes/Buses</a><br><br><br>\n");
      out.write("                        <a href=\"delSch.jsp\">Delete Routes/Buses</a></div><br><br><br>\n");
      out.write("                        <div style=\"width: 30%;\"><a href=\"seaUser.jsp\">Search Staff/Student/Faculty</a><br><br><br>\n");
      out.write("                            <a href=\"ViewUser\">View Staff/Student/Faculty</a><br><br><br>\n");
      out.write("                            <a href=\"updUser.jsp\">Update Staff/Student/Faculty</a><br><br><br>\n");
      out.write("                            <a href=\"addUser.jsp\">Add New Staff/Student/Faculty</a><br><br><br>\n");
      out.write("                        <a href=\"delUser.jsp\">Delete Staff/Student/Faculty</a></div></div><br>\n");
      out.write("            </div>\n");
      out.write("            <!--<div style=\"clear: both\"></div>-->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\"><h5>Copyright &copy; 2019 by Chitkara University, HP.</h5></div>\n");
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
