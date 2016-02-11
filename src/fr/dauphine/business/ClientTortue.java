package fr.dauphine.business;

import fr.dauphine.models.Client;
import fr.dauphine.models.Pizza;
import fr.dauphine.models.TortueNinja;

public class ClientTortue extends Client{

	private TortueNinja tortue;
	private int nbPizza;
	public ClientTortue() {
		super();
	}

	public ClientTortue(String nom, String prenom, String adresse,
			String email, String tel) {
		super(nom, prenom, adresse, email, tel);
	}
	
	
	public void CommanderPizza(TortueNinja tortue,Pizza pizza){
		tortue.addA(pizza);
	}
	
	
}
