package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.question;
import model.questionDAO;

public class QuesServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String uname = request.getParameter("uname");
        String ques1 = request.getParameter("ques1");
        String ans1 = request.getParameter("ans1");
        String ques2 = request.getParameter("ques2");
        String ans2 = request.getParameter("ans2");
        String ques3 = request.getParameter("ques3");
        String ans3 = request.getParameter("ans3");
        
        question suser = new question();
            suser.setUname(uname);
            suser.setQues1(ques1);
            suser.setAns1(ans1);
            suser.setQues2(ques2);
            suser.setAns2(ans2);
            suser.setQues3(ques3);
            suser.setAns3(ans3);
            
            questionDAO sudao = new questionDAO();
            boolean flag = sudao.add(suser);
            System.out.println(flag);

            if(flag){
                response.sendRedirect("index.jsp");
            }else{
                response.sendRedirect("question.jsp");
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
