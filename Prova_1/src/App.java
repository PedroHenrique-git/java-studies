
public class App {
	public static void main(String[] args) {
		VeiculoDePasseio veiculoDePasseio = new VeiculoDePasseio(2012, "fiat uno", 15000);
		VeiculoUtilitario veiculoUtilitario = new VeiculoUtilitario(2012, "fiat uno 2.0", 10000, 150);
		SomadorDeImpostos somadorDeImpostos = new SomadorDeImpostos();
		
		System.out.println("Gasto veiculo 1: " + veiculoDePasseio.retornarValorImposto());
		System.out.println("Gasto veiculo 2: " + veiculoUtilitario.retornarValorImposto());
		
		somadorDeImpostos.acumularGastosComImpostos(veiculoDePasseio);
		somadorDeImpostos.acumularGastosComImpostos(veiculoUtilitario);
		
		System.out.println("Gasto total com impostos: " + somadorDeImpostos.getTotalDeGastosComImpostos());
		
		System.out.println();
		
		showInformations(veiculoDePasseio);
		showInformations(veiculoUtilitario);
	}
	
	public static void showInformations(Veiculo veiculo) {
		veiculo.setAno(1987);
		veiculo.setModelo("GOl bola");
		veiculo.setValorDeMercado(145904);
		
		System.out.println("Ano: " + veiculo.getAno());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Valor de mercado: " + veiculo.getValorDeMercado());
	}
}
