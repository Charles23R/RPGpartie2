package sorts;

import personnages.*;

public class PicDeGlace extends Sort {

    public PicDeGlace(){
        cout=5;
        nom="Pic de glace";
        dommage=0;
    }

    public void lancerSort(Personnage persoAttaque, Magicien magicien){
        dommage=(7-persoAttaque.getPointDef()+magicien.getArme());
        persoAttaque.setPv(persoAttaque.getPv()-dommage);
        System.out.println("Le "+persoAttaque.getNom()+" perds "+dommage+" points de vie. Il lui en reste "+persoAttaque.getPv()+".");
        System.out.println();
        System.out.println();
    }
}
