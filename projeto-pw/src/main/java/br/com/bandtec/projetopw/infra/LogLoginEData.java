package br.com.bandtec.projetopw.infra;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class LogLoginEData {
	private String login;
	private String dataEHora;
	DateFormat dataEHoraDoLoginFormatacao = new SimpleDateFormat("dd/mm/yy HH:mm:ss");
	
	@Autowired
	public LogLoginEData(String login) {
		this.login = login;	
		Date dataEHoraTemporario = new Date();
		dataEHora = dataEHoraDoLoginFormatacao.format(dataEHoraTemporario);
	}

	public String getLogin() {
		return login;
	}
	
	@Autowired
	public void setLogin(String login) {
		this.login = login;
	}
	
	
}
