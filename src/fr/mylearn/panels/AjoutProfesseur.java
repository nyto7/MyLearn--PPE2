package fr.mylearn.panels;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AjoutProfesseur extends JFrame implements ActionListener
{
	//LEGENDE 
	private JLabel TitreNom = new JLabel("Nom");
	private JLabel TitrePrenom = new JLabel("Prénom");
	private JLabel TitreEmail= new JLabel("Email");
	
	//ZONE DE TEXTE 
	private TextField Nom = new TextField();
	private TextField Prenom = new TextField();
	private TextField Email = new TextField();
	
	//LISTE D'OPTION
	private JComboBox Matiere;   // liste d'option pour choisir la matière
	private JComboBox Classe;   // liste d'option pour choisir la classe
	
	//LES BOUTONS
	private JButton Enregistrer = new JButton("Enregistrer");
	private JButton Annuler = new JButton("Annuler");
	
	public AjoutProfesseur()
	{
		//Initialisation des listes d'option JComboBox
	    String[] tabClasse = {"SIO1LM", "SIO2LM", "SIO1JV", "SIO2JV"};
	    Classe = new JComboBox(tabClasse);
	    String[] tabMatiere = {"Mathématique", "Français", "Droit", "Economie"};
	    Matiere = new JComboBox(tabMatiere);
	    
	    this.setLayout(null);
		this.setVisible(false);
		
		
		this.setBounds(10, 10, 500, 500); //TAILLE DE LA FENETRE 
		
		GridLayout gl = new GridLayout(5,2);
		gl.setHgap(10);
		gl.setVgap(10);
		
		JPanel PanelAjoutProfesseur = new JPanel(gl);
		PanelAjoutProfesseur.setBounds(50, 40, 400, 260); //TAILLE DE LA ZONE DE TRAVAIL
		
		PanelAjoutProfesseur.add(TitreNom);
		TitreNom.setHorizontalAlignment(JLabel.CENTER);
		PanelAjoutProfesseur.add(Nom);
		
		PanelAjoutProfesseur.add(TitrePrenom);
		TitrePrenom.setHorizontalAlignment(JLabel.CENTER);
		PanelAjoutProfesseur.add(Prenom);
		
		PanelAjoutProfesseur.add(TitreEmail);
		TitreEmail.setHorizontalAlignment(JLabel.CENTER);
		PanelAjoutProfesseur.add(Email);
		
		PanelAjoutProfesseur.add(Classe);
		PanelAjoutProfesseur.add(Matiere);
		
		PanelAjoutProfesseur.add(Enregistrer);
		PanelAjoutProfesseur.add(Annuler);
		
		this.add(PanelAjoutProfesseur);
		
		Enregistrer.addActionListener(this);
		Annuler.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		
	}
}
