package br.com.cefet.banco.teste;

import br.com.cefet.banco.modelo.Cliente;
import br.com.cefet.banco.modelo.Gerente;
import br.com.cefet.banco.modelo.SistemaInterno;
import br.com.cefet.banco.modelo.Tesoureiro;
import br.com.cefet.banco.modelo2.Administrador;

public class App {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno(2932);
		
		Administrador adm = new Administrador("Henrique", 18900);
		Gerente gerente1 = new Gerente("Pedro", 5000);
		gerente1.setSenha(2424);
		Gerente gerente2 = new Gerente("Luiz", 8000);
		gerente2.setSenha(2932);
		Tesoureiro tesoureiro = new Tesoureiro("Paulo", 34342);
		tesoureiro.setSenha(2932);
		Cliente cliente = new Cliente("Marcos", 4214);
		cliente.setSenha(2932);
		
		System.out.println("Name: " + adm.getName());
		sistema.login(gerente1);
		sistema.login(gerente2);
		sistema.login(tesoureiro);
		sistema.login(cliente);
	}
}
