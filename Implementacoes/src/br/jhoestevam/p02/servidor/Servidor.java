package br.jhoestevam.p02.servidor;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import br.jhoestevam.p02.comum.ImplServidor;

public class Servidor extends UnicastRemoteObject implements ImplServidor {

	private static final long serialVersionUID = 5578723656570109648L;
	public static final int PORTA = 1818;
	
	public Servidor() throws RemoteException{
		
		try {
			Registry registry = LocateRegistry.createRegistry(PORTA);
			
			registry.rebind(ImplServidor.SERVICE, this);
			System.out.println("Servidor Iniciado");
		} catch (RemoteException e) {
			System.err.println("FALHA NA INICIALIZAÇÃO DO SERVIDOR\n " + "CERTIFIQUE QUE SE A PORTA ESTA DISPONIVEL");
			e.printStackTrace();
		}
	}
	
	@Override
	public String saudar(String nome) throws RemoteException {
		return "Olá " + nome + "  seja bem-vindo ao servidor!";
	}
	
	@Override
	public int calcularIdade(int idade) throws RemoteException {
		return 2017 - idade;
	}
	
	public static void main(String[] args){
		try {
			new Servidor();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
