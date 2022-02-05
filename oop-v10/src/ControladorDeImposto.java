public class ControladorDeImposto {
	private double totalDeImpostos = 0.0;
	
	public void contabiliza(Tributavel t) {
		this.totalDeImpostos += t.getValorImposto();
	}
	
	public double getTotalImpostos() {
		return this.totalDeImpostos;
	}
}
