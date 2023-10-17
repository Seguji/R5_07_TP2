public class Affichage {

    Pile pile;

    public Affichage(Pile pile) {
        this.pile = pile;
    }

    public void debut() {
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Bienvenue dans la calculatrice polonaise");
        System.out.println();
    }

    public void tour() {
        System.out.println("Entrez un nombre ou une opération à effectuer sur la pile");
    }

    public void contenu() {
        System.out.println("Contenu de la pile :");
        for (int i = pile.taille(); i>0; i--){
            Double val = pile.valeur(i-1);
            System.out.println("+------------+");
            System.out.println("| " + String.format("%,10.2f", val) + " |");
        }
        System.out.println("+------------+");
        System.out.println();
    }


    public void errOperation() {
        System.out.println("Erreur : opération impossible");
    }
}
