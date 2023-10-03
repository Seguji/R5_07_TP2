import java.util.Scanner;

/**
 * Calculatrice
 */
public class Calculatrice
{
    private PileNPI pile;

    public Calculatrice(PileNPI pile) {
        this.pile = pile;
    }

    public void lecture(String s)
    {
        double valeur = NAN;

        try
        { 
            valeur = Double.parseDouble(s);    
        } catch (Exception e) {}

        if (Double.isNaN(valeur)){
            switch (s) {
                case "+":  
                    addition();
                    break;

                case "*":  
                    multiplication();
                    break;

                case "-":  
                    soustraction();
                    break;

                case "p":  
                    affichage();
                    break;
            
                default:
                    System.out.println("opération inconnue");
                    break;
            }
        } else {
            this.pile.empiler(s);
        }
    }

    private addition()
    {
        Double a = this.pile.depiler();
        Double b = this.pile.depiler();

        if (!a.isNaN() && !b.isNaN()) {
            Double resultat = a + b;
            this.pile.empiler(resultat);
        }
    }
}