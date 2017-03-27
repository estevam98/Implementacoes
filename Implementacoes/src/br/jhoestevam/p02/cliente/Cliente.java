package br.jhoestevam.p02.cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.jhoestevam.p02.comum.ImplServidor;

public class Cliente {
	
	public Cliente(){
		
		try {
			
			ImplServidor servico = (ImplServidor) Naming.lookup("rmi://localhost:1818/RMI");
			
			String retornoNome = servico.saudar("jhoestevam");
			int retornoIdade = servico.calcularIdade(1998);
			System.out.println(retornoNome);
			System.out.println(retornoIdade);
			
		} catch (RemoteException e) {
			System.err.println("FALHA NA CONEXÃO COM O SERVIDOR\n" +"VERIFICAR IP OU PORTA");
			e.printStackTrace();
		} catch (MalformedURLException e) {
			System.err.println("VERIFICAR URL PARA A CONEXÃO COM O SERVIDOR");
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		} 
	}
	
	
	public static void main(String[] args) {
		new Cliente();
	}
}
