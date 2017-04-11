package br.udemy.aula47.questao1;

import java.time.LocalDate;

public class SisalucarApp {
	
	public static void main(String[] args) {
		Carro carro = new Carro(001, "BRH-0000", "Volkswagen", "GOL", "Prata", 2017);
		Cliente cliente = new Cliente(001, "Jhonatan", "Martins", "12354678-90", "XYZ0001", 1998);
		
		SisalucarApp sisalucar = new SisalucarApp();
		
		sisalucar.realizarLocacao(carro.getIdCarro(), cliente.getId());
	}
	
	public void realizarLocacao(long idCarro, long idCliente) {
		Locacao locacao = new Locacao();
		locacao.setIdLocacao(001);
		locacao.setCarro(idCarro);
		locacao.setCliente(idCliente);
		locacao.setDataInicial(LocalDate.now());
		locacao.setDataTermino(LocalDate.now().plusDays(5));
		
	}
}
