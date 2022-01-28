
public class Caixa extends Funcionario {
	private int numeroDoGuiche;
	
	public Caixa(String name, double salario) {
		super(name, salario);
	}
	
	public void setNumeroDoGuiche(int numero) {
		this.numeroDoGuiche = numero; 
	}
	
	public int getNumeroDoGuiche() {
		return this.numeroDoGuiche;
	}
	
	@Override
	public double getBonificacao() {
		return this.salary * 0.4;
	}
}
