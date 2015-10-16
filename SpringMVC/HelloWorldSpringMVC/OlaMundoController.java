package br.com.mypackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {

	@RequestMapping("/olaMundoSpring")
	public String execute(){
		System.out.println("Executandoo!!");
		return "ok";
	}
	
}
