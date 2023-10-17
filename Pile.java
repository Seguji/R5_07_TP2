
import java.util.ArrayList;

public class Pile {

    private ArrayList<Double> pile;

    public Pile() {
        pile = new ArrayList<Double>();
    }

    public void empiler(Double val){
        pile.add(val);
    }

    public Double depiler(){
        return pile.remove(pile.size()-1);
    }

    public void contenu(){
        for (int i = pile.size(); i>0; i--){
            Double val = pile.get(i-1);
            System.out.println(val);
        }
    }

    public int taille(){
        return pile.size();
    }

    public double valeur(int i) {
        return pile.get(i);
    }

}

