package fr.mylearn.panels;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.mylearn.core.MenuGeneral;


public class Accueil extends JPanel implements ActionListener
{
	
	private JLabel logoEleve = new JLabel();
	private JLabel logoProfesseur = new JLabel();

	private JButton Eleve;
	private JButton Professeur;
	
	private JLabel eleve;
	private JLabel professeur;
	
	public Accueil()
	{
		this.setLayout(new GridLayout(1,2));
		this.setBounds(100, 150, 500, 360);
		
		
		
		JPanel PanelAccueil = new JPanel(); //CREATION D'UN PANEL POUR LA POSITION DES BOUTONS   
		
		ImageIcon ImageEleve = new ImageIcon("src/fr/mylearn/panels/eleve.png");
		Eleve = new JButton(ImageEleve);
		ImageIcon ImageProfesseur = new ImageIcon("src/fr/mylearn/panels/professeur.png");
		Professeur = new JButton(ImageProfesseur);
		//this.setBackground(Color.BLUE);
		PanelAccueil.setSize(500,500);
		
		PanelAccueil.add(Eleve);
		PanelAccueil.add(Professeur);
		
		this.add(PanelAccueil);
		
		Eleve.addActionListener(this);
		Professeur.addActionListener(this);
		
		this.setVisible(true);		
	}

	public void actionPerformed(ActionEvent e) 
	{
		MenuGeneral.getMonPanel().setVisible(false);
		MenuGeneral.getMonPanel().removeAll();	
		
		if (e.getSource()==Eleve)
		{
			MenuGeneral.setMonPanel( new GestionEleve());
			MenuGeneral.getMonPanel().setVisible(true);
			this.removeAll();
			this.add(MenuGeneral.getMonPanel());
			this.setVisible(true);
			
		}
		else if (e.getSource()==Professeur)
		{
			//MenuGeneral.getMonPanel().setVisible(false);
			//MenuGeneral.getMonPanel().removeAll();
			MenuGeneral.setMonPanel( new GestionProfesseur());
			MenuGeneral.getMonPanel().setVisible(true);
			this.removeAll();
			this.add(MenuGeneral.getMonPanel());
			this.setVisible(true);
		}
	}
}
