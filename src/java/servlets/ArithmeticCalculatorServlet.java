
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mehari
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


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
      getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        String firstNumberString = request.getParameter("firstNumber");
        String secondNumberString = request.getParameter("secondNumber");
        if((request.getParameter("firstNumber") != null && request.getParameter("secondNumber") != null) && (request.getParameter("firstNUmber") !="" && request.getParameter("secondNumber") !=""))
        {
         try{
             // String firstNumberString = request.getParameter("firstNumber");
             // String secondNumberString = request.getParameter("secondNumber");
              
              int firstNumberInt = Integer.parseInt(firstNumberString);
              int secondNumberInt = Integer.parseInt(secondNumberString);
              
              if(request.getParameter("operation").equals("a")){
              String result = firstNumberInt + secondNumberInt + "";
              request.setAttribute("message", result);
              }
              else if(request.getParameter("operation").equals("b")){
              String result = firstNumberInt - secondNumberInt + "";
              request.setAttribute("message", result);
              }
              else if(request.getParameter("operation").equals("c")){
                    String result = firstNumberInt * secondNumberInt + "";
                    request.setAttribute("message", result);
              }
              else if(request.getParameter("operation").equals("d")){
                String result = firstNumberInt % secondNumberInt + "";
                request.setAttribute("message", result);
              }
         } catch(Exception ex){
             request.setAttribute("message", "Invalid");}
        } else if((request.getParameter("firstNumber") ==null && request.getParameter("secondNumber") ==null ) || (request.getParameter("firstNumber") == "" && request.getParameter("secondNumber") == "")){
        request.setAttribute("message", "---");
        } else if(request.getParameter("firstNumber") != null || request.getParameter("secondNumber") != null){
          request.setAttribute("message", "Invalid");
        }else{ request.setAttribute("message", "---");
        }
        
        request.setAttribute("firstNum", firstNumberString);
        request.setAttribute("secondNum", secondNumberString);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

  

}
