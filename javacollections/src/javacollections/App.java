package javacollections;
import java.util.*;

public class App {
	public static void main(String args[]) {
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Pedro");
		lista.add("Luiz");
		lista.add("Paulo");
		
		lista.forEach(item -> System.out.println(item));
		
		Collections.shuffle(lista);
		
		lista.forEach(item -> System.out.println(item));
	}
}
