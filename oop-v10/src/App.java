public class App {
	public static void main(String args[]) {
		ContaCorrente cc = new ContaCorrente("Pedro", 23232);
		cc.deposita(3000);
		
		ContaCorrente cc2 = new ContaCorrente("Luiz", 64633);
		cc.deposita(3000);
		
		cc.saca(1500);
		cc2.saca(1500);
		
		SeguroDeVida seguro = new SeguroDeVida();
		ControladorDeImposto controlador = new ControladorDeImposto();
	
		controlador.contabiliza(cc);
		controlador.contabiliza(cc2);
		controlador.contabiliza(seguro);
		
		System.out.println("Total de impostos --> " + controlador.getTotalImpostos());
	}
}
