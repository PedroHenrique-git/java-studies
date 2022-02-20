package br.com.cefet.banco.modelo;

public class Cliente implements FuncionarioAutenticavel {
	private String name;
	private int cpf;
	private AutenticadorLogica autenticador;
	
	public Cliente(String name, int cpf) {
		this.name = name;
		this.cpf = cpf;
		this.autenticador = new AutenticadorLogica();
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
}
