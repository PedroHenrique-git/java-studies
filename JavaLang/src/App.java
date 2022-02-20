import java.util.*;

public class App {
	public static void main(String[] args) {
		int x = 5;
		
		String nome = "CEFET";
		
		String novoNome = nome.toLowerCase();
		String novoNome2 = nome.toUpperCase();
		StringBuilder nomeBuilder = new StringBuilder("Cefet");
		
		nome = nome.concat(novoNome);
		nome = nome.concat(novoNome2);
		
		nomeBuilder.append(" - Nova friburgo");
		
		System.out.println(nome + " " + novoNome + " " + novoNome2);
		System.out.println(nome);
		System.out.println("Builder " + nomeBuilder);
		
		int[] numeros = { 1, 2, 3, 4, 5 };
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("N: " + i);
		}
	}
}
