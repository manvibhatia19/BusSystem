package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.signin;
import java.util.List;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write("                <spam>User-Name : ");
      out.print( uname);
      out.write("<br><br>\n");
      out.write("                    Account-type : Admin</spam>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right\"><h3>Services at Go Bus !</h3>\n");
      out.write("        <table>\n");
      out.write("            <tr><th colspan=\"4\">Data Info</th>\n");
      out.write("                <td style=\"text-align: right;\"><a href=\"admin.jsp\">Back</a></td></tr>\n");
      out.write("            <tr>\n");
      out.write("            ");
 if(uname!=null){ 
      out.write("\n");
      out.write("                <th>First Name</th>\n");
      out.write("                <th>Last Name</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Username</th>\n");
      out.write("                <th>Account Type</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                List<signin> records = (List<signin>)request.getAttribute("list");
                    for(int i=0;i<records.size();i++)
                    {     
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( records.get(i).getFname());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( records.get(i).getLname());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( records.get(i).getEmail());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( records.get(i).getUname());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( records.get(i).getAcco());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            }
            
      out.write("\n");
      out.write("        </table>\n");
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
