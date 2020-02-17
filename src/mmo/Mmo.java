package mmo;

import java.util.HashSet;

public class Mmo {

    public HashSet<Joueur> listeJoueurs;

    public static void main(String[] args) {
        /* Joueur untel2 = new Joueur();      
        untel2.creerJoueur();
        Sort sort1 = new Sort();
        sort1.creerSort();*/
        Personnage olivier = new Archer();
        System.out.println("Niveau : " + olivier.getNiveau()); // 1
        System.out.println("NiveauXp : " + olivier.getNiveauExp()); // 0
        System.out.println("Palier : " + olivier.getProchainNiveau()); //1000
        olivier.levelUp(16000);
        System.out.println("Niveau : " + olivier.getNiveau()); // 2
        System.out.println("NiveauXp : " + olivier.getNiveauExp()); // 500
        System.out.println("Palier : " + olivier.getProchainNiveau()); // 2000
        Personnage agent47 = new Soldat();
        System.out.println("Santé de 47 : " + agent47.getSante());
        System.out.println("Santé de olivier : " + olivier.getSante());
        agent47.getSante();
        olivier.volDeVie(agent47);
        olivier.volDeVie(agent47);
        olivier.volDeVie(agent47);
        agent47.volDeVie(olivier);
        System.out.println("Santé de 47 : " + agent47.getSante());
        System.out.println("Santé de olivier : " + olivier.getSante());
    }

}
