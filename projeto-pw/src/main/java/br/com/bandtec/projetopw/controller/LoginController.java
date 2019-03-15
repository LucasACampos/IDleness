package br.com.bandtec.projetopw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.bandtec.projetopw.infra.LogLogin;
import br.com.bandtec.projetopw.infra.SegurancaDaAplicacao;

@Controller
public class LoginController {

	public static final String PAGINA_PRINCIPAL = "paginaPrincipal";
	public static final String PAGINA_DE_ERRO = "paginaDeErro";
	public static final String PAGINA_DE_LOGIN = "paginaDeLogin";
	
	private SegurancaDaAplicacao seguranca;
	//@Autowired
	private LogLogin log;
	
	public LoginController(SegurancaDaAplicacao seguranca) {
		this.seguranca = seguranca;
	}

	@PostMapping("/login")
	public String efetuarLogin(@ModelAttribute Credenciais credenciais) {
		if(seguranca.permitirAcesso(credenciais)) {
			log.adicionarInstanciaDeLog(credenciais.getLogin());
			
			return PAGINA_PRINCIPAL;
		}
		else return PAGINA_DE_ERRO;
	}
	
	@GetMapping("/login")
	public String exibirPaginaDeLogin(Model model) {
		model.addAttribute(new Credenciais("login", null));
		return PAGINA_DE_LOGIN;
	}
	
	
	
	
	
	
	
	
	

}
