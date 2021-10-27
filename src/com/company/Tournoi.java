package com.company;

import java.util.Map;

public class Tournoi {
    private String nom;
    private String lieu;
    Map equipes;
    public Tournoi(String nom, String lieu){
        this.nom=nom;
        this.lieu=lieu;
        Map <Integer,Equipe> equipes = new HashMap();}

    public String getNom(){ return nom; }
    public void setNom(String nom){ this.nom= nom;}
    public String getLieu(){ return lieu; }
    public void setLieu(String lieu){ this.lieu= lieu;}

    public void ajouterEquipe(Integer i, Equipe eq){
        if (equipes!=null)
            equipes.put(i, eq);
    }



}

}
