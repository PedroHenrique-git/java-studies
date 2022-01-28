
public class SomadorDeImpostos {
	private double totalDeGastosComImpostos;
	
	public void acumularGastosComImpostos(Veiculo veiculo) {
		this.totalDeGastosComImpostos += veiculo.retornarValorImposto();
	}
	
	public double getTotalDeGastosComImpostos() {
		return this.totalDeGastosComImpostos;
	}
}
