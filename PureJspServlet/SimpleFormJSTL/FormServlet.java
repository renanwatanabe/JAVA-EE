package meupackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("name");
		Integer age = Integer.parseInt(request.getParameter("age"));
		Double weight = Double.parseDouble(request.getParameter("weight"));
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String[] vehicles = request.getParameterValues("vehicle");
		String job = request.getParameter("jobs");
		String obs = request.getParameter("obs");
		String ninja = request.getParameter("ninja");
		
		Wizard meuWiz = new Wizard();
		meuWiz.setNick("Renan");
		meuWiz.setLevel(99);
		
		Wizard meuWiz2 = new Wizard();
		meuWiz2.setNick("Brenda");
		meuWiz2.setLevel(98);
		
		List<Wizard> listaWizards = new ArrayList<Wizard>();
		listaWizards.add(meuWiz);
		listaWizards.add(meuWiz2);
		
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("weight", weight);
		request.setAttribute("password", password);
		request.setAttribute("sex", sex);
		request.setAttribute("vehicles", vehicles);
		request.setAttribute("job", job);
		request.setAttribute("obs", obs);
		request.setAttribute("ninja", ninja);
		
		request.setAttribute("listaWizards", listaWizards);
		RequestDispatcher rd = request.getRequestDispatcher("meuResult.jsp");
		rd.forward(request, response);
	}
}
