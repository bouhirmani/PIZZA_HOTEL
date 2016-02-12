package fr.dauphine.models;


public class ClientTortue extends Client{

	private TortueNinja tortue;
	
	public ClientTortue() {
		super();
	}

	public TortueNinja getTortue() {
		return tortue;
	}

	public void setTortue(TortueNinja tortue) {
		this.tortue = tortue;
	}

	public ClientTortue(String nom, String prenom, String adresse,
			String email, String tel) {
		super(nom, prenom, adresse, email, tel);
		this.tortue = new TortueNinja(nom);
	}
	
	
	public void CommanderPizza(Pizza pizza){
		tortue.commanderPizza(pizza);
	}
	
	
}
