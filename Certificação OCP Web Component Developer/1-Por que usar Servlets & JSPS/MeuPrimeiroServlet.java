import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Esse é a maneira mais crua, onde o desenvolvedor coloca tags HTML dentro do java.
 * NUNCA desenvolver dessa maneira.
 *
 */
public class MeuPrimeiroServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		Date minhaData = new Date();
		
		out.println("<html>" +
				       "<body>" +
				            "<h1> Renan's Page </h1>" +
				            "<br/>" +
				             minhaData +
				        "</body>" +
				    "</html>");
	}
}
