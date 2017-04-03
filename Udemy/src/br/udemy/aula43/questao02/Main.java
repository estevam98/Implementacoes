package br.udemy.aula43.questao02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String algumaCoisa;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira sua data de nascimento:");
		algumaCoisa = entrada.next();
		
		System.out.println(algumaCoisa.substring(0, 2) + "/" + algumaCoisa.substring(2, 4) + "/" + algumaCoisa.substring(4, 8));
	}
}
