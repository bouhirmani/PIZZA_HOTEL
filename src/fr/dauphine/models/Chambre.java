package fr.dauphine.models;

public class Chambre {

	public enum TYPECHAMBRE{
		HARMONY,TRADITION,TRIPLE,FAMILIALE, ROYAL
	}
	
	private int numero;
	private int etage;
	private float prix;
	private TYPECHAMBRE categorie;
	
	
	public Chambre(int numero, int etage, float prix, TYPECHAMBRE categorie) {
		super();
		this.numero = numero;
		this.etage = etage;
		this.prix = prix;
		this.categorie = categorie;
	}
	
	public Chambre() {
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getEtage() {
		return etage;
	}
	public void setEtage(int etage) {
		this.etage = etage;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public TYPECHAMBRE getCategorie() {
		return categorie;
	}
	public void setCategorie(TYPECHAMBRE categorie) {
		this.categorie = categorie;
	}
	

}
