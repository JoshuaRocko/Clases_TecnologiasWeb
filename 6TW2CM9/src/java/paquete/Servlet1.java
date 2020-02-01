package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String video1 = request.getParameter("video1");
        
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Servlet1</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<video controls>");
        out.println("<source src='tu.mp4' type='video/mp4' />");
        out.println("Tu navegador no soporta video");
        out.println("</video>");
        out.println("</body>");
        out.println("</html>");
        //response.sendRedirect("Servlet2?parametro2="+nombre+"");
    }

}
