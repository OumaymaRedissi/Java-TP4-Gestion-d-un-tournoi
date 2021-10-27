package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

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

        System.out.println(j1.compareTo(j2));

// Le tri par ordre croissant des matchs joués avec affichage.
        e1.getJoueurs().sort(new MatComparator());
        System.out.println("Joueurs par nombre de match croissant");
        for (Joueur j: e1.getJoueurs())
            System.out.println("Nom: "+j.getNom_Prenom()+" Nbr Match :"+j.getNbr_match());
// Le tri par taille croissante des joueurs. Utiliser un stream pour l’affichage.
        e1.getJoueurs().sort(Joueur.TComparator);
        System.out.println("Joueurs par Taille croissante");
        e1.getJoueurs().stream().forEach(j -> {
            System.out.println("Nom : "+j.getNom_Prenom()+"Taille :"+j.getTaille());
        });

// Le tri par poids croissant. Utiliser la méthode sort() pour les listes et une expression Lambda
        e1.getJoueurs().sort(Joueur.PComparator);

//Filtrer les joueurs de taille plus de 180 cm, puis les trier par ordre de taille croissante, et finalement afficher une seule ligne du type 180 : Ali, 183 : Fred, 195 : Bob
       String noms =e1.getJoueurs().stream()
               .filter(joueur -> joueur.getTaille()>180)
               .sorted(Joueur.TComparator)
               .map(j -> j.getTaille()+" : "+j.getNom_Prenom())
               .collect(Collectors.joining( "," ));
       System.out.println("here "+noms);
        e1.getJoueur(0).valeurs().forEach(System.out::println);
        e1.getJoueur(1).valeurs().forEach(System.out::println);
        e1.getJoueur(2).valeurs().forEach(System.out::println);




    }
}

