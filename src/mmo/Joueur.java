package mmo;

import java.util.HashSet;
import java.util.Scanner;

public class Joueur {

    private String pseudo;
    Personnage perso;
    static HashSet<Joueur> listeJoueurs = new HashSet<>();

    public Joueur() {
        pseudo = "test";
        Personnage perso;
    }

    public Joueur(String ps, Personnage perso) {
        this.pseudo = ps;
        this.perso = perso;
    }

    public void creerJoueur() {
        char resp = 'N';
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Quel est le pseudo de votre joueur ?");
            String id = sc.nextLine();
            System.out.println("Quel personnage voulez-vous jouer (1-Archer 2-Soldat 3-Sorcier ?");
            int pers = sc.nextInt();
            sc.nextLine();
            this.pseudo = id;
            Personnage p;
            if (pers == 1) {
                p = new Archer();
            } else if (pers == 2) {
                p = new Soldat();
            } else {
                p = new Sorcier();
            }
            Joueur j = new Joueur(id, p);
            listeJoueurs.add(j);
            System.out.println("Bonjour " + this.pseudo + " ! Vous êtes un " + p);
            System.out.println();
            System.out.println("Voulez-vous ajouter un joueur ?");
            resp = sc.nextLine().toUpperCase().charAt(0);
        } while (resp == 'O');

        System.out.print("Liste de mes joueurs : " + listeJoueurs);
        System.out.println();

    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
}
