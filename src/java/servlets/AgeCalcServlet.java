
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andrew
 */
public class AgeCalcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    
        throws ServletException, IOException{
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalcForm.jsp").forward(request, response);
        
    }
      @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    
        throws ServletException, IOException{
        String age = request.getParameter("age");
        request.setAttribute("age",age);
        if(age == null || age.equals("") || age.matches("[-+]?\\d*\\.?\\d+") == false)
        {
            request.setAttribute("message", "You must enter a number.");
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCalcForm.jsp").forward(request, response);
        }
    }
    

    }



