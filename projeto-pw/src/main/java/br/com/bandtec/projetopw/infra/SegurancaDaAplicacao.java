package br.com.bandtec.projetopw.infra;

import org.springframework.stereotype.Component;

import br.com.bandtec.projetopw.controller.Credenciais;
import br.com.bandtec.projetopw.infra.repository.RepositorioUsuarios;

@Component
public class SegurancaDaAplicacao {

	private RepositorioUsuarios repositorioUsuarios;
	
	public SegurancaDaAplicacao(RepositorioUsuarios repositorioUsuarios) {
		this.repositorioUsuarios = repositorioUsuarios;
	}

	public boolean permitirAcesso(Credenciais credenciais) {
		if(credenciais.getLogin() == null || credenciais.getSenha() == null) return false;
		return credenciais.getLogin().equals(credenciais.getSenha());
	}

}
