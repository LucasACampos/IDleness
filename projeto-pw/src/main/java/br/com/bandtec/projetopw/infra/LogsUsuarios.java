package br.com.bandtec.projetopw.infra;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.springframework.stereotype.Component;

@Component
public class LogsUsuarios {
	
	String[][] matrizAcessos = new String[2][2];
	Calendar calendario = Calendar.getInstance();
	SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
	int cont = 0;
	public void acresentarMatriz(String login) {
		for (int cont = 0; cont < matrizAcessos.length; cont++) {
		String dataHora = s.format(calendario.getTime());
		matrizAcessos[cont][0] = login;
		matrizAcessos[cont][1] = dataHora;
		}
		int contLogin = 0;
			System.out.println(matrizAcessos[contLogin][0]);
			System.out.println(matrizAcessos[contLogin][1]);
			contLogin++;
			
			if (contLogin > 10) {
				contLogin = 0;
				//gerar log vem aqui
 			}
		
	}
}

