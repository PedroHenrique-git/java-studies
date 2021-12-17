
public class App {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("João", 2600); 
		Funcionario funcionario2 = new Funcionario("Luiz", 2300);
		Funcionario funcionario3 = new Funcionario("Douglas", 2000);
		Gerente gerente1 = new Gerente("Renato", 1200);
		gerente1.setSenha(44232);
		
		System.out.println("Autenticado: " + gerente1.autentica(44232));
		System.out.println("Autenticado 2: " + gerente1.autentica("Renato", 44232));
		
		mostrarBonificacao(gerente1);
		mostrarBonificacao(funcionario1);
	}
	
	public static void mostrarBonificacao(Funcionario funcionario) {
		System.out.println("Sua bonificacao e de: R$" + funcionario.getBonificacao());
	}
}
