package br.com.mybank.modelo;

public abstract class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("br.com.mybank.modelo.Conta criada:");
		System.out.println("Agencia: " + getAgencia());
		System.out.println("br.com.mybank.modelo.Conta: " + getNumero());
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void saca(double valor) {
		if (this.saldo < valor) {
			throw new WithdrawalError("Insufficient balance: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
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