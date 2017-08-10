package br.devmedia.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.devmedia.model.Messenger;

@ManagedBean
@SessionScoped
public class MessengerBean {
	
	private Messenger messenger;
	
	public Messenger getMessenger(){
		return messenger;
	}
}
