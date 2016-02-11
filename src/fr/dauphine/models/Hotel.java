package fr.dauphine.models;

import java.util.ArrayList;
import java.util.List;

import fr.dauphine.models.Chambre.TYPECHAMBRE;

public class Hotel
{
    
    private String nom;
    private String adresse;
    private List<Client>listClients;
    private List<Chambre>listChambre;
    
    
	public List<Chambre> getListChambre() {
		return listChambre;
	}
	public Hotel(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.listClients = new ArrayList<>();
		
		//***Chambre init*****
		Chambre ch1 = new Chambre(120, 1, 2000, TYPECHAMBRE.TRADITION);
		Chambre ch2 = new Chambre(121, 1, 3000, TYPECHAMBRE.HARMONY);
		Chambre ch3 = new Chambre(122, 1, 4000, TYPECHAMBRE.FAMILIALE);
		Chambre ch4 = new Chambre(123, 1, 5000, TYPECHAMBRE.TRIPLE);
		Chambre ch5 = new Chambre(124, 1, 8000, TYPECHAMBRE.ROYAL);
		Chambre ch6 = new Chambre(125, 2, 3000, TYPECHAMBRE.FAMILIALE);
		Chambre ch7 = new Chambre(126, 2, 3000, TYPECHAMBRE.TRADITION);
		Chambre ch8 = new Chambre(127, 2, 5000, TYPECHAMBRE.TRIPLE);
		Chambre ch9 = new Chambre(128, 2, 2000, TYPECHAMBRE.HARMONY);
		Chambre ch10 = new Chambre(129,2, 9000, TYPECHAMBRE.ROYAL);
			
		listChambre = new ArrayList<>();
		listChambre.add(ch1);
		listChambre.add(ch2);
		listChambre.add(ch3);
		listChambre.add(ch4);
		listChambre.add(ch5);
		listChambre.add(ch6);
		listChambre.add(ch7);
		listChambre.add(ch8);
		listChambre.add(ch9);
		listChambre.add(ch10);
		//****end chambre init****
	
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
	public void addClient(Client client){
		listClients.add(client);
	}
}