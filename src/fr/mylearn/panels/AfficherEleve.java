package fr.mylearn.panels;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class AfficherEleve extends JFrame implements ActionListener
{
	private JTable tableau; 
	private JComboBox Section;  // liste d'option pour choisir la section
	private JComboBox Classe;   // liste d'option pour choisir la classe
	private JButton Enregistrer = new JButton("Enregistrer");
	private JButton Annuler = new JButton("Annuler");
	
	public AfficherEleve()
	{
		this.setTitle("Eléve");
		this.setSize(700,300); 
		this.tabAffichage();
		this.setVisible(true);
	}
	
	public void tabAffichage()
	{
		//LES LISTE D'OPTION DU TABLEAU 
		String[] tabSection = {"Bac pro SEN", "BTS SIO", "BTS SN", "DEESWEB"};
	    JComboBox Section = new JComboBox(tabSection);
	    String[] tabClasse = {"SIO1LM", "SIO2LM", "SIO1JV", "SIO2JV"};
	    JComboBox Classe = new JComboBox(tabClasse);
		
		//LES DONNÉES DU TABLEAU
	    Object[][] data = 
	    {
		      {"nyto","Delgorge", "Tony", "cours.tony@gmail.com","16/12/1991",tabSection[0],tabClasse[0]},
		      {"adamette","Menebhi", "Adam", "menebhi.adam@gmail.com","30/07/1989",tabSection[0],tabClasse[0]},
		      {"popocheat","Popowicz", "Mikael", "popowicz.mikael@gmail.com","16/12/1989",tabSection[0],tabClasse[0]},
		      {"soubrannette","Soubranne", "Paul", "soubranne.paul@gmail.com","10/11/1992",tabSection[0],tabClasse[0]},
	    };
	    
	  
		String  title[] = {"Surnom","Nom", "Prénom", "Email","Date de naissance","Section","Classe"};  //LES TITRES DES COLONNES
	    
		
		ZModel zModel = new ZModel(data, title); //CLASSE ABSTRAIT QUI GERE LE DESIGN DU TABLEAU (ELLE CE TROUVE EN BAS)

	    this.tableau = new JTable(zModel);
	    this.tableau.setRowHeight(20);
	    
	    //LES BOUTONS 
		JPanel pan = new JPanel();
		pan.add(Enregistrer);
		pan.add(Annuler);

		
		//JTable tableau = new JTable(data, title);
	    //Nous ajoutons notre tableau à notre contentPane dans un scroll
	    //Sinon les titres des colonnes ne s'afficheront pas !
	   this.tableau.getColumn("Section").setCellEditor(new  DefaultCellEditor(Section));
	   this.tableau.getColumn("Classe").setCellEditor(new  DefaultCellEditor(Classe));
	   this.getContentPane().add(new JScrollPane(tableau));
	   this.getContentPane().add(pan, BorderLayout.SOUTH);
	}
	class ZModel extends AbstractTableModel
	{
	    private Object[][] data;
	    private String[] title;

	    //Constructeur
	    public ZModel(Object[][] data, String[] title)
	    {
	      this.data = data;
	      this.title = title;
	    }

	    public String getColumnName(int col) { return this.title[col]; }//Retourne le titre de la colonne à l'indice spécifié
	    public int getColumnCount() { return this.title.length; } //Retourne le nombre de colonnes
	    public int getRowCount() { return this.data.length; }//Retourne le nombre de lignes
	    public Object getValueAt(int row, int col) { return this.data[row][col]; }//Retourne la valeur à l'emplacement spécifié
	    public Class getColumnClass(int col)//Retourne la classe de la donnée de la colonne
	    {
	      //On retourne le type de la cellule à la colonne demandée
	      //On se moque de la ligne puisque les types de données sont les mêmes quelle que soit la ligne
	      //On choisit donc la première ligne
	      return this.data[0][col].getClass();
	    }

	    public boolean isCellEditable(int row, int col)
	    {
	      return true;
	    }
	}
	
	public static void main(String[] args)
	{
		//AfficherEleve affE = new AfficherEleve();
	}
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
}
