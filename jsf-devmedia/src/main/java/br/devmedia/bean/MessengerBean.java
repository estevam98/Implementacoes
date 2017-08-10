package br.devmedia.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "messengerBean")
@SessionScoped
public class MessengerBean {
	
	private String messenger;
	
	public String getMessenger(){
		return messenger;
	}

	public MessengerBean() {
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:S");
		
		messenger = "A aplicação foi ao ar as:" + date.format(Calendar.getInstance().getTime());
	}
	
	public String sobre(){
		messenger = "Redirecionamento feito com sucesso";
		
		return "sobre?faces-redirect=true";
	}
}
