package br.jhoestevam.p02.comum;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ImplServidor extends Remote {
	
	public static final String SERVICE = "RMI";
	
	public String saudar(String nome) throws RemoteException;
	
	public int calcularIdade(int idade) throws RemoteException;
}
