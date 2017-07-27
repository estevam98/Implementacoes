package br.devmedia.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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
}
