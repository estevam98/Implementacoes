package br.devmedia.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.devmedia.mapper.LembreteMapper;
import br.devmedia.model.Lembrete;

@ManagedBean
@SessionScoped
public class LembreteBean {

	private Lembrete lembrete;
	private LembreteMapper mapper = new LembreteMapper();
	
	public Lembrete getLembrete(){
		return lembrete;
	}
	
	public List<Lembrete> getList(){
		return mapper.getLembrete();
	}
	
	public String add(){
		mapper.add(lembrete);
		
		lembrete = new Lembrete();
		
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Lembrete adicionado com sucesso !"));
		context.getExternalContext().getFlash().setKeepMessages(true);
		
		return "index.xhtml";
	}
	
	@PostConstruct
	public void init(){
		lembrete = new Lembrete();
	}
}
