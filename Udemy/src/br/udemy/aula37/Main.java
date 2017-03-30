package br.udemy.aula37;

import java.time.LocalDate;

public class Main {
	
	public Main() {
		Carro carro = new Carro(1, "JAS-4783", "Ferrari", "Modelo da ferrari", 2018, "Vermelho", 200);
		
		Cliente cliente = new Cliente(2, "987897871", "jhoestevam", null);
	}
	
	public void realizarLocacao(int idCarro, int idCliente){
		Locacao locacao = new Locacao(idCarro, idCliente, 500.00, LocalDate.now(), LocalDate.now().plusDays(5));
	}
	
	private void gerarRelatorio() {
		
	}
}
