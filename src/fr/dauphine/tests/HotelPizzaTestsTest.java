package fr.dauphine.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.dauphine.business.Reservation;
import fr.dauphine.models.Client;
import fr.dauphine.models.ClientTortue;
import fr.dauphine.models.Hotel;
import fr.dauphine.models.Pizza;
import fr.dauphine.models.Pizza.TAILLE;

public class HotelPizzaTestsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public final void testHotel() {
		Reservation reservation = test();
		assertEquals("true","MERCURE",reservation.getHotel().getNom());
		assertEquals("true","2B RUE DE LA PEROUSE",reservation.getHotel().getAdresse());
		assertTrue(reservation.getHotel().getListClients().contains(reservation.getClient()));
	}
	
	
	@Test
	public final void testClientTortue() {
		Reservation reservation = test();
		assertEquals("true","MARGHAD",reservation.getClient().getNom());
		assertEquals("true","BADER",reservation.getClient().getPrenom());
		assertEquals("true","3VB RUE SAINT MICHEAL",reservation.getClient().getAdresse());
		assertEquals("true","bader.marghad@gmail.com",reservation.getClient().getEmail());
		assertEquals("true","0632638585",reservation.getClient().getTel());

		assertEquals("true","MARGHAD",((ClientTortue)reservation.getClient()).getTortue().getNom());		
	
	}
	
	
	@Test
	public final void testPizza() {
		Reservation reservation = test();
		assertTrue(((ClientTortue)reservation.getClient()).getTortue()
				.getListPizza().get(0).getNom().equals("Fruit De Mer"));
		
		assertTrue(((ClientTortue)reservation.getClient()).getTortue()
				.getListPizza().get(0).getPrix()==30);
		
		assertTrue(((ClientTortue)reservation.getClient()).getTortue()
				.getListPizza().get(0).getType().equals(TAILLE.GRANDE));
	}
	
	
	
	public Reservation test(){
		
		Hotel hotel1 = new Hotel("MERCURE", "2B RUE DE LA PEROUSE");
		
		ClientTortue client2 = new ClientTortue("MARGHAD", "BADER", "3VB RUE SAINT MICHEAL",
				"bader.marghad@gmail.com", "0632638585");
		
		
		Reservation reservation = new Reservation();
		Date date = new Date();
		
		reservation.reserver(hotel1, client2, date.toString(), 3, hotel1.getListChambre().get(1));
		
		client2.CommanderPizza(new Pizza("Fruit De Mer",30,TAILLE.GRANDE));

		
		return reservation;
	}
	
	
}
