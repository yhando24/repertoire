package fr.youcef.javase;

import java.util.List;

import fr.youcef.beans.Adresse;
import fr.youcef.beans.Personne;
import fr.youcef.beans.Repertoire;
import fr.youcef.utils.Interface;

public class Principale implements Interface{

	
		// faire comme prof
		
		
		// sa peut importe la maniere de faire
		public static void main(String[] args) {
//			Repertoire repPrincipal = new Repertoire("Répertoire principal");
//			
//			 Personne personne;
//			 Adresse adresse;
//			 
//			 for(int i =0; i< 2; i++) {
//				 
//					 adresse = new Adresse(CONTACTS [i][0][0], CONTACTS [i][0][1],CONTACTS [i][0][2] );
//					 personne = new Personne(CONTACTS [i][1][0], CONTACTS [i][1][1],CONTACTS [i][1][2], adresse );
//					 repPrincipal.addPersonne(personne);
//				 
//			 }
			
		 
		 
		 
		// personne = new Personne(dsddsfs,dfsdsfs,dsfdsfd,adresse);
		
		//repPrincipal.addPersonne(personne);
		 
		 // une facon de faire
//		final String [][] monTableau = {
//				{"199 Boulevard Davout","1 Rue des Charognard Mortier"},
//				{"34070","75020"},
//				{"Montpellier","Paris"},
//				{"Handoura","Mangata"},
//				{"Youcef","Michel"},
//				{"0615155418","692892929"},
//			};
//			
//	
//		
//		for (int i = 0; i < monTableau[0].length ; i++) {
//			adresse = new Adresse(monTableau[0][i], monTableau[1][i], monTableau[2][i]);
//			personne  = new Personne(monTableau[3][i], monTableau[4][i], monTableau[4][i], adresse);
//			repPrincipal.addPersonne(personne);
//		
//		}
//		
//		
		 
		 //AFFICHAGE 
//		 List<Personne> list = repPrincipal.getListePersonnes();
//		 
//		 if(!list.isEmpty()) {
//			 System.out.println(" **** "+repPrincipal.getNom() +" **** ");
//			 System.out.println();
//		 
//			for(int i = 0; i<repPrincipal.getListePersonnes().size(); i++) {
//				personne = repPrincipal.getListePersonnes().get(i);
//				System.out.println("Nom : " + personne.getNom() + " " + personne.getPrenom());
//				System.out.print("adresse : " + personne.getAdresse().getVoie());
//				System.out.print( personne.getAdresse().getCp());
//				System.out.println(" " + personne.getAdresse().getVille());
//				System.out.println();
//			}
//		 }
		 // fin une facon de faire
		 
		 // celle du prof
		 
	
		 
		 
		 
		
		
		//Creation des contacts
//		Adresse maison = new Adresse("199 Boulevard Davout", "34070", "Montpellier");
//		Personne youcef = new Personne("Handoura", "Youcef", "0614142221", maison);
//		
//		Adresse travail = new Adresse("1 Rue des Charognard Mortier", "75020", "Paris");
//		Personne michel = new Personne("Mangata", "Michel", "0748289841", travail);
//		
//		//ajout des personnes dans le repertoire
//		repPrincipal.addPersonne(youcef);
//		repPrincipal.addPersonne(michel);
//		
//		System.out.println(" **** "+repPrincipal.getNom() +" **** ");
//		System.out.println();
//		// affichage du repertoire
//		for(Personne p : repPrincipal.getListePersonnes())
//		{
//			System.out.println("> " + p.getNom() + " "+ p.getPrenom());
//			adresse = personne.getAdresse();
//			System.out.print("\t" + adresse.getVoie());
//			System.out.print(" " + adresse.getCp());
//			System.out.println(" " + adresse.getVille());
//			System.out.println();
//		}
		
	}
	
}
