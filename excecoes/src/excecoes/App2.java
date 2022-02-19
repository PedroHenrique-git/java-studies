package excecoes;

public class App2 {
	 public static void main(String[] args) throws java.io.FileNotFoundException {
		 try {
			 madeDivision();			 
		 } catch(MyException2 e) {
			 System.err.println("Message: " + e.getMessage());
		 } finally {
			 System.out.println("Chegou no final 2");
		 }
		 
		 StackOverflowError err = new StackOverflowError();
	 }
	 
	 public static void madeDivision() throws MyException2, java.io.FileNotFoundException {
		 int x = 5;
		 int y = 0;
		 //madeDivision();
		 new java.io.FileInputStream("arquivo.txt");
		 try {
			 int z = x / y;
			 System.out.println("Valor de Z: " + z);
		 } catch(ArithmeticException e) {
			 throw new MyException2("Divisao por zero");
		 } finally {
			 System.out.println("Chegou no final");
		 }
	 }
}
