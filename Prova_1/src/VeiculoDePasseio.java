
public class VeiculoDePasseio extends Veiculo {
	public VeiculoDePasseio(int ano, String modelo, double valorDeMercado) {
		super(ano, modelo, valorDeMercado);
	}
	
	@Override
	public double retornarValorImposto() {
		return this.valorDeMercado * 0.10;
	}
}
