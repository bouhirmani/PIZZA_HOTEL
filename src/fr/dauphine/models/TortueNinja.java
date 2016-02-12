package fr.dauphine.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class TortueNinja
{
    private String nom;
    private List<Pizza>listPizza;
	
    public TortueNinja(String nom) {
		this.nom = nom;
		this.listPizza = new ArrayList<>();
	}
    
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Pizza> getListPizza() {
		return listPizza;
	}
	public void setListPizza(List<Pizza> listPizza) {
		this.listPizza = listPizza;
	}
    
	public void commanderPizza(Pizza pizza){
		listPizza.add(pizza);
	}

}
