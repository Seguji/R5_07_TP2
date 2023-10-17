public class Calculatrice {

    Pile pile;
    Affichage affichage;

    public Calculatrice(Pile pile, Affichage affichage) {
        this.pile = pile;
        this.affichage = affichage;
    }
   
    public void lecture(String input){
        try {
            // si l'input est un nombre, on l'empile
            double val = Double.parseDouble(input);
            pile.empiler(val);
        } catch (Exception e) {
            switch (input) {
                case "+":
                    addition();
                    break;

                case "*":
                    multiplication();
                    break;
                
                case "-":
                    soustraction();
                    break;

                case "/":
                    division();
                    break;

                case "²":
                    carre();
                    break;
            
                default:
                    break;
            }
        }
    }

    public void addition() {
        if (verif(2)){
            Double val1 = pile.depiler();
            Double val2 = pile.depiler();
            Double valSomme = val1 + val2;

            pile.empiler(valSomme);
        }
    }

    public void multiplication() {
        if (verif(2)){
            Double val1 = pile.depiler();
            Double val2 = pile.depiler();
            Double valProduit = val1 * val2;

            pile.empiler(valProduit);
        }
    }

    public void soustraction() {
        if (verif(2)){
            Double val1 = pile.depiler();
            Double val2 = pile.depiler();
            Double valDifference = val2 - val1;

            pile.empiler(valDifference);
        }
    }

    public void division() {
        if (verif(2)){
            Double val1 = pile.depiler();
            Double val2 = pile.depiler();
            Double valQuotient = val2 / val1;

            pile.empiler(valQuotient);
        }
    }

    public void carre() {
        if (verif(1)){
            Double val1 = pile.depiler();
            Double valCarre = Math.pow(val1, 2);

            pile.empiler(valCarre);
        }
    }

    public boolean verif(int tailleMin) {
        if (pile.taille() >= tailleMin) return true;
        affichage.errOperation();
        return false;
    }

}

