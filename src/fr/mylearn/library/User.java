package fr.mylearn.library;

public class User 
{
	private int id_u;
	private String username;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private Boolean active;
	
	
	//CONSTRUCTEURS
	
	public User(int id_u, String username, String nom, String prenom, String email, String password, Boolean active)
	{
		this.id_u=id_u;
		this.username=username;
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
		this.password=password;
		this.active=active;
	}
	//GETTERS
	public int getId_u() {return id_u;}
	public String getUsername() {return username;}
	public String getNom() {return nom;}
	public String getPrenom() {return prenom;}	
	public String getEmail() {return email;}
	public String getPassword() {return password;}	
	public Boolean getActive() {return active;}	
	
	//SETTERS
	public void setId_u(int id_u) 
	{
		this.id_u = id_u;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public void setNom(String nom) 
	{
		this.nom = nom;
	}

	public void setPrenom(String prenom) 
	{
		this.prenom = prenom;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public void setActive(Boolean active) 
	{
		this.active = active;
	}
}
