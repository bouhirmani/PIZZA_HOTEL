package fr.dauphine.models;


public class Pizza
{
    private  String nom;
    private int prix;
    public enum TAILLE{
    	PETITE,MOYENNE,GRANDE
    }
    private TAILLE type;
	
    
    public Pizza(String nom, int prix, TAILLE type) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.type = type;
	}

    
    public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public TAILLE getType() {
		return type;
	}
	public void setType(TAILLE type) {
		this.type = type;
	}
    
    
   
    
   
}
