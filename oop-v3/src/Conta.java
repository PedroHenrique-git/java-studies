public class Conta {
	Cliente cliente;
	int numero;
	double saldo = 500;
	
	public boolean saca(double valor) {
		if( valor > this.saldo ) return false;
		this.saldo -= valor;
		return true;
	}
	
	public boolean deposito(double valor) {
		if( valor <= 0 ) return false;
		this.saldo += valor;
		return true;
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if( valor > this.saldo ) return false;
		this.saldo -= valor;
		return contaDestino.deposito(valor);
	}
}

