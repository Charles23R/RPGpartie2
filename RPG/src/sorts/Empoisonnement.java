package sorts;

import personnages.*;

public class Empoisonnement extends Sort {

    int nbTour=0;

    public Empoisonnement(){
        cout=2;
        nom="Empoisonnement";
        dommage=0;
    }

    public void lancerSort(Personnage persoAttaque, Magicien magicien){
        dommage=(2+(nbTour*2))+magicien.getArme();
        persoAttaque.setPv(persoAttaque.getPv()-dommage);
        nbTour++;
        System.out.println("Le "+persoAttaque.getNom()+" perds "+dommage+" points de vie. Il lui en reste "+persoAttaque.getPv()+".");
        System.out.println();
        System.out.println();
    }
}
