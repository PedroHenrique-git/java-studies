package br.com.cefet.banco.modelo2;

import br.com.cefet.banco.modelo.Funcionario;

public class Administrador extends Funcionario {
	public Administrador(String name, double salary) {
		super(name, salary);
	}
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return super.salary * 0.18;
	}
}
