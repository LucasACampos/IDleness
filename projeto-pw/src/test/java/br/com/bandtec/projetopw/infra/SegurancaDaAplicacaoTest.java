package br.com.bandtec.projetopw.infra;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import br.com.bandtec.projetopw.controller.Credenciais;
import br.com.bandtec.projetopw.infra.repository.RepositorioUsuarios;

public class SegurancaDaAplicacaoTest {
	
	private SegurancaDaAplicacao seguranca;
	private RepositorioUsuarios repositorioUsuarios;
	
	private Credenciais credenciaisIguais = new Credenciais("rodrigo", "rodrigo");
	private Credenciais credenciaisDiferentes = new Credenciais("rodrigo", "vieira");
	private Credenciais credencialNula = new Credenciais(null, null);
	
	@Before
	public void setUp() {
		repositorioUsuarios = mock(RepositorioUsuarios.class);
		seguranca = new SegurancaDaAplicacao(repositorioUsuarios);
	}
	
	@Test
	public void aoReceberCredenciaisIguaisRetornarTrue() {
		assertTrue(seguranca.permitirAcesso(credenciaisIguais));
	}
	
	@Test
	public void aoReceberCredenciaisDiferentesRetornarFalse() {
		assertFalse(seguranca.permitirAcesso(credenciaisDiferentes));
	}
	
	@Test
	public void aoReceberCredencialNulaRetornarFalse() {
		assertFalse(seguranca.permitirAcesso(credencialNula));
	}
	
	@Test
	public void seUsuarioNoBancoECredenciaisIguaisRetornarTrue() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
