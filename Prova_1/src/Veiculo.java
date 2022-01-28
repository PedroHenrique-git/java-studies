
abstract public class Veiculo {
	protected int ano;
	protected String modelo;
	protected double valorDeMercado;
	
	abstract public double retornarValorImposto();
	
	public Veiculo(int ano, String modelo, double valorDeMercado) { 
		this.ano = ano;
		this.modelo = modelo;
		this.valorDeMercado = valorDeMercado;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setValorDeMercado(double valorDeMercado) {
		if( valorDeMercado > 0 )
			this.valorDeMercado = valorDeMercado;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public double getValorDeMercado() {
		return this.valorDeMercado;
	}
}

