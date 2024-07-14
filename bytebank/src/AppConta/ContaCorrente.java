package AppConta;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int conta) {
        super(agencia, conta);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.1;
    }

}
