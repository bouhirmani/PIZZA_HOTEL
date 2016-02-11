package fr.dauphine.tests;


import fr.dauphine.business.ClientTortue;
import fr.dauphine.business.Reservation;
import fr.dauphine.models.Client;
import fr.dauphine.models.Hotel;
import fr.dauphine.models.Pizza;
import fr.dauphine.models.Pizza.TAILLE;
import fr.dauphine.models.TortueNinja;

public class HotelPizzaTests {
	
	public Reservation reserverHotel(){
		
		Hotel hotel1 = new Hotel("MERCURE", "2B RUE DE LA PEROUSE");
		
		Client client1 = new Client("BOUHIRMANI", "MOHAMMED", "3VB RUE SAINT MICHEAL",
				"m.bouhirmani@gmail.com", "0663915291");
		
		ClientTortue client2 = new ClientTortue("MARGHAD", "BADER", "3VB RUE SAINT MICHEAL",
				"bader.marghad@gmail.com", "0632638585");
		
		
		Reservation reservation = new Reservation();
		reservation.reserver(hotel1, client1, "11/02/2016", 3, hotel1.getListChambre().get(1));
		
		
		client2.CommanderPizza(new TortueNinja(client2.getNom()),new Pizza("Fruit De Mer",30,TAILLE.GRANDE));
		
		return reservation;
	}
}



