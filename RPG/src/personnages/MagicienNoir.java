package personnages;

import armes.Magique;
import sorts.*;

public class MagicienNoir extends Magicien {

    private Magique arme;

    public MagicienNoir(Magique _arme) {
        pointMagie=50;
        tabSorts[0]=new BouleDeFeu();
        tabSorts[1]=new PicDeGlace();
        nom="Magicien Noir";
        this.arme=_arme;
    }

    public int getArme() {
        return arme.lancerUnSort();
    }
}