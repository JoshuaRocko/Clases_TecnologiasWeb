package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int numero = Integer.parseInt(request.getParameter("numero"));

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Servlet1</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<input type='hidden' value='" + numero + "' name='numero' />");
        out.println("<form action='Servlet2' method='get' id='form1'");
        for (int i = 0; i < numero; i++) {
            out.println("<textarea name'reglasdeestilo' form='form1' cols='50' rows='10'></textarea>");
            out.println("Etiqueta: <input name");
        }
        out.println("<input type='submit />'");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");

    }
}
