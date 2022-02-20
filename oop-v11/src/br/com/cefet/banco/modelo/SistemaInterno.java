package br.com.cefet.banco.modelo;

public class SistemaInterno {
	private int senhaSistema;
	
	public SistemaInterno(int senha) {
		this.senhaSistema = senha;
	}
	
	public void login(FuncionarioAutenticavel fa) {
		if(fa.autentica(this.senhaSistema)) {
			System.out.println("Acesso liberado!");
		} else {
			System.out.println("Acesso negado!");
		}
	}
}
