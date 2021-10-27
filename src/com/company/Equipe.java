package com.company;

import java.util.*;

public class Equipe {

    private  String nomE;
    private  ArrayList<Joueur> joueurs;
    private Set<Titre> titres;

    public Equipe(String nomE){
        this.nomE = nomE;
        this.joueurs = new ArrayList<Joueur>();
        this.titres = new TreeSet<Titre>() {
        };
    }

    public String getNomE(){ return nomE; }
    public void setNomE(String nomE){ this.nomE = nomE; }

//	ajouterJoueur(Joueur)*
    public void ajouterJoueur(Joueur joueur) throws EqException{
        if(!this.joueurs.add(joueur))
            throw new EqException("Joueur existant");
    }
//	ajouterTitre(Titre)
    public void ajouterTitre(Titre titre) throws EqException{
        if(!this.titres.add(titre))
            throw new EqException("Titre déjà existant")
        ;
    }
//	getJoueur(int)
    public Joueur getJoueur(int i){
        Joueur jou = (Joueur)joueurs.get(i);
        return jou;
    }
//	getJoueurs()
    public List<Joueur> getJoueurs(){
        return joueurs;
    }
//	afficher() : affichage de toutes les données avec des itérateurs
    public void afficher(){
        ListIterator lj = joueurs.listIterator();
        Iterator lt = titres.iterator();
        System.out.println("********** Equipe "+nomE + " **********");
        while (lj.hasNext())
            System.out.println(lj.next());
        while (lt.hasNext())
            System.out.println(lt.next());
    }
//	affichJoueurs() avec méthode forEach()
    public void affichJoueurs(){
      System.out.println("********** Liste des joueurs **********");
      joueurs.forEach(System.out::println);
    }
//	afficherTitres() avec méthode forEach()

    public void afficherTitres(){
        System.out.println("********** Liste des Titres **********");
        titres.forEach(System.out::println);
    }
//	redéfinition de toString() : utiliser StringBuffer et une boucle forEach

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        for (Joueur j: joueurs)
            sb.append("/n"+j.toString());
        return sb.toString();

    }

}
