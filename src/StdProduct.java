//public class StdProduct extends Product implements Visitable {
//    public int code;
//    public double cost;
//    public int consegna;
//
//    public StdProduct(int code) {
//        this.code = code;
//    }
//
//    public void setCost(double c) {
//        cost = 5 + Math.random() * 45;
//        cost = Math.floor(cost * 100.0) / 100.0;
//        System.out.print(cost + "€");
//    }
//
//    public double getCost() {
//        return cost;
//    }
//
//    public void setConsegna(int cons) {
//        consegna = 5 + ((int) (Math.random() * 5));
//    }
//
//    @Override
//    public double accept(Visitor v) {
//        return v.visit(this);
//    }
//
//}

public class StdProduct implements Visitable,State {
    private int code;
    private double cost;
    private int consegna;

    public StdProduct(int code) {
        this.code = code;
    }

    public void setCost(int abbonamento, Order o) {
        if (abbonamento == 0 || abbonamento == 1)
            cost = 5 + Math.random() * 45;
            cost = Math.floor(cost * 100.0) / 100.0;
            System.out.print(cost + "€.");
            o.getQ().add(this);
            System.out.print(" Inserito nell'ordine");
    }

    public double getCost() {
        return cost;
    }

    public void setConsegna() {
        consegna = 5 + ((int) (Math.random() * 5));
    }

    public int getConsegna(){
        return consegna;
    }

    @Override
    public double accept(Visitor v) {
        return v.visit(this);
    }

    public void doAction(Context context, int abbonamento, Order o) {
        System.out.println("\nProdotto Standard " + code + ": ");
        setCost(abbonamento, o);
        setConsegna();
        context.setState(this);


    }
}