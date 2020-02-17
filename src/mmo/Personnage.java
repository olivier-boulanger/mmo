package mmo;

import java.util.Set;

abstract class Personnage {

    private int niveau;
    private int sante;
    private int niveauExp;
    private int prochainNiveau;
    private String name;

    private Set<Sort> sortilege;

    public Personnage() {
        this.niveau = 1;
        this.sante = 0;
        this.niveauExp = 0;
        this.prochainNiveau = 1000;
        this.name = "test";
    }

    public int getSante() {
        return this.sante;
    }

    public void setSante(int s) {
        this.sante += s;
    }

    public int getNiveau() {
        return this.niveau;
    }

    public void setNiveau(int s) {
        this.niveau = s;
        this.niveau++;
    }

    public int getProchainNiveau() {
        return this.prochainNiveau;
    }

    public void setProchainNiveau(int s) {
        this.prochainNiveau *= s;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getNiveauExp() {
        return this.niveauExp;
    }

    public abstract void levelUp(int pts);

    public void setNiveauExp(int s) {
        if (s > 0) {
            this.niveau++;
        }
        this.niveauExp = s;

    }

    public abstract void volDeVie(Personnage p);

    public String toString() {
        return this.getClass().getSimpleName();
    }

    //public abstract void creerArcher();
    //public abstract void creerSoldat();
    //public abstract void creerSorcier();
}
