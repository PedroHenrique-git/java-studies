package javaio;
import java.io.*;

public class Files {
	public static void main(String args[]) throws IOException {
		criarArquivoNoDiretorio();
		escreverNoArquivo();
	}
	
	public static void criarArquivoNoDiretorio() throws IOException {
		File diretorio = new File("E:/www/java-studies/javaio/src/javaio");
		
		if(!diretorio.isDirectory()) {
			System.out.println("Diretório não existe.");
			
			if(diretorio.mkdir()) {
				System.out.println("Diretório " + diretorio + " criado.");
			}
		}
		
		File arquivo = new File(diretorio, "meuArquivo.txt");
		
		if(diretorio.exists()) {
			System.out.println("Diretório " + diretorio + " existe");
		
			if(arquivo.exists()) {
				System.out.println("Arquivo " + arquivo + " existe");
			} else if(arquivo.createNewFile()) {
				System.out.println("O arquivo " + arquivo + " acaba de ser criado.");
			}
			
		}
		
		FileReader fr = new FileReader(arquivo);
		BufferedReader br = new BufferedReader(fr);
		
		String linha = br.readLine();
		
		System.out.println(linha);
		
		while((linha = br.readLine()) != null) {
			System.out.println(linha);
		}
		
		br.close();
	}
	
	public static void escreverNoArquivo() throws IOException {
		File diretorio = new File("E:/www/java-studies/javaio/src/javaio");
		
		if(!diretorio.isDirectory()) {
			System.out.println("Diretorio não existe");
			if(diretorio.mkdir()) {
				System.out.println("Diretório " + diretorio + " criado.");
			}
		}
		
		File arquivo = new File(diretorio, "meuArquivo2.txt");
		
		if(diretorio.exists()) {
			System.out.println("Ditetório " + diretorio + " existe.");
		
			if(arquivo.exists()) {
				System.out.println("Arquivo " + arquivo + " existe.");
			} else if(arquivo.createNewFile()) {
				System.out.println("O arquivo " + arquivo + " acaba de ser criado");
			}
		}
		
		File files = new File("E:/www/java-studies/javaio/src/javaio");
		
		for(File file : files.listFiles()) {
			System.out.println(file);
		}
		
		FileWriter fw = new FileWriter(arquivo, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("Linha 1");
		pw.println("Linha 2");
		
		pw.flush();
		
		pw.close();
	}
}
