package br.udemy.aula39;

public class Main {
	
	public static void main(String[] args) {
		Conta conta = new Conta(001, 3000.00, 200.00, "jhoestevam");
		Conta contaDois = new Conta(002, 7000.00, 1000.00, "Jhonatan");
		
		conta.transfere(50, contaDois);
	}
}
