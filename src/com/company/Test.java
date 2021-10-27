package com.company;

public class Test {

    public static void main(String[] args) throws EqException {
	// write your code here
        Joueur j1 = new Joueur("Monica Geller",28,160, (float) 60.3,5, Role.Centre );
        Joueur j2 = new Joueur("Pheobe Buffey", 30, 170,80,30, Role.Attaque );
        Joueur j3 = new Joueur("Rachel Green",28, 161, (float) 50.2,17, Role.Défense);
        Titre t1 = new Titre(1,2020, "Championship");
        Titre t2 = new Titre(2,2000,"Coupe");
        Equipe e1 = new Equipe("Friends");
        e1.ajouterJoueur(j1);
        e1.ajouterJoueur(j2);
        e1.ajouterJoueur(j3);
        e1.ajouterTitre(t1);
        e1.ajouterTitre(t2);

        e1.afficher();

        e1.affichJoueurs();

        e1.afficherTitres();





    }
}
