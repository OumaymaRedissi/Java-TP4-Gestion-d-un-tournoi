package com.company;

public class Joueur {
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
}
