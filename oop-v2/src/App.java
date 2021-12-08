
public class App {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.numero = 1111;
		conta1.saldo = 400;
		conta1.titular = "Pedro";
		
		conta2.numero = 2222;
		conta2.saldo = 900;
		conta2.titular = "Luiz";
		
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
		System.out.println("Numero: " + conta.numero);
		System.out.println("Titular: " + conta.titular);
		System.out.println("Saldo: " + conta.saldo);
		System.out.println("################\n");
	}
}
