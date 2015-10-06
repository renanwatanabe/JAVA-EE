package meupackage;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TelaPrincipalServlet extends HttpServlet{
    private final String ACAO_BUSCAR  = "buscar";
    private final String ACAO_EDITAR  = "editar";
    private final String ACAO_NOVO    = "novo";
    private final String ACAO_EXCLUIR = "excluir";
    
    private WizardDAO wizardDAO = new WizardDAO();

    
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String acaoSelecionada = request.getParameter("acao");
		
		if(ACAO_BUSCAR.equals(acaoSelecionada)){
			buscarWizard(request,response);
		}else if(ACAO_EDITAR.equals(acaoSelecionada)){
			editarWizard(request,response);
		}else if(ACAO_NOVO.equals(acaoSelecionada)){
			novoWizard(request, response);
		}else if(ACAO_EXCLUIR.equals(acaoSelecionada)){
			excluirWizard(request, response);
		}else{//Tela inicial.
		
			List<WizardVO> listaWizards = wizardDAO.obterMassaWizards();
			request.setAttribute("listaWizards", listaWizards);
			
			RequestDispatcher rd = request.getRequestDispatcher("telaPrincipal.jsp");
			rd.forward(request, response);
		}
	}
	
	
	private void buscarWizard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<WizardVO> listaWizards = wizardDAO.buscarWizards("", "", "");
		request.setAttribute("listaWizards", listaWizards);
		RequestDispatcher rd = request.getRequestDispatcher("telaPrincipal.jsp");
		rd.forward(request, response);
	}
	
	private void editarWizard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
	
	private void novoWizard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
	
	private void excluirWizard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	}
}