package AppConta;

public class CalculadorImposto {
    
    private double totalImposto;

    public double getTotalImposto() {
        return totalImposto;
    }

    public void registra(Tributavel tributavel){
        double valor = tributavel.getValorImposto();
        this.totalImposto += valor;
    } 
}
