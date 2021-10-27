package com.company;

public class Titre {
    private int id;
    private int annee;
    private String nomT;

    public Titre(int id, int annee, String nom){
        this.id = id;
        this.annee = annee;
        this.nomT = nom;
    }
    @Override
    public String toString(){
        return "Titre: " + nomT +annee;
    }
    public int getId(){ return id; }
    public void setId(int id){ this.id = id; }
    public int getAnnee(){ return annee; }
    public void setAnnee(int annee){ this.annee = annee; }
    public String getNomT(){ return nomT; }
    public void setNomT(String nomT){ this.nomT = nomT; }


}
