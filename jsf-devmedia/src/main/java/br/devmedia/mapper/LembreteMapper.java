package br.devmedia.mapper;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.devmedia.model.Lembrete;

public class LembreteMapper {

	private List<Lembrete> list = new ArrayList<>();
	
	public LembreteMapper() {
		Instant agora = LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
		
		Lembrete lb = new Lembrete();
		lb.setId(001);
		lb.setTitulo("Como ficar locao com 5 reais");
		lb.setDescricao("ficando locao com 5 reais ");
		lb.setDataCadastro(Date.from(agora));
		lb.setDataInicio(Date.from(agora));
		
		add(lb);
	}
	
	public List<Lembrete> getLembrete(){
		return list;
	}
	
	public void add(Lembrete lembrete){
		lembrete.setId(list.size() + 1);
		
		Instant agora = LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
		
		Date hoje = Date.from(agora);
		lembrete.setDataCadastro(hoje);
		
		list.add(lembrete);
	}
	
	public void remove(Lembrete lembrete){
		try {
			lembrete = find(lembrete.getId());
			
			list.remove(lembrete);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void edit(Lembrete lembrete){
		try {
			for (Lembrete lb: list) {
				if (lb.getId() == lembrete.getId()) {
					lb = lembrete;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Lembrete find(Long id){
		Lembrete lembrete = null;
		
		try {
			for (Lembrete lb : list) {
				if (lb.getId() == id) {
					lembrete = lb;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lembrete;
	}
}
