package fr.mylearn.core;

import java.sql.Statement;

import fr.mylearn.library.BDD;

public class TraitementProfesseur 
{
	private BDD maBDD;
	
	public void ListeMatiere()
	{
		this.maBDD = new BDD("localhost", "mylearn", "root", "root");
		this.maBDD.seConnecter();
		
		//Statement state = this.maBDD.createStatement();
	}
}
