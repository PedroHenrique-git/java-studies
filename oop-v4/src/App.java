public class App {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Cliente cliente1 = new Cliente("Pedro", "111.111.111-11", "a@email.com");
		Cliente cliente2 = new Cliente("Luiz", "222.222.222-11", "b@email.com");
		
		conta1.setCliente(cliente1);
		conta2.setCliente(cliente2);
		
		conta1.setNumero(11111);
		conta1.setSaldo(900);
		
		conta2.setNumero(22222);
		conta2.setSaldo(500);
		
		boolean saque1Ok = conta1.saca(500);
		boolean saque2Ok = conta2.saca(900);
		
		if( saque1Ok ) System.out.println("Saque 1 efetuado com sucesso");
		if( saque2Ok ) System.out.println("Saque 2 efetuado com sucesso");
		
		boolean deposito1Ok = conta1.deposito(400);
		boolean deposito2Ok = conta2.deposito(500);
		
		if( deposito1Ok ) System.out.println("Deposito 1 efetuado com sucesso");
		if( deposito2Ok ) System.out.println("Deposito 2 efetuado com sucesso");
		
		mostrarInformacoes(conta1);
		mostrarInformacoes(conta2);
		
		conta1.transfere(900, conta2);
		
		mostrarInformacoes(conta1);
		mostrarInformacoes(conta2);
	}
	
	public static void mostrarInformacoes(Conta conta) {
		System.out.println("\n################");
		System.out.println("Numero: " + conta.getNumero());
		System.out.println("Titular: " + conta.getTitular());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("################\n");
	}
}
