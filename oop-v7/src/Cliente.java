public class Cliente implements FuncionarioAutenticavel {
	private String name;
	private int cpf;
	private int senha;
	
	public Cliente(String name, int cpf) {
		this.name = name;
		this.cpf = cpf;
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.senha == senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
