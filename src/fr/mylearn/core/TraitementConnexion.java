package fr.mylearn.core;

import fr.mylearn.library.BDD;

public class TraitementConnexion 
{
	private BDD maBDD;
	
	public void ConnexionAdmin()
	{
		this.maBDD = new BDD("localhost", "mylearn", "root", "root");
		this.maBDD.seConnecter();
	}
}
