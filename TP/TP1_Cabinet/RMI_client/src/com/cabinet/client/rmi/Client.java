package com.cabinet.client.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.cabinet.common.rmi.Animal;


public class Client {
	private Client() {}
	
	public static void main(String[] args) {
		String host = (args.length < 1)? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			Animal animal = (Animal) registry.lookup("Animal");

			System.out.println(animal);

			String nom = animal.afficherNomAnimal();			
			String race = animal.afficherRaceEspese();

			System.out.println("Nom: " + nom);
			System.out.println("Race: " + race);


			animal.crier();

		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}
