package personnages;

import armes.Tranchant;

public class Paladin extends Guerrier {

    Tranchant arme;

    public Paladin(Tranchant _arme) {
        pointDef=5;
        pointForce=5;
        pv=80;
        nom="Paladin";
        this.arme=_arme;
    }


    public void attaque(Personnage persoAttaque){
        int degat;

        System.out.println("Le "+getNom()+" attaque!");

        degat=((pointForce*2-persoAttaque.getPointDef())+arme.trancher());
        persoAttaque.setPv(persoAttaque.getPv()-degat);

        System.out.println("Le "+persoAttaque.getNom()+" perds "+degat+" points de vie. Il lui en reste "+persoAttaque.getPv()+".");
        System.out.println();
        System.out.println();

    }

    public int getArme() {
        return arme.trancher();
    }
}
