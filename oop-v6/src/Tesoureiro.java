
public class Tesoureiro extends Funcionario {
	public Tesoureiro(String name, double salario) {
		super(name, salario);
	}
	
	@Override
	public double getBonificacao() {
		return this.salary * 0.2;
	}
}
