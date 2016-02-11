package fr.dauphine.business;

import fr.dauphine.models.Chambre;
import fr.dauphine.models.Client;
import fr.dauphine.models.Hotel;

public interface ReservationInterface {

	
	public void reserver(Hotel hotel, Client client, String date, int nbJour,
			Chambre chambre);
	
	public void reserver(Hotel hotel, ClientTortue client, String date, int nbJour,
			Chambre chambre);
}
