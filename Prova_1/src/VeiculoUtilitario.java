
public class VeiculoUtilitario extends Veiculo {
	private int capacidadeDeCarga;
	
	public VeiculoUtilitario(int ano, String modelo, double valorDeMercado, int capacidadeDeCarga) {
		super(ano, modelo, valorDeMercado);
		this.capacidadeDeCarga = capacidadeDeCarga; 
	}
	
	public int getCapacidadeDeCarga() {
		return this.capacidadeDeCarga;
	}
	
	@Override
	public double retornarValorImposto() {
		return this.valorDeMercado * 0.20;
	}
}
