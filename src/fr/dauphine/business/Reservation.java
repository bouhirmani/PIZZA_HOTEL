package fr.dauphine.business;


import fr.dauphine.models.Chambre;
import fr.dauphine.models.Client;
import fr.dauphine.models.Hotel;

public class Reservation {
	
	private Hotel hotel;
	private Client client;
	private String date;
	private int nbJour;
	private Chambre chambre;
	
	public Reservation(Hotel hotel, Client client, String date, int nbJour,
			Chambre chambre) {
		super();
		this.hotel = hotel;
		this.client = client;
		this.date = date;
		this.nbJour = nbJour;
		this.chambre = chambre;
	}
	
	public Reservation() {
		super();
	}

	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNbJour() {
		return nbJour;
	}
	public void setNbJour(int nbJour) {
		this.nbJour = nbJour;
	}
	public Chambre getChambre() {
		return chambre;
	}
	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}
	
	
}
