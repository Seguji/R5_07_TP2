import java.util.Stack;

public class PileNPI
{
    private Stack pile;

    // constructeur
    public PileNPI(){
        this.pile = new Stack<Double>();
    }

    // méthode empiler
    public void empiler(String s)
    {
        this.pile.push(Double.parseDouble(s));
    }

    // méthode depiler
    public double depiler()
    {
        if (this.pile.size() >= 1)
        {
            return this.pile.pop();
        }
        return NAN;
    }

}