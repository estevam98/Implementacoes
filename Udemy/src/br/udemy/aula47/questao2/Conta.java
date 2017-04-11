package br.udemy.aula47.questao2;

public class Conta {

	private int numero;
	
	private double saldo;
	private double limite;
	
	private String nome;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean sacar(double valor) {
		if(valor <= this.saldo){
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("unused")
	private void depositar(double valor) {
		saldo += valor;
	}
	
	@SuppressWarnings("unused")
	private void transfere(double valor, Conta destinatario) {
		if (valor <= saldo) {
			this.saldo -= valor;
			destinatario.depositar(valor);
		}
	}
}
