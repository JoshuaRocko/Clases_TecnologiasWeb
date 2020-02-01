package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        HttpSession session = request.getSession();
        String numero = (String) session.getAttribute("numero");
        int numeroi = Integer.parseInt(numero);
                
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Servlet1</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<nav>");
        for (int i = 0; i < numeroi; i++) {
            out.println("<a href='"+request.getParameter("href"+i)+"'>"+request.getParameter("text"+i)+"</a>");
        }
        out.println("</nav>");
        out.println("</body>");
        out.println("</html>");
    }

}
