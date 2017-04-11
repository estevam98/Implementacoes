package br.udemy.aula47;

import java.time.LocalDate;

public class Locacao {

	private long id;
	private long idCarro;
	private long idCliente;
	
	private LocalDate dataInicial;
	private LocalDate dataTermino;
	
	
	public Locacao(long idLocacao, long idCarro, long idCliente, LocalDate dataInicial, LocalDate dataTermino) {
		super();
		this.id = idLocacao;
		this.idCarro = idCarro;
		this.idCliente = idCliente;
		this.dataInicial = dataInicial;
		this.dataTermino = dataTermino;
	}
	
	public Locacao() {
	}

	public long getIdLocacao() {
		return id;
	}

	public void setIdLocacao(long idLocacao) {
		this.id = idLocacao;
	}

	public long getCarro() {
		return idCarro;
	}

	public void setCarro(long idCarro) {
		this.idCarro = idCarro;
	}

	public long getCliente() {
		return idCliente;
	}

	public void setCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

	public LocalDate getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(LocalDate dataTermino) {
		this.dataTermino = dataTermino;
	}
}
