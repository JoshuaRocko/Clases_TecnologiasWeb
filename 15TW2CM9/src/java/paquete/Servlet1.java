package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String mensaje = request.getParameter("mensaje");
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Servlet1</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<button type='button' onclick=\"alert('"+mensaje+"');\">Click me UwU</button>");
        out.println("<button type='button' ondblclick=\"alert('"+mensaje+"');\">DoubleClick me UwU</button>");
        out.println("<button type='button' onfocus=\"alert('"+mensaje+"');\">Focus me UwU</button>");
        out.println("</body>");
        out.println("</html>");
    }

}
