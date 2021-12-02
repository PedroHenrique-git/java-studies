public class App {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        Conta conta1 = new Conta(100);

        conta1.setTitular("Pedro");
        conta1.setNumero(123);
        conta1.setSaldo(4000);

        caneta1.setCor("Preta");
        caneta1.setFormato("Cilindrica");
        caneta1.setMarca("Bic");
        caneta1.setTampa(false);
        caneta1.setTamanho(1.60);

        showContaInfo(conta1.getTitular(), conta1.getNumero(), conta1.getSaldo());
        showCanetaInfo(caneta1.getCor(), caneta1.getFormato(), caneta1.getMarca(), caneta1.getTampa(), caneta1.getTamanho());
    }

    public static void showContaInfo(String titulo, int numero, double saldo) {
        System.out.println(titulo + ", " + numero + ", " + saldo);
    }

    public static void showCanetaInfo(String cor, String formato, String marca, boolean tampa, double tamanho) {
        System.out.printf("Caneta de cor: %s, formato: %s, marca: %s, tampa: %b, tamanho: %f",
        cor, formato, marca, tampa, tamanho);
    }
} 
