package com.company;


import java.util.Comparator;
import java.util.stream.Stream;

public class Joueur implements Comparable<Joueur> {
   // Un joueur est caractérisé par son nom-prénom,
    // son âge, sa taille, son poids, le nombre de matchs joués,
    // son rôle dans l’équipe
    private String nom_Prenom;
    private int age;
    private float taille;
    private float poids;
    private int nbr_match;
    private Role role;

    public Joueur(String nom_Prenom,int age,float taille, float poids, int nbr_match,Role role){
        this.nom_Prenom = nom_Prenom;
        this.age = age;
        this.taille = taille;
        this.poids = poids;
        this.nbr_match = nbr_match;
        this.role = role;
    }

    @Override
    public String toString(){
        return "Nom et Prenom:"+ nom_Prenom +" Age:"+age +"  Taille:"+
                taille +"cm   Poids: "+poids +"kg   Nombre de match:" +nbr_match+
                "  Role:"+role;

    }


    public String getNom_Prenom() {
        return nom_Prenom;
    }
    public int getAge() {
        return age;
    }
    public float getTaille() {
        return taille;
    }
    public float getPoids() {
        return poids;
    }
    public int getNbr_match() {
        return nbr_match;
    }
    public Role getRole() {
        return role;
    }
    public void setNom_Prenom(String nom_Prenom) {
        this.nom_Prenom = nom_Prenom;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setTaille(float taille) {
        this.taille = taille;
    }
    public void setPoids(float poids) {
        this.poids = poids;
    }
    public void setNbr_match(int nbr_match) {
        this.nbr_match = nbr_match;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public int compareTo(Joueur j){
        return this.age-j.age;
    }
    public static Comparator<Joueur> TComparator = new Comparator<Joueur>() {
        @Override
        public int compare(Joueur j1, Joueur j2) {
            return Float.compare(j1.taille,j2.taille);
        }
    };

    public static Comparator<Joueur> PComparator = new Comparator<Joueur>() {
        @Override
        public int compare(Joueur j1, Joueur j2) {
            return Float.compare(j1.poids, j2.poids);
        }
    };


    //Selon la valeur int entrée la méthode retourne l'aatribut associé
    public Object valeur(int i) {
        switch (i) {
            case 0: return this.getNom_Prenom();
            case 1: return this.getTaille();
            case 2: return this.getPoids();
            case 3: return this.getNbr_match();
            case 4: return this.getRole();
            default: throw new RuntimeException("pas de champ pour cet indice");}}

    public Stream<Object> valeurs(){
        return  Stream.iterate(0,n ->n+1).limit(5).map(n->this.valeur(n ));}


}
