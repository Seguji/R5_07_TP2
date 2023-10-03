import java.util.Stack;

public class PileNPI
{
    private Stack pile;

    // constructeur
    public PileNPI(){
        this.pile = new Stack<Double>();
    }

    // méthode empiler
    public void empiler(Double d)
    {
        this.pile.push(d);
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