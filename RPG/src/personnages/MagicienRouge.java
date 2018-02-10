package personnages;

import armes.Magique;
import sorts.*;

public class MagicienRouge extends Magicien {

    private Magique arme;

    public MagicienRouge(Magique _arme) {
        pointMagie=40;
        tabSorts[0]=new Empoisonnement();
        tabSorts[1]=new MortSubite();
        nom="Magicien Rouge";
        this.arme=_arme;
    }

    public int getArme() {
        return arme.lancerUnSort();
    }
}
