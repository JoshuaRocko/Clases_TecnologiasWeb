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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String izquierda = request.getParameter("izquierda");
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Servlet1</title>");
        out.println("<frameset cols=\""+izquierda+",*\" frameborder=\"yes\" boder=\"1\" framespacing=\"1\">\n" +
"        <frame src=\"izquierda.html\" >\n" +
"        <frame src=\"contenido.html\" >\n" +
"    </frameset>");
        
        out.println("</head>");
        out.println("<body>");
        
        out.println("</body>");
        out.println("</html>");
    }

}
