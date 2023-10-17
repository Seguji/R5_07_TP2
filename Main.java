import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pile pile = new Pile();
        Affichage affichage = new Affichage(pile);
        Calculatrice calc = new Calculatrice(pile, affichage);

        affichage.debut();
        
        try ( Scanner scanner = new Scanner(System.in)) {

            affichage.tour();
            while(true){
                if (scanner.hasNext()){
                    String input = scanner.nextLine();
                    calc.lecture(input);
                    affichage.contenu();
                    affichage.tour();
                }
            }
        }
    }
}