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
        String numero = request.getParameter("numero");
        HttpSession session = request.getSession();
        session.setAttribute("clave", numero);
        int numeroi = Integer.parseInt(numero);

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Servlet1</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action='Servlet2' method='get' >");
        for (int i = 0; i < numeroi; i++) {
            out.println("src: <input type='text' name='src" + (i + 1) + "' />");
            //out.println("texto: <input type='text' name='texto"+(i+1)+"'/><br />");
        }
        out.println("<input type='submit' />");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

}
