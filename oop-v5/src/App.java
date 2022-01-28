import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Conta conta1 = new Conta(1111);
		Conta conta2 = new Conta(2222);
		Conta conta3 = new Conta(2222);
		Conta conta4 = new Conta(2222);
		System.out.println("Total de contas em memória: " + Conta.getTotalDeContas());
	}
}
