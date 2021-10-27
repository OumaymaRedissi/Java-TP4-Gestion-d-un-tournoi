package com.company;

import java.util.Comparator;

public class MatComparator implements Comparator<Joueur> {
    @Override
    public int compare(Joueur j1, Joueur j2){
        return Integer.compare(j1.getNbr_match(), j2.getNbr_match());
    }
}
