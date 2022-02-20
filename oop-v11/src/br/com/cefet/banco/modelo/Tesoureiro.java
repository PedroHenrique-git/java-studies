package br.com.cefet.banco.modelo;

public class Tesoureiro extends Funcionario implements FuncionarioAutenticavel  {
	private AutenticadorLogica autenticador;
	
	@Override
    public boolean autentica(int senha) {
	 return this.autenticador.autentica(senha);
    }
	
	public Tesoureiro(String name, double salario) {
		super(name, salario);
		this.autenticador = new AutenticadorLogica();
	}
	
	@Override
	public double getBonificacao() {
		return this.salary * 0.2;
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
}

