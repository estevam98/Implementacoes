package br.devmedia.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class Validation implements Serializable{

	private String nome;
	private String telefone;
	private String email;
	
	private Long idade;
	
	private Double nota;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getIdade() {
		return idade;
	}
	public void setIdade(Long idade) {
		this.idade = idade;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	public Validation() {
		// TODO Auto-generated constructor stub
	}
	
	public String processaDados(){
		String saida = null;
		
		saida += "Nome: " + nome; 
		saida += "Telefone: " + telefone;
		saida += "Email: " + email;
		saida += "Idade: " + idade;
		saida += "Nota: " + nota;
		
		FacesMessage fm = new FacesMessage(saida);
		FacesContext.getCurrentInstance().addMessage("", fm);
		
		return "form";
	}
}
