package fr.mylearn.library;


public class Administrateur extends User
{
	private String poste;


	public Administrateur(String poste, int id_u, String username, String nom, String prenom, String email, String password, Boolean active)
	{
		super(id_u, username, nom, prenom, email, password, active);
		this.setPoste(poste);
	}

	public String getPoste() {
		return poste;
	}


	public void setPoste(String poste) {
		this.poste = poste;
	}
	
	
}