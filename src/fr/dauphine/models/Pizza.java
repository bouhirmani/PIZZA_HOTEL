package fr.dauphine.models;

import java.util.ArrayList;


public class Pizza
{
    public String nom;
    public int prix;
    TortueNinja ninja;
    private ArrayList <TortueNinja> ls; 

    public Pizza(String nom, int prix)
    {
        this.nom = nom;
        this.prix = prix;
    }

    public void setNom (String nom)
    {
        this.nom = nom;
    }
    
    public String getNom() 
    {
        return this.nom;
    }
    
    public void setPrix (int prix) 
    {
        this.prix = prix;
    }
    
    public int getPrix ()
    {
        return this.prix;
    }
    
    public String getNinja ()
    {
        return ninja.getNom();
    }
    
    public void ajouterSupplement (int prixSupplement)
    {
        this.prix = this.prix + prixSupplement;
    }
    
    public void consommeePar (String nomNinja)
    {
        ninja = new TortueNinja (nomNinja);
    }
    
    public ArrayList <TortueNinja> getArray() 
    {
    	return(ls);
    }
    public void remove(TortueNinja b)
    {
    	ls.remove(b);
    }
    
   
}
