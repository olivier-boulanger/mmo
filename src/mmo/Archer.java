package mmo;


class Archer extends Personnage {

    public static int sante = 100;

    public Archer() {
        super();
        this.setSante(Archer.sante);
    }

    /*public void creerArcher() {
        System.out.println("---------------- ARCHER ------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le nom de votre personnage ?");
        String id = sc.nextLine();
        this.setName(id);
        System.out.println("Bienvenue " + this.getName());
    }*/
    public void volDeVie(Personnage p) {
        this.setSante(10);
        p.setSante(-10);
    }

    public void levelUp(int pts) { // pts 15000
        int total = this.getNiveauExp() + pts; // 0 + 15000
        if (total >= this.getProchainNiveau()) { // 15000 >  1000
            while (total >= this.getProchainNiveau()) {

                if (total >= this.getProchainNiveau()) {
                    this.setNiveauExp(total - this.getProchainNiveau());
                    this.setProchainNiveau(2);
                    if (total == this.getProchainNiveau()) {
                        this.setNiveau(this.getNiveau());
                    }
                }
            }
        }
    }

}
