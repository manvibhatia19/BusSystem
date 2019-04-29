package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.signin;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdUserServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String uname = request.getParameter("uname");
        String acco = request.getParameter("acco");
        String pass = request.getParameter("pass");
        String cpass = request.getParameter("cpass");
        
        signin suser = new signin();
            suser.setFname(fname);
            suser.setLname(lname);
            suser.setEmail(email);
            suser.setUname(uname);
            suser.setAcco(acco);
            suser.setPass(pass);
            suser.setCpass(cpass);
        
        if(pass.equals(cpass))
        {
            Configuration cf=null;
            SessionFactory sf=null;
            Session session=null;
                cf=new Configuration();
                cf.configure();
                sf=cf.buildSessionFactory();
                session =sf.openSession();
                Transaction tx=session.beginTransaction();
                Query query = session.createQuery("update signin set fname='"+suser.getFname()+"', lname='"+suser.getLname()+"', email='"+suser.getEmail()+"', acco='"+suser.getAcco()+"' where uname='"+suser.getUname()+"', pass='"+suser.getPass()+"', cpass='"+suser.getCpass()+"'");
                int i = query.executeUpdate();
            tx.commit();
            session.close();
            sf.close();
            HttpSession s = request.getSession();
            s.setAttribute("uname",uname);
            s.setAttribute("acco",acco);
            if(i>0) {
                 RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
                        rd.forward(request,response);
            }
        }else{
            response.sendRedirect("updUser.jsp");
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
