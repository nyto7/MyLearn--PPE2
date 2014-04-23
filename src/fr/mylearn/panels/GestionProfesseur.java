package fr.mylearn.panels;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GestionProfesseur extends JPanel implements ActionListener
{
	
	//LES BOUTONS
	private JButton Ajouter = new JButton("Ajouter");
	private JButton Rechercher = new JButton("Rechercher");  // boutons validation de recherche par noms
	private JButton Envoyer = new JButton("Envoyer");  // boutons de validation de recherche par critère
	
	//LISTE D'OPTION
	private JComboBox Classe;   // liste d'option pour choisir la classe
	private JComboBox Matiere;  // liste d'option pour choisir la section
	
	//ZONE DE TEXTE
	private JTextField FormRecherche = new JTextField();
	
	//LEGENDE 
	private JLabel TitreAjouter = new JLabel("Ajouter un professeur:");
	private JLabel TitreRechNom = new JLabel("Rechercher par un nom:");
	private JLabel TitreRechCrit = new JLabel("Rechercher par un  ou plusieurs critères:");
	
	public GestionProfesseur()
	{
		//Initialisation des listes d'option JComboBox
	    String[] tabClasse = {"SIO1LM", "SIO2LM", "SIO1JV", "SIO2JV"};
	    Classe = new JComboBox(tabClasse);
	    String[] tabMatiere = {"Mathématique", "Français", "Droit", "Economie"};
	    Matiere = new JComboBox(tabMatiere);
		
		
		//this.setSize(500,500);
	    this.setLayout(new GridLayout(8,1));
		this.setBounds(100, 140, 500, 360);

		JPanel rechercher = new JPanel(new GridLayout(1,2));
		JPanel critere = new JPanel(new GridLayout(1,2));
		
		
		this.add(TitreAjouter);
		TitreAjouter.setHorizontalAlignment(JLabel.CENTER);
		this.add(Ajouter);
		
		
		this.add(TitreRechNom);
		TitreRechNom.setHorizontalAlignment(JLabel.CENTER);
		rechercher.add(FormRecherche);
		rechercher.add(Rechercher);
		this.add(rechercher);
		
		
		this.add(TitreRechCrit);
		TitreRechCrit.setHorizontalAlignment(JLabel.CENTER);
		critere.add(Classe);
		critere.add(Matiere);
		this.add(critere);
		
		
		this.add(Envoyer);
		
		
		
		Ajouter.addActionListener(this);
		Rechercher.addActionListener(this);
		Envoyer.addActionListener(this);
		
		this.setVisible(true);	
	}
	
	
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==Ajouter)
		{
			new AjoutProfesseur();
			
		}
		else if(e.getSource()==Rechercher) //par formulaire de recherche
		{
			new AfficherProfesseur();
		}
		if(e.getSource()==Envoyer) //par critère
		{
			new AfficherProfesseur();
		}
		
	}
}
