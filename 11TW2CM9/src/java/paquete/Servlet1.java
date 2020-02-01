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

        int filas = Integer.parseInt(request.getParameter("filas"));
        int columnas = Integer.parseInt(request.getParameter("columnas"));
        HttpSession session = request.getSession();

        session.setAttribute("filas", filas);
        session.setAttribute("columnas", columnas);

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Servlet1</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table border='1'");

        for (int i = 0; i < filas; i++) {
            out.println("<tr>");
            for (int j = 0; j < columnas; j++) {
                out.println("<td>Aber al cine Pvto</td>");
            }
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }

}
