package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addSch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            }\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("                margin: 10px;\n");
      out.write("                position: relative;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                background-image: url(\"images/bus_banner.jpg\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("\t\tbackground-position: left top;\n");
      out.write("\t\theight: 100%;\n");
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
      out.write("            <div class=\"left\"><h3>User's Profile</h3>\n");
      out.write("                ");

                    String uname =(String) session.getAttribute("uname");
                
      out.write("\n");
      out.write("                <div>User-Name : ");
      out.print( uname);
      out.write("<br><br>\n");
      out.write("                    Account-type : Admin</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right\"><h3>Services at Go Bus !</h3>\n");
      out.write("            <h4>Enter New Route/Bus Details &nbsp; &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp;\n");
      out.write("            <a onclick=\"goBack()\">Back</a></h4>\n");
      out.write("            <script>\n");
      out.write("            function goBack() {\n");
      out.write("              window.history.go(-1);\n");
      out.write("            }\n");
      out.write("            </script>\n");
      out.write("            ");
 if(uname!=null){ 
      out.write("\n");
      out.write("            <form action=\"AddSchServlet\" method=\"post\">\n");
      out.write("            <h4>Bus No.: <input type=\"text\" name=\"busno\" placeholder=\"Enter Bus No.\" pattern=\"[0-9]+\" title=\"Must contain numbers only\" required><br><br>\n");
      out.write("            Bus Source: <input type=\"text\" name=\"source\" placeholder=\"Enter Bus Source\" required><br><br>\n");
      out.write("            Bus Destination: <input type=\"text\" name=\"dest\" placeholder=\"Enter Bus Destination\" required><br><br>\n");
      out.write("            Via Route: <input type=\"text\" name=\"via\" placeholder=\"Enter Via Route\" required><br><br>\n");
      out.write("            Bus Time: <input type=\"text\" name=\"time\" placeholder=\"Enter Bus Time\" pattern=\"^(2[0-3]|[01]?[0-9]):([0-5]?[0-9])$\" title=\"Must be in format of 24hours, e.g.'13:30'\" required><br><br>\n");
      out.write("            <input style=\"cursor: pointer;\" type=\"submit\" value=\"Add Schedule\"><br><br>\n");
      out.write("        </form>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!--<div style=\"clear: both\"></div>-->\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\"><h5>Copyright &copy; 2019 by Chitkara University, HP.</h5></div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
