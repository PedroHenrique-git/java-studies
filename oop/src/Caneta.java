public class Caneta {
    private String cor;
    private boolean tampa;
    private double tamanho;
    private String marca;
    private String formato;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTampa(Boolean tampa) {
        this.tampa = tampa;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getCor() {
        return this.cor;
    }

    public Boolean getTampa() {
        return this.tampa;
    }

    public double getTamanho() {
        return this.tamanho;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getFormato() {
        return this.formato;
    }
}