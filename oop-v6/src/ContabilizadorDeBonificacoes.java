
public class ContabilizadorDeBonificacoes {
	private double valorTotalDeBonificacoes;
	
	public double getValorTotalDeBonificacoes() {
		return this.valorTotalDeBonificacoes;
	}
	
	public void contabilizaBonificacoes(Funcionario func) {
		double bonificacao = func.getBonificacao();
		this.valorTotalDeBonificacoes += bonificacao; 
	}
}
