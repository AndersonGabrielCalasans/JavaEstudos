package calasansbank;

public class Conta {
	private double saldo = 0;
	private int agencia;
	private int conta;
	Cliente titular;

	private static int total = 0;

	public Conta(int agencia, int conta, Cliente titular) {
		Conta.total++;
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		System.out.println("Conta de numero " + conta + " criada com sucesso!");
	}

	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Transação Efetuada com sucesso!");
		} else {
			System.out.println("Valor inválido, tente novamente!");
		}
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Transação efetuada com sucesso!");
			return true;
		} else {
			System.out.println("Valor inválido, tente novamente!");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		System.out.println("Valor inválido, tente novamente!");
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public static int getTotal() {
		return Conta.total;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getConta() {
		return this.conta;
	}

	public Cliente getTitular() {
		return this.titular;
	}
}
