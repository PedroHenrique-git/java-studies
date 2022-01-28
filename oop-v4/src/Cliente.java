public class Cliente {
	private String nome;
	private String cpf;
	private String email;
	
	public Cliente(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
	public void setCpf(String cpf) {
		if( this.validaCpf(cpf) ) this.setCpf(cpf);
	}
	
	private boolean validaCpf(String cpf) {
		if( cpf.length() < 14 ) return true;
		return false;
	}
	
	public String getNome() {
		return this.nome;
	}
}
