
public class App {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("João", 2600); 
		Funcionario funcionario2 = new Funcionario("Luiz", 2300);
		Funcionario funcionario3 = new Funcionario("Douglas", 2000);
		Gerente gerente1 = new Gerente("Renato", 1200);
		Tesoureiro tesoureiro = new Tesoureiro("Marcos", 12300);
		Caixa caixa1 = new Caixa("Macedo", 12392);
		ContabilizadorDeBonificacoes cdb = new ContabilizadorDeBonificacoes();
		Diretor diretor = new Diretor("Director", 250000);
		gerente1.setSenha(44232);
		
		System.out.println("Autenticado: " + gerente1.autentica(44232));
		System.out.println("Autenticado 2: " + gerente1.autentica("Renato", 44232));
		
		cdb.contabilizaBonificacoes(funcionario1);
		cdb.contabilizaBonificacoes(funcionario2);
		cdb.contabilizaBonificacoes(funcionario3);
		cdb.contabilizaBonificacoes(gerente1);
		cdb.contabilizaBonificacoes(tesoureiro);
		cdb.contabilizaBonificacoes(caixa1);
		cdb.contabilizaBonificacoes(diretor);
		
		mostrarBonificacao(gerente1);
		mostrarBonificacao(funcionario1);
		System.out.println("Total de bonificacoes: " + cdb.getValorTotalDeBonificacoes());
	}
	
	public static void mostrarBonificacao(Funcionario funcionario) {
		System.out.println("Sua bonificacao e de: R$" + funcionario.getBonificacao());
	}
}
