package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.schedule;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdSchServlet extends HttpServlet {

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
            
            Configuration cf=null;
            SessionFactory sf=null;
            Session session=null;
                cf=new Configuration();
                cf.configure();
                sf=cf.buildSessionFactory();
                session =sf.openSession();
                Transaction tx=session.beginTransaction();
                Query query = session.createQuery("update schedule set source='"+suser.getSource()+"', dest='"+suser.getDest()+"', via='"+suser.getVia()+"', time='"+suser.getTime()+"' where busno='"+suser.getBusno()+"'");
                int i = query.executeUpdate();
                HttpSession s = request.getSession();
            String uname = (String)s.getAttribute("uname");
            String acco = (String)s.getAttribute("acco");
            s.setAttribute("uname",uname);
            s.setAttribute("acco",acco);
            tx.commit();
            session.close();
            sf.close();
            if(i>0) {
                 RequestDispatcher rd = request.getRequestDispatcher("schedule.jsp");
                        rd.forward(request,response);
            }else{
            response.sendRedirect("updSch.jsp");
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
