package fr.dauphine.models;

import java.util.List;


/**
 * Write a description of class TortueNinja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TortueNinja
{
    // instance variables - replace the example below with your own
    private String nom;
    private Pizza pi;
    private List<Pizza>listPizza;
    
    
    public List<Pizza> getListPizza() {
		return listPizza;
	}

	public void setListPizza(List<Pizza> listPizza) {
		this.listPizza = listPizza;
	}

	/**
     * Constructor for objects of class TortueNinja
     */
    public TortueNinja(String nom)
    {
        // initialise instance variables
        this.nom = nom;
    }
    
    public void setA(Pizza piz)
    {
    	
    	this.pi=piz;
    	
    }
    
   
    public void addA(Pizza piz)
    { 
      
      listPizza.add(piz);
    }

    
    public Pizza getPiz()

    {
    	return this.pi;
    }
    
    public void consoPizza(Pizza pizza, int supplementPrix)
    {
        pizza.ajouterSupplement(supplementPrix);
        pizza.consommeePar(this.nom);
        
    }
    
    public void setNom (String nom)
    {
        this.nom = nom;
    }
    
    public String getNom ()
    {
        return this.nom;
    }
}
