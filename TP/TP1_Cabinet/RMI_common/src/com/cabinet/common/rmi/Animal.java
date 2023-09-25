package com.cabinet.common.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Animal extends Remote {
	/* METHODS */
	String afficherNomAnimal() throws RemoteException;

	String afficherRace() throws RemoteException;

	void crier() throws RemoteException;

	String afficherDossierDeSuivi() throws RemoteException;

	void modifierDossierDeSuivi(String contenue) throws RemoteException;

	Espece getEspece() throws RemoteException;

	void nommer() throws RemoteException;

}
