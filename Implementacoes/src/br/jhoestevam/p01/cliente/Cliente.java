package br.jhoestevam.p01.cliente;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.jhoestevam.p01.comum.ServicoRMI;


public class Cliente {
	
	private static final String LOCALHOST = "127.0.0.1";
	private static final int TPCIP = 1818;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("'Cliente - 'dd/MM/yyyy H:mm:ss' ->'");
	public Cliente(){
		mostrarConsole("Iniciando cliente");
		
		try {
			Registry registry = LocateRegistry.getRegistry(LOCALHOST, TPCIP);
			
			ServicoRMI servico = (ServicoRMI) registry.lookup(ServicoRMI.SERVICE);
			
			String retorno = servico.saudar("jhoestevam");
			mostrarConsole(retorno);
		}catch(RemoteException e) {
			System.err.println("FALHA AO SE CONECTAR COM O SERVIDOR, VERIFIQUE SE O SERVIDOR ESTA ONLINE");
			e.printStackTrace();
		}catch(NotBoundException e){
			e.printStackTrace();
		}
	}
	
	
	private void mostrarConsole(String string){
		System.out.println(sdf.format(new Date()) + string);
	}
	
	public static void main(String[] args) {
		new Cliente();
	}
}
