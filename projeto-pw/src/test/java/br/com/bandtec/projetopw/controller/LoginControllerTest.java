package br.com.bandtec.projetopw.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import br.com.bandtec.projetopw.infra.SegurancaDaAplicacao;

public class LoginControllerTest {
	
	Credenciais credenciais = new Credenciais("login", "senha");
	
	private SegurancaDaAplicacao seguranca;
	private LoginController controller;
	
	@Before
	public void inicializar() {
		seguranca = mock(SegurancaDaAplicacao.class);
		controller = new LoginController(seguranca);
	}
	
	@Test
	public void aoDigitarLoginESenhaValidosAbrirTelaPrincipal() {
		when(seguranca.permitirAcesso(credenciais)).thenReturn(true);
	
		String telaPrincipal = controller.efetuarLogin(credenciais);
		
		assertEquals(LoginController.PAGINA_PRINCIPAL, telaPrincipal);
	}
	
	@Test
	public void aoDigitarLoginEOuSenhaErradosExibirPaginaDeErro() {
		when(seguranca.permitirAcesso(credenciais)).thenReturn(false);
		
		String paginaDeErro = controller.efetuarLogin(credenciais);
		
		assertEquals(LoginController.PAGINA_DE_ERRO, paginaDeErro);
	}
}
