package personnages;

import sorts.*;
public abstract class Magicien extends Personnage {

    protected int pointMagie;
    protected Sort tabSorts[]=new Sort[2];


    public Magicien() {
        pointDef=1;
        pv=60;
    }

    public void attaque(Personnage persoAttaque) {

        Sort sortChoisi;
        sortChoisi=tabSorts[(int)(Math.random()*2)];


        if (sortChoisi.getCout()<=getPointMagie()){
            System.out.println("Le "+getNom()+" attaque!");
            System.out.println("Il utilise "+sortChoisi.getNom()+" ce qui lui coûte "+sortChoisi.getCout()+" points de magie");

            sortChoisi.lancerSort(persoAttaque, this);
        }

        else {
            System.out.println("Le "+getNom()+" n'a plus assez de points de magie.");
            System.out.println();
            System.out.println();
        }

    }

    public int getPointMagie() {
        return pointMagie;
    }

}

