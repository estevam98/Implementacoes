package jhoestevam.p01.comum;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicoRMI extends Remote{

	public static final String SERVICE = "service";
	
	public String saudar(String nome) throws RemoteException;
}
