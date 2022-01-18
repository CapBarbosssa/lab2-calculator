/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.calculator.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author peony
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
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
        int first,second;
        String function;
        try{
            if(request.getParameter("firstnum")== ""&& request.getParameter("secondnum")== ""){
                 request.setAttribute("message","Result: ---");
                 
            }
            else if(request.getParameter("firstnum")== "" || request.getParameter("secondnum")== ""){
                request.setAttribute("message","Result: invalid");
            }
            
            else if(request.getParameter("firstnum")!= null && request.getParameter("secondnum")!= null){
           
            first = Integer.parseInt(request.getParameter("firstnum"));
            second = Integer.parseInt(request.getParameter("secondnum"));
            function = request.getParameter("operation");
           
                switch (function) {
                    case "+":
                        request.setAttribute("message","Result: " + (first+second) );
                        break;
                    case "-":
                        request.setAttribute("message","Result: " + (first-second) );
                        break;
                    case "*":
                        request.setAttribute("message","Result: " + (first*second) );
                        break;
                    case "%":
                        request.setAttribute("message","Result: " + (first/second) );
                        break;
                    default:
                        break;
                }
   
            }
        
       
        
        }
        catch (Exception ex){
                 request.setAttribute("message","Result: invalid");
        }
      
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }
    

}

