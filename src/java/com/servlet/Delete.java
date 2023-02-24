/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import DBConnection.DBConnection;
import com.dao.Jobdao;
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
@WebServlet(name = "Delete", urlPatterns = {"/Delete"})
public class Delete extends HttpServlet {

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
        try{
            int id=Integer.parseInt(request.getParameter("id"));
            Jobdao dao=new Jobdao(DBConnection.getConnection());
            boolean b=dao.deleteJobs(id);
            HttpSession hs=request.getSession();
                if(b)
                {
                    hs.setAttribute("msg","Job Delete Successfully..");
                    response.sendRedirect("viewjob.jsp");
                }
                else
                {
                    hs.setAttribute("msg","something wrong on server");
                    response.sendRedirect("viewjob.jsp");
                }
        }catch(Exception tt)
        {
            System.out.println(tt);
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
       try{
            int id=Integer.parseInt(request.getParameter("id"));
            Jobdao dao=new Jobdao(DBConnection.getConnection());
            boolean b=dao.deleteJobs(id);
            HttpSession hs=request.getSession();
                if(b)
                {
                    hs.setAttribute("msg","Job Delete Successfully..");
                    response.sendRedirect("viewjob.jsp");
                }
                else
                {
                    hs.setAttribute("msg","something wrong on server");
                    response.sendRedirect("viewjob.jsp");
                }
        }catch(Exception tt)
        {
            System.out.println(tt);
        }
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
          
        processRequest(request,response);
        
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
