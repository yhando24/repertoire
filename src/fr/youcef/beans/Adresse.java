package fr.youcef.beans;

public class Adresse {
	private String voie;
	private String cp;
	private String ville;
	
	//Constructors
	
	public Adresse() {}
	
	public Adresse(String voie, String cp, String ville){
		setVoie(voie);    
		setCp(cp);			/// parce que si on met this.cp = cp, on passe pas par les setteurs et les if dedans
		setVille(ville);	
	}
	
	
	// Getter/setter
	
	public String getVoie() {
		return voie;
	}
	public void setVoie(String voie) {
		this.voie = voie;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		if(cp.length() > 5) {
			System.out.println("le code postal n'est pas valide");
			return;
		}
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
}
