package fr.dauphine.models;

import java.util.List;

public class Hotel
{
    
    private String nom;
    private String adresse;
    private List<Client>listClients;
    private List<Chambre>listChambre;
    
    
	public Hotel(String nom, String adresse, List<Client> listClients,
			List<Chambre> listChambre) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.listClients = listClients;
		this.listChambre = listChambre;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public List<Client> getListClients() {
		return listClients;
	}
	public void setListClients(List<Client> listClients) {
		this.listClients = listClients;
	}
	public List<Chambre> getListChambre() {
		return listChambre;
	}
	public void setListChambre(List<Chambre> listChambre) {
		this.listChambre = listChambre;
	}
    
    
    
    
	
}