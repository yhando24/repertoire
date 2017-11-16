package fr.youcef.beans;

import fr.youcef.utils.Groupe;

public class Personne {
	private boolean favori;
	private String nom;
	private String prenom;
	private String tel;
	private Adresse adresse;
	private Groupe groupe;
	
	// Constructors
	
	public Personne(){
		groupe = Groupe.CONTACT;
	}
	public Personne(String nom, String prenom, String tel, Adresse adresse){
		this();
		setNom(nom);
		setPrenom(prenom);
		setTel(tel);
		setAdresse(adresse);	
	}
	
	// Getter/setter
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public boolean isFavori() {
		return favori;
	}
	public void setFavori(boolean favori) {
		this.favori = favori;
	}
	public Groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	
}
