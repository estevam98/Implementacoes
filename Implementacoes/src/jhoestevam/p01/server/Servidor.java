package jhoestevam.p01.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.univel.comum.ServicoRMI;

public class Servidor implements ServicoRMI{
	private static final int TCPIP = 1818;
	private SimpleDateFormat sdf = new SimpleDateFormat("'Servidor - 'dd/MM/yyyy H:mm:ss' -> '");
	
	@Override
	public String saudar(String nome) throws RemoteException {
		mostrarConsole(String.format("Cliente conectou e passou o parametro %s para saudação. ", nome));
		return "Olá " + nome + "!";
	}
	
	private void mostrarConsole(String string){
		System.out.println(sdf.format(new Date()) + string);
	}
	
	public Servidor(){
		ServicoRMI servico;
		
		mostrarConsole("Iniciando conexão com o servidor.");
		
		try {
			servico = (ServicoRMI) UnicastRemoteObject.exportObject(Servidor.this, TCPIP);
			
			Registry registry = LocateRegistry.createRegistry(TCPIP);
			registry.rebind(ServicoRMI.SERVICE, servico);
			mostrarConsole("Aguardando conexão do cliente.");
		} catch (RemoteException e) {
			System.err.println("CONFIGURAÇÃO COM O SERVIDOR INCORRETA");
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new Servidor();
	}
}
