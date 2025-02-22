package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet0 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String izquierda = request.getParameter("izquierda");
        int numero = Integer.parseInt(request.getParameter("numero"));
        
        HttpSession session = request.getSession();
        session.setAttribute("izquierda", izquierda);
        session.setAttribute("numero", numero);
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Servlet1</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action='Servlet1' method='get' >");
        for (int i = 0; i < numero; i++) {
            out.println("Href: <input type='text' name='href"+i+"' />");
            out.println("Texto: <input type='text' name='texto"+i+"' /><br />");
        }
        out.println("<input type='submit' />");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

}
