package sorts;

import personnages.*;

public abstract class Sort {

    protected int cout;
    protected String nom;
    protected int dommage;

    public abstract void lancerSort(Personnage persoAttaque, Magicien magicien);

    public int getCout() {
        return cout;
    }

    public String getNom() {
        return nom;
    }

    public int getDommage() {
        return dommage;
    }
}
