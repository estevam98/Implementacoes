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
		lb.setTitulo("Festas");
		lb.setDescricao("ficando locao com 5 reais ");
		lb.setDataCadastro(Date.from(agora));
		lb.setDataInicio(Date.from(agora));
		
		Lembrete lb_01 = new Lembrete();
		lb_01.setId(002);
		lb_01.setTitulo("Faculdade");
		lb_01.setDescricao("Bares");
		lb_01.setDataCadastro(Date.from(agora));
		lb_01.setDataInicio(Date.from(agora));
		
		Lembrete lb_02 = new Lembrete();
		lb_02.setId(003);
		lb_02.setTitulo("Casa");
		lb_02.setDescricao("Ficar locasso");
		lb_02.setDataCadastro(Date.from(agora));
		lb_02.setDataInicio(Date.from(agora));
		
		Lembrete lb_03 = new Lembrete();
		lb_03.setId(004);
		lb_03.setTitulo("naotuteentenndo");
		lb_03.setDescricao("So quero ficar locau");
		lb_03.setDataCadastro(Date.from(agora));
		lb_03.setDataInicio(Date.from(agora));
		
		Lembrete lb_04 = new Lembrete();
		lb_04.setId(005);
		lb_04.setTitulo("Nascimento");
		lb_04.setDescricao("Eu nasci para dar PT");
		lb_04.setDataCadastro(Date.from(agora));
		lb_04.setDataInicio(Date.from(agora));
		
		Lembrete lb_05 = new Lembrete();
		lb_05.setId(006);
		lb_05.setTitulo("Vida");
		lb_05.setDescricao("Objetivo de vida é ficar locao");
		lb_05.setDataCadastro(Date.from(agora));
		lb_05.setDataInicio(Date.from(agora));
		
		add(lb);
		add(lb_01);
		add(lb_02);
		add(lb_03);
		add(lb_04);
		add(lb_05);
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
