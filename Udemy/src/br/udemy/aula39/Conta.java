package br.udemy.aula39;


public class Conta {
	
	int numero;
	double saldo;
	double limite;
	String nome;
	
	public Conta(int numero, double saldo, double limite, String nome) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.nome = nome;
	}
	
	boolean saca(double valor) {
		return false;
	}
	
	void deposita(double valor) {

	}
	
	void transfere(double valor, Conta destinatario) {
	
	}
}
