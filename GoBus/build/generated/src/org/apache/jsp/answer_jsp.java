package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.question;

public final class answer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\tbackground-position: right bottom;\n");
      out.write("\t\theight: auto;\n");
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
      out.write("            input{\n");
      out.write("                border-color: lightblue;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input:invalid{\n");
      out.write("                border-color: red;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input:valid{\n");
      out.write("                border-color: green;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2 style=\"font-family: cursive;\">Secure with Go Bus !</h2>\n");
      out.write("        <div class=\"logo\"></div>\n");
      out.write("        <form action=\"CheckAnsServlet\" method=\"post\">\n");
      out.write("            ");

                List<question> records = (List<question>)request.getAttribute("list");
                for(int i=0;i<records.size();i++)
                    {
            
      out.write("\n");
      out.write("            <h4>Username:<br>\n");
      out.write("            <input type=\"text\" name=\"uname\" value=\"");
      out.print( records.get(i).getUname());
      out.write("\" placeholder=\"Enter your Username\" pattern=\"(?=.*[a-z])^[^-\\s]{8,}\" title=\"Must not contain spaces and contain all lowercase letters, at least 8 or more characters\" required><br><br>\n");
      out.write("            Secret Question 1:<br>\n");
      out.write("            <select name=\"ques1\" required>\n");
      out.write("                <option value=\"");
      out.print( records.get(i).getQues1());
      out.write('"');
      out.write('>');
      out.print( records.get(i).getQues1());
      out.write("</option>\n");
      out.write("            </select><br>\n");
      out.write("            Secret Answer 1:<br>\n");
      out.write("            <input type=\"text\" name=\"ans1\" placeholder=\"Enter your Answer\" required><br><br>\n");
      out.write("            Secret Question 2:<br>\n");
      out.write("            <select name=\"ques2\" required>\n");
      out.write("            <option value=\"");
      out.print( records.get(i).getQues2());
      out.write('"');
      out.write('>');
      out.print( records.get(i).getQues2());
      out.write("</option>\n");
      out.write("            </select><br>\n");
      out.write("            Secret Answer 2:<br>\n");
      out.write("            <input type=\"text\" name=\"ans2\" placeholder=\"Enter your Answer\" required><br><br>\n");
      out.write("            Secret Question 3:<br>\n");
      out.write("            <select name=\"ques3\" required>\n");
      out.write("            <option value=\"");
      out.print( records.get(i).getQues3());
      out.write('"');
      out.write('>');
      out.print( records.get(i).getQues3());
      out.write("</option>\n");
      out.write("            </select><br>\n");
      out.write("            Secret Answer 3:<br>\n");
      out.write("            <input type=\"text\" name=\"ans3\" placeholder=\"Enter your Answer\" required><br><br>\n");
      out.write("            <input style=\"cursor: pointer;\" type=\"submit\" value=\"Check Answer\"><br><br>\n");
      out.write("            Remember Password ? <a href=\"index.jsp\">Login Again</a>\n");
      out.write("            </h4>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </form>\n");
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
