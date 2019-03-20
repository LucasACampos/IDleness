package br.com.bandtec.projetopw.infra;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class Logs {
	
	public LogsUsuarios logsUsuarios;
	
	public void GerarLog() throws IOException {
	FileWriter arq = new FileWriter("C:\\Users\\oliveira.elias\\Desktop\\log\\tabuada.txt");
	PrintWriter gravarArq = new PrintWriter(arq);
	
	
	}
}