package meupackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
         RequestDispatcher rd = request.getRequestDispatcher("helloworld.jsp");
         request.setAttribute("helloWorldAttribute", "Hello World!");
         rd.forward(request, response);
	}
}
