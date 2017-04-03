package br.udemy.aula43.questao01;

public class Main {

	public static void main(String[] args) {
		StringBuilder string = new StringBuilder();
		String nome = "O curso de Java";
		String avaliacao = "é bom !";
		
		string.append(nome);
		string.append(avaliacao);
		
		System.out.println(string);
		
		string.substring(11, 15);
		
		System.out.println(string.substring(11, 15));
	}
}
