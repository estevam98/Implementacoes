package br.udemy.aula47.questao1;

public class Carro {
	
	private long id;
	
	private String placa;
	private String fabricante;
	private String modelo;
	private String cor;
	
	private int ano;
	
	private float valorDiaria;

	public Carro(long idCarro, String placa, String fabricante, String modelo, String cor, int ano) {
		super();
		this.id = idCarro;
		this.placa = placa;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	public Carro() {
	}
	
	public long getIdCarro() {
		return id;
	}

	public void setIdCarro(long idCarro) {
		this.id = idCarro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
}
