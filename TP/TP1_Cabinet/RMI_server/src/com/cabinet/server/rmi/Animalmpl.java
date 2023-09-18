package com.cabinet.server.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.cabinet.common.rmi.Animal;

public class Animalmpl extends UnicastRemoteObject implements Animal {

    protected String nom;
    protected String maitre;
    protected String espece;
    protected String race;

	protected String cri;

	/* CONSTRUCTOR */	
	protected Animalmpl(String nom, String maitre, String espece, String race, String cri) throws RemoteException {
		this.nom = nom;
		this.maitre = maitre;
		this.espece = espece;
		this.race = race;
		this.cri = cri;
	}

	/* METHODS */
	@Override
	public String afficherNomAnimal() throws RemoteException {
		return "L'animal " + this.nom + " appartient à " + this.maitre;
	}

	@Override
	public String afficherRaceEspese() throws RemoteException {
		return "L'animal " + this.nom + " est un " + this.espece + " de type " + this.race; 
	}

	@Override
	public void crier() throws RemoteException {
		System.out.println(this.cri);
	}
}
