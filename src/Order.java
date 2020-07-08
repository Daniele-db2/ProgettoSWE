import java.util.ArrayList;

public class Order extends Observer implements Visitor {
    private int numTipo = 0;
    private int code;
    private ArrayList<Visitable> Q = new ArrayList<>();
    private AClient ac;

    public Order(int code, AClient ac) {
        this.code = code;
        this.ac = ac;
        ac.attach(this);
    }

    public int getCode(){
        return code;
    }

    public ArrayList<Visitable> getQ(){
        return Q;
    }

    @Override
    public double visit(StdProduct sp) {
        return sp.getCost();
    }

    public double visit(PrimeProduct pp) {
        return pp.getCost();
    }

    public double costoTotale( ArrayList<Visitable> Q) {
        double totale = 0.0D;
        for (Visitable product: Q)
            totale += product.accept(this);
        return totale;
    }

    public void update(Observer o, Subject s) {
        for (Visitable product:Q)
            numTipo++;
        if (numTipo == 1)
            System.out.println("\n- Esiste una sola tipologia di articoli da pagare.");
        else System.out.println("\n- Le tipologie di articoli da pagare sono: " + numTipo + ".");
    }
}