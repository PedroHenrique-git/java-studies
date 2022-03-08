public class BarraDeProgresso implements Runnable {
	public void run() {
		for(int i = 10000; i > 0; i--) {
			System.out.println(i);
		}
	}
}
