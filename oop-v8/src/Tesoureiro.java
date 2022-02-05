public class Tesoureiro extends Funcionario implements FuncionarioAutenticavel  {
	private int senha;
	
	public Tesoureiro(String name, double salario) {
		super(name, salario);
	}
	
	@Override
	public double getBonificacao() {
		return this.salary * 0.2;
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.senha == senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
}

