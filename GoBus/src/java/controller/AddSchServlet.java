package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.schedule;
import model.scheduleDAO;

public class AddSchServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int busno = Integer.parseInt(request.getParameter("busno"));
        String source = request.getParameter("source");
        String dest = request.getParameter("dest");
        String via = request.getParameter("via");
        String time = request.getParameter("time");
        
            schedule suser = new schedule();
            suser.setBusno(busno);
            suser.setSource(source);
            suser.setDest(dest);
            suser.setVia(via);
            suser.setTime(time);
            
            scheduleDAO sudao = new scheduleDAO();
            boolean flag =sudao.add(suser);
            HttpSession s = request.getSession();
            String uname = (String)s.getAttribute("uname");
            String acco = (String)s.getAttribute("acco");
            s.setAttribute("uname",uname);
            s.setAttribute("acco",acco);

            if(flag){
                RequestDispatcher rd = request.getRequestDispatcher("schedule.jsp");
                        rd.forward(request,response);
            }else{
                response.sendRedirect("addSch.jsp");
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
