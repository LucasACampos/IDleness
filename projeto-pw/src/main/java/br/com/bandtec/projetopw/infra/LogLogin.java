package br.com.bandtec.projetopw.infra;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LogLogin {
	
	private static ArrayList<LogLoginEData> historicoLogin = new ArrayList<LogLoginEData>();
	
	public static void adicionarInstanciaDeLog(String login) {
		LogLoginEData LoginEData = new LogLoginEData(login);
		historicoLogin.add(LoginEData);
		System.out.println(exibirList(historicoLogin));
		System.out.println(historicoLogin.toString());
	}

	
	private static String exibirList(ArrayList<LogLoginEData> historicoLoginTemp) {
		LogLoginEData LogEData;
		String saida = "";
		
		for(int i = 0; i < historicoLoginTemp.size(); i++) {
			LogEData = historicoLoginTemp.get(i);
			saida += LogEData.getLogin();
			
		}
		
		return saida;
	}
	

}
