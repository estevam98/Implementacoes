package br.udemy.aula47;

public class Cliente {
	
	private long id;

	private String nome;
	private String sobrenome;
	private String cpf;
	private String cnh;
	
	private int nascimento;
	
	public Cliente(long id,String nome, String sobrenome, String cpf, String cnh, int nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.cnh = cnh;
		this.nascimento = nascimento;
	}
	
	public Cliente() {
	}

	public long getId(){
		return id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
}
