package mmo;

import java.util.HashSet;
import java.util.Scanner;
import static mmo.Joueur.listeJoueurs;

public class Sort {

    private String name;
    private int degats;
    HashSet <Sort> listeSorts = new HashSet<>();

    public void creerSort() {
        System.out.println("Bienvenue dans les sorts");
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est votre pseudo ?");
        String repPseudo = sc.nextLine();
        boolean pseudoExists = listeJoueurs.contains(new String(repPseudo));
        System.out.println(pseudoExists);
        if (pseudoExists) {
            System.out.println("Choisissez votre sort ?");
        } else {
            System.out.println("Ce pseudo est disponible ! Veuillez-vous vous inscrire ?");
        }
    }

}
