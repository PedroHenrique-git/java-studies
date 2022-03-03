package javaio;
import java.io.*;
import java.util.*;

public class App {
	public static void main(String args[]) throws IOException {
		lendoArquivo();
		//lendoDadosDoTeclado();
		escrevendoNoArquivo();
		escreveNoArquivoAPartirDoTeclado();
	}
	
	public static void lendoArquivo() throws IOException {
		InputStream file = new FileInputStream("E:/www/java-studies/javaio/src/javaio/arquivo.txt");
		InputStreamReader fileReader = new InputStreamReader(file, "UTF-8");  
		BufferedReader br = new BufferedReader(fileReader); 
		
		String s = br.readLine();
		
		while(s != null)  {
			System.out.println(s);
			s = br.readLine();
		}
		
		br.close();
	}
	
	public static void lendoDadosDoTeclado() throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String s = br.readLine();
		
		while (s != null) {
			System.out.println(s);
			s = br.readLine();
		}
		
		br.close();
	}
	
	public static void escrevendoNoArquivo() throws IOException {
		OutputStream os = new FileOutputStream("E:/www/java-studies/javaio/src/javaio/arquivo.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.newLine();
		bw.write("TESTE");
		bw.close();
	}
	
	public static void escreveNoArquivoAPartirDoTeclado() throws FileNotFoundException {
		PrintStream ps = new PrintStream("E:/www/java-studies/javaio/src/javaio/arquivo.txt");
		Scanner s = new Scanner(System.in);
		
		while(s.hasNextLine()) {
			ps.println(s.nextLine());
		}
		
		ps.close();
	}
	
	public static void escreveNoArquivoAPartirDoTecladov2() throws IOException {
		PrintStream ps = new PrintStream("E:/www/java-studies/javaio/src/javaio/arquivo.txt");
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String text = br.readLine();
		
		while (text != null) {
			ps.println(text);
			text = br.readLine();
		}
		
		ps.close();
	}
}
