package br.udemy.aula37;

import java.time.LocalDate;

public class Locacao {

	int id;
	int idCarro;
	int idCliente;
	double valorLocado;
	LocalDate dataInicio;
	LocalDate dataFim;
	
	public Locacao(int idCarro, int idCliente, double valorLocado, LocalDate dataInicio, LocalDate dataFim) {
		this.id = 1;
		this.idCarro = idCarro;
		this.idCliente = idCliente;
		this.valorLocado = valorLocado;
		this.dataFim = dataFim;
		this.dataInicio = dataInicio;
	}
}
