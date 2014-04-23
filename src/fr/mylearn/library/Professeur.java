package fr.mylearn.library;


public class Professeur extends User
{
	private int matiere;
	
	//CONSTRUCTEURS
	
	public Professeur(int id_u, String username, String nom, String prenom, String email, String password, Boolean active, int matiere)
	{
		super(id_u, username, nom, prenom, email, password, active);
		this.matiere=matiere;
	}
	//GETTERS
	public int getMatiere() {return matiere;}
	
	//SETTERS
	public void setMatiere(int matiere) 
	{
		this.matiere = matiere;
	}
}
