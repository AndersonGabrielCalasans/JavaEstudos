package AppConta;

import AppSistema.Cliente;

public abstract class Conta {

    private double saldo;
    private int agencia;
    private int conta;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int conta) {

        if (agencia < 1) {
            throw new IllegalArgumentException("Agencia Inválida");
        }

        if (conta < 1) {
            throw new IllegalArgumentException("Agencia Inválida");
        }
        
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.conta = conta;
        // this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.conta);
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void saca(double valor) throws SaldoInsuficienteException {

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", valor solicitado: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getConta() {
        return this.conta;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

}
