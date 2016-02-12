package fr.dauphine.tests;


import java.util.Date;

import fr.dauphine.business.Reservation;
import fr.dauphine.models.Client;
import fr.dauphine.models.ClientTortue;
import fr.dauphine.models.Hotel;
import fr.dauphine.models.Pizza;
import fr.dauphine.models.Pizza.TAILLE;

public class HotelPizzaTests {
	
	
	public static void main(String[] args) {
		
		Hotel hotel1 = new Hotel("MERCURE", "2B RUE DE LA PEROUSE");
		
		Client client1 = new Client("BOUHIRMANI", "MOHAMMED", "3VB RUE SAINT MICHEAL",
				"m.bouhirmani@gmail.com", "0663915291");
		
		ClientTortue client2 = new ClientTortue("MARGHAD", "BADER", "3VB RUE SAINT MICHEAL",
				"bader.marghad@gmail.com", "0632638585");
		
		
		Reservation reservation = new Reservation();
		Date date = new Date();
		reservation.reserver(hotel1, client1, date.toString(), 3, hotel1.getListChambre().get(1));
		
		
		client2.CommanderPizza(new Pizza("Fruit De Mer",30,TAILLE.GRANDE));
		client2.CommanderPizza(new Pizza("4 Fromage",20,TAILLE.PETITE));

		System.out.println(reservation.toString());
	}
}



