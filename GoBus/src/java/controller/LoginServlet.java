package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.user;
import model.userDAO;

public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");
        String acco = request.getParameter("acco");
        
        user user = new user();
        user.setUname(uname);
        user.setPass(pass);
        user.setAcco(acco);
        
        userDAO udao = new userDAO();
        if(udao.check(user)){
            HttpSession s = request.getSession();
            s.setAttribute("uname",uname);
            s.setAttribute("acco",acco);
            switch (acco) {
                case "Student/Faculty":
                    {
                        RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
                        rd.forward(request,response);
                        break;
                    }
                case "Staff":
                    {
                        RequestDispatcher rd = request.getRequestDispatcher("staff.jsp");
                        rd.forward(request,response);
                        break;
                    }
                case "Admin":
                    {
                        RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
                        rd.forward(request,response);
                        break;
                    }
                default:
                    break;
            }
        }else{
            response.sendRedirect("index.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
