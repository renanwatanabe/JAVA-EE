package br.com.mypackage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TarefasController {

	private List<Tarefa> listaTarefas = new ArrayList<Tarefa>();
	
	@RequestMapping("novaTarefa")
	public String form() {
	    return "formulario";
	}
	
	
//	  @RequestMapping("adicionaTarefa")
//	  public ModelAndView lista(Tarefa tarefa) {
//	    ModelAndView mv = new ModelAndView("tarefa-adicionada");
//	    mv.addObject("nome", tarefa.getDescricao());
//	    return mv;
//	  }
	  
	  @RequestMapping("adicionaTarefa")
	  public String lista(Model model,Tarefa tarefa) {
		listaTarefas.add(tarefa);
	    model.addAttribute("listaTarefas", listaTarefas);
	    return "lista-tarefa";
	  }
	  
	  
	  @RequestMapping("listaTarefas")
	  public String lista(Model model) {
		  model.addAttribute("listaTarefas", listaTarefas);
	    return "lista-tarefa";
	  }
	  
	  @RequestMapping("removeTarefa")
	  public String remove(Tarefa tarefa) {
		  listaTarefas.remove(tarefa);
	    return "forward:listaTarefas";
	  }
	  
	  
}
