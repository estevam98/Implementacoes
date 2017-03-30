package br.udemy.aula37;

public class Main {
	
	public Main() {
		Carro carro = new Carro(1, "JAS-4783", "Ferrari", "Modelo da ferrari", 2018, "Vermelho", 200);
		
		Cliente cliente = new Cliente(2, "987897871", "jhoestevam", null);
	}
	
	public void realizarLocacao(int idCarro, int idCliente){
		Locacao locacao = new Locacao();
		locacao.idCarro = idCarro;
		locacao.idCliente = idCliente;
	}
}
