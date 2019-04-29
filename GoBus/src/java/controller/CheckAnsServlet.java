package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.question;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CheckAnsServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String uname = request.getParameter("uname");
        String ans1 = request.getParameter("ans1");
        String ans2 = request.getParameter("ans2");
        String ans3 = request.getParameter("ans3");
        
            Configuration cf=null;
            SessionFactory sf=null;
            Session session=null;
                cf=new Configuration();
                cf.configure();
                sf=cf.buildSessionFactory();
                session =sf.openSession();
                Transaction tx=session.beginTransaction();
                Query query = session.createQuery("from question where uname=:uname and ans1=:ans1 and ans2=:ans2 and ans3=:ans3");
                query.setParameter("uname", uname);
                query.setParameter("ans1", ans1);
                query.setParameter("ans2", ans2);
                query.setParameter("ans3", ans3);
                List<question> records = query.list();
                HttpSession s = request.getSession();
                s.setAttribute("uname",uname);
            tx.commit();
            session.close();
            sf.close();
            if(records.size()>0) {
                 RequestDispatcher rd = request.getRequestDispatcher("change.jsp");
                        rd.forward(request,response);
            }else{
                response.sendRedirect("answer.jsp");
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
