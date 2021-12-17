
public class Conta {
	private int numero;
	private static int totalDeContas;
	
	public Conta(int numero) {
		Conta.totalDeContas += 1;
		this.numero = numero;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
}
