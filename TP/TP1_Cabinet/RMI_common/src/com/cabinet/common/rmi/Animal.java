package com.cabinet.common.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Animal extends Remote {
	/* METHODS */
	String afficherNomAnimal() throws RemoteException;
    String afficherRaceEspese() throws RemoteException;
	void crier()  throws RemoteException;
}
