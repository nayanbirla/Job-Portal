/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import DBConnection.DBConnection;
import com.dao.Userdao;
import com.entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author nayan
 */
@WebServlet(name = "Updateprofile", urlPatterns = {"/Updateprofile"})
public class Updateprofile extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Updateprofile</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Updateprofile at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        try{
            int id=Integer.parseInt(request.getParameter("id"));
            String name=request.getParameter("name");
            String qua=request.getParameter("qua");
            String email=request.getParameter("email");
            String ps=request.getParameter("ps");
            Userdao ud=new Userdao(DBConnection.getConnection());
            User u=new User();
            u.setId(id);
            u.setName(name);
            u.setQualification(qua);
            u.setEmail(email);
            u.setPassword(ps);
            boolean b=ud.updateuser(u);
            HttpSession session=request.getSession();
            if(b)
            {
                session.setAttribute("succMsg","Profile Update Sucesssfully");
                response.sendRedirect("home.jsp");
                
            }
            else{
                session.setAttribute("succMsg","Something wrong on server");
                response.sendRedirect("home.jsp");
            }
        }catch(Exception tt)
        {
            tt.printStackTrace();
        }            
        
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
