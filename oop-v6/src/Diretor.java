
public class Diretor extends Gerente {
	public Diretor(String name, double salario) {
		super(name, salario);
	}
	
	public double getBonificacao() {
		return this.salary * 0.5;
	}
}
