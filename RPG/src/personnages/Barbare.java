package personnages;

import armes.Contondant;

public class Barbare extends Guerrier {

    Contondant arme=null;

    public Barbare(Contondant _arme) {
        pv=100;
        pointForce=10;
        pointDef=3;
        nom="Barbare";
        this.arme=_arme;
    }

    public void attaque(Personnage persoAttaque){
        int degat;

        System.out.println("Le "+getNom()+" attaque!");

        degat=((pointForce*2-persoAttaque.getPointDef())+arme.frapper());
        persoAttaque.setPv(persoAttaque.getPv()-degat);

        System.out.println("Le "+persoAttaque.getNom()+" perds "+degat+" points de vie. Il lui en reste "+persoAttaque.getPv()+".");
        System.out.println();
        System.out.println();

    }

    public int getArme() {
        return arme.frapper();
    }
}