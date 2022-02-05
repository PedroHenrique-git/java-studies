package excecoes;

public class App {
	public static void main(String args[]) {
		System.out.println("inicio main");
		metodo1();
		System.out.println("fim main");
		
		try {
			teste();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void metodo1() {
		System.out.println("inicio metodo1");
		metodo2();
		System.out.println("fim metodo1");
	}
	
	public static void metodo2() {
		System.out.println("inicio metodo2");
		int[] vetor = { 1, 2, 3, 4, 5 };
		for (int num : vetor) {
			System.out.println(num);
		}
		System.out.println("fim metodo2");
	}
	
	public static void teste() {
		try {
			double c = 1 / 0;
		} catch(ArithmeticException e) {
			throw new ArithmeticException("Division by zero"); 
		}
	}
}
