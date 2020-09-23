
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andrew
 */
public class CalcServlet extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    
        throws ServletException, IOException{
        getServletContext().getRequestDispatcher("/WEB-INF/Calc.jsp").forward(request, response);
        
    }
      @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
                String first = request.getParameter("first");
                String second = request.getParameter("second");

                if(first == null || first.equals("") || first.matches("[-+]?\\d*\\.?\\d+") == false || second.matches("[-+]?\\d*\\.?\\d+") == false || second == null || second.equals(""))
                {
                    
                      request.setAttribute("message", "You must enter a number.");
                      getServletContext().getRequestDispatcher("/WEB-INF/Calc.jsp").forward(request, response);
                }
                int firstNum = Integer.parseInt(first);
                   int secondNum = Integer.parseInt(second);
                    int equals = 0;
                if(request.getParameter("plus")!= null)
                {
                    equals = firstNum + secondNum;
                    request.setAttribute("message", "Result: " + equals); 
                    getServletContext().getRequestDispatcher("/WEB-INF/Calc.jsp").forward(request, response);
                }
                else if(request.getParameter("minus")!= null)
                        {
                    equals= firstNum - secondNum;
                    request.setAttribute("message", "Result: " + equals);
                    getServletContext().getRequestDispatcher("/WEB-INF/Calc.jsp").forward(request, response);
                        }
                else if(request.getParameter("modulus")!= null)
                {
                    equals = firstNum % secondNum;
                    request.setAttribute("message", "Result: " + equals);
                    getServletContext().getRequestDispatcher("/WEB-INF/Calc.jsp").forward(request, response);
                }
                else if(request.getParameter("multiply")!= null)
                        {
                    equals = firstNum * secondNum;
                    request.setAttribute("message", "Result: " + equals);
                    getServletContext().getRequestDispatcher("/WEB-INF/Calc.jsp").forward(request, response);
                        }
    }
            


}
