package fr.mylearn.panels;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class GestionEleve extends JPanel implements ActionListener
{
	
		//LES BOUTONS
		private JButton Rechercher = new JButton("Rechercher");  // boutons validation de recherche par noms
		private JButton Ajouter = new JButton("Ajouter");
		private JButton Envoyer = new JButton("Envoyer");  // boutons de validation de recherche par critère
		
		//LISTE D'OPTION
		private JComboBox Session;  // liste d'option  pour choisir la session
		private JComboBox Section;  // liste d'option pour choisir la section
		private JComboBox Classe;   // liste d'option pour choisir la classe

		
		//ZONE DE TEXTE
		private JTextField FormRecherche = new JTextField();
		
		//LEGENDE 
		private JLabel TitreAjouter = new JLabel("Ajouter un élève:");
		private JLabel TitreRechNom = new JLabel("Rechercher par un nom:");
		private JLabel TitreRechCrit = new JLabel("Rechercher par un  ou plusieurs critères:");
		

		public GestionEleve()
		{

			//Initialisation des listes d'option JComboBox
		    String[] tabSession = {"2010 - 2011", "2011 - 2012", "2012 - 2013", "2013 - 2014"};
		    Session = new JComboBox(tabSession);
		    String[] tabSection = {"Bac pro SEN", "BTS SIO", "BTS SN", "DEESWEB"};
		    Section = new JComboBox(tabSection);
		    String[] tabClasse = {"SIO1LM", "SIO2LM", "SIO1JV", "SIO2JV"};
		    Classe = new JComboBox(tabClasse);
			
		   // this.setBackground(Color.BLUE);
		    //this.setSize(500,500);
		    this.setLayout(new GridLayout(8,1));
			this.setBounds(100, 140, 500, 360);

			JPanel rechercher = new JPanel(new GridLayout(1,2));
			JPanel critere = new JPanel(new GridLayout(1,3));
			
			
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
			critere.add(Session);
			critere.add(Section);
			critere.add(Classe);
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
				AjoutEleve unAjoutEleve = new AjoutEleve();	
			}
			else if(e.getSource()==Rechercher) //par formulaire de recherche
			{
				AfficherEleve unAfficherEleve = new AfficherEleve();
			}
			if(e.getSource()==Envoyer) //par critère
			{
				AfficherEleve unAfficherEleve = new AfficherEleve();
			}

		}
}
