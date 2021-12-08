public class Conta {
	private Cliente cliente;
	private int numero;
	private double saldo = 500;
	
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
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public String getTitular() {
		return this.cliente.getNome();
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setNumero(int numero) {
		if( numero < 0 ) return;
		this.numero = numero;
	}
	
	public void setSaldo(double saldo) {
		if( saldo < 0 ) return;
		this.saldo = saldo;
	}
}

