package br.com.cefet.banco.modelo;

public class Gerente extends Funcionario implements FuncionarioAutenticavel {
	 private AutenticadorLogica autenticador;
	
	 public Gerente(String name, double salary) {
		 super(name, salary);
		 this.autenticador = new AutenticadorLogica();
	 }
	 
	 @Override
	 public double getBonificacao() {
		return super.getBonificacao() + this.salary * 0.5;
	 }
	 
	 @Override
	 public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	 }
	 
	 public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	 }
}
