class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(String nomeTitular, int numero) {
        super(nomeTitular, numero);
    }
    
    @Override
    public double getValorImposto() {
    	return super.getSaldo() * 0.02;
    }
}