package fr.mylearn.library;
import java.util.Date;


public class Eleve extends User
{
	private Date dateNaissance;
	
	
	//CONSTRUCTEUR
	
	public Eleve(Date dateNaissance,int id_u, String username, String nom, String prenom, String email, String password, Boolean active)
	{
		super(id_u, username, nom, prenom, email, password, active);
		this.dateNaissance=dateNaissance;
	}
	//GETTERS
	public Date getDateNaissance() {return dateNaissance;}
	
	//SETTERS
	public void setDateNaissance(Date dateNaissance) 
	{
		this.dateNaissance = dateNaissance;
	}
	
	
}
