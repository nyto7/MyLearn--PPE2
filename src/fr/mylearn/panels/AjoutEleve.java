package fr.mylearn.panels;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AjoutEleve extends JFrame implements ActionListener
{
		//LEGENDE 
		private JLabel TitreNom = new JLabel("Nom:");
		private JLabel TitrePrenom = new JLabel("Prénom:");
		private JLabel TitreEmail = new JLabel("Email:");
		private JLabel TitreDateNaissance = new JLabel("Date de naissance:");
		
		//ZONE DE TEXTE 
		private TextField Nom = new TextField();
		private TextField Prenom = new TextField();
		private TextField Email = new TextField();
		private TextField DateNaissance = new TextField(); 
		
		//LISTE D'OPTION
		private JComboBox Classe;   // liste d'option pour choisir la classe
		private JComboBox Section;  // liste d'option pour choisir la section
		
		//LES BOUTONS
		private JButton Enregistrer = new JButton("Enregistrer");
		private JButton Annuler = new JButton("Annuler");
		
		public AjoutEleve()
		{
			//Initialisation des listes d'option JComboBox
		    String[] tabSection = {"Bac pro SEN", "BTS SIO", "BTS SN", "DEESWEB"};
		    Section = new JComboBox(tabSection);
		    String[] tabClasse = {"SIO1LM", "SIO2LM", "SIO1JV", "SIO2JV"};
		    Classe = new JComboBox(tabClasse);
		    
			this.setLayout(null);
			this.setVisible(false);
			
			this.setBounds(10, 10, 500, 500); //TAILLE DE LA FENETRE 
			
			GridLayout gl = new GridLayout(6,2);
			gl.setHgap(10);
			gl.setVgap(10);
			
			JPanel PanelAjoutEleve = new JPanel(gl);
			PanelAjoutEleve.setBounds(50, 40, 400, 360); //TAILLE DE LA ZONE DE TRAVAIL
			
			
			PanelAjoutEleve.add(TitreNom);
			TitreNom.setHorizontalAlignment(JLabel.CENTER);
			PanelAjoutEleve.add(Nom);
			
			PanelAjoutEleve.add(TitrePrenom);
			TitrePrenom.setHorizontalAlignment(JLabel.CENTER);
			PanelAjoutEleve.add(Prenom);
			
			PanelAjoutEleve.add(TitreEmail);
			TitreEmail.setHorizontalAlignment(JLabel.CENTER);
			PanelAjoutEleve.add(Email);
			
			PanelAjoutEleve.add(TitreDateNaissance);
			TitreDateNaissance.setHorizontalAlignment(JLabel.CENTER);
			PanelAjoutEleve.add(DateNaissance);
			
			PanelAjoutEleve.add(Section);
			PanelAjoutEleve.add(Classe);
			
			PanelAjoutEleve.add(Enregistrer);
			PanelAjoutEleve.add(Annuler);
			
			this.add(PanelAjoutEleve);
			
			Enregistrer.addActionListener(this);
			Annuler.addActionListener(this);
			
			this.setVisible(true);

		}
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub
			
		}
		public static void main(String[] args)
		{
			//AjoutEleve unAjoutEleve = new AjoutEleve();
		}
}
