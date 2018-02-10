package sorts;

import personnages.*;

public class BouleDeFeu extends Sort {

    public BouleDeFeu(){
        cout=5;
        nom="Boule de feu";
    }


    public void lancerSort(Personnage persoAttaque, Magicien magicien) {
        dommage=5+magicien.getArme();
        persoAttaque.setPv(persoAttaque.getPv()-dommage);
        System.out.println("Le "+persoAttaque.getNom()+" perds "+dommage+" points de vie. Il lui en reste "+persoAttaque.getPv()+".");
        System.out.println();
        System.out.println();
    }
}
