package br.com.cefet.banco.modelo;

public interface FuncionarioAutenticavel {
	public boolean autentica(int senha);
	void setSenha(int senha);
}
