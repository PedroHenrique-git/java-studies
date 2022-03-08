public class App {
	public static void main(String[] args) throws InterruptedException {
		GeraPdf geraPdf = new GeraPdf();
		
		Thread threadPdf = new Thread(geraPdf);
		threadPdf.sleep(3000);
		threadPdf.start();
		
		BarraDeProgresso barraProgresso = new BarraDeProgresso();
		Thread threadDaBarra = new Thread(barraProgresso);
		threadDaBarra.sleep(3000);
		threadDaBarra.start();
	}
}
