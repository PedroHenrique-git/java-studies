
public class Gerente extends Funcionario {
	 private int senha;
	
	 public Gerente(String name, double salary) {
		 super(name, salary);
	 }
	 
	 public void setSenha(int senha) {
		this.senha = senha;
	 }
	 
	 public int getSenha() {
		return senha;
	 }
	 
	 public boolean autentica(int senha) {
		 return this.senha == senha;
	 }
	 
	 public boolean autentica(String login, int senha) {
		 if( this.getName() == login && this.getSenha() == senha )
			 return this.senha == senha;
		 return false;
	 }
	 
	 @Override
	 public double getBonificacao() {
		return super.getBonificacao() + this.salary * 0.5;
	 }
}
