package personnages;

public abstract class Personnage {

    protected int pv;
    protected int pointDef;
    protected String nom;

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getPointDef() {
        return pointDef;
    }

    public void setPointDef(int pointDef) {
        this.pointDef = pointDef;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract void attaque(Personnage persoAttaque);

    public abstract int getArme();
}

