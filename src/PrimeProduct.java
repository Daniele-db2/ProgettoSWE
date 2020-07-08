//public class PrimeProduct extends Product implements Visitable{
//    public int code;
//    public double cost;
//    public int consegna;
//    public int sconto;
//
//    public PrimeProduct(int code){
//        this.code = code;
//    }
//
//    public void setCost(double c) {
//        double ct = 5 + Math.random()*45;
//        ct = Math.floor(ct * 100.0) / 100.0;
//        cost = ct - ct*((sconto)/100.0);
//        cost = Math.floor(cost * 100.0) / 100.0;
//        System.out.print(ct + "€ ---> " + cost + "€, sconto del " + sconto + "%");
//    }
//
//    public double getCost(){
//        return cost;
//    }
//
//    public void setSconto(int s){
//        sconto = 10 + ((int)(Math.random() * 20));
//    }
//
//    public void setConsegna(int cons){
//        consegna = 1 +((int)(Math.random() * 3));
//    }
//
//    @Override
//    public double accept(Visitor v) {
//        return v.visit(this);
//    }
//}

public class PrimeProduct implements Visitable,State {
    private int code;
    private double cost;
    private int consegna;
    private int sconto;

    public PrimeProduct(int code){
        this.code = code;
    }

    public void setSconto(){
        sconto = 10 + ((int)(Math.random() * 20));
    }

    public void setCost(int abbonamento, Order o) {
        if (abbonamento == 0) {
            System.out.print("<<ERRORE: Cliente non abilitato all'offerta su questo prodotto, non inseribile nell'ordine>>");
        }
        else {
            double ct = 5 + Math.random() * 45;
            ct = Math.floor(ct * 100.0) / 100.0;
            cost = ct - ct * ((sconto) / 100.0);
            cost = Math.floor(cost * 100.0) / 100.0;
            System.out.print(ct + "€ ---> " + cost + "€, sconto del " + sconto + "%.");
            o.getQ().add(this);
            System.out.print(" Inserito nell'ordine.");
        }
    }

    public double getCost(){
        return cost;
    }

    public void setConsegna(){
        consegna = 1 + ((int)(Math.random() * 3));
    }

    public int getConsegna(){
        return consegna;
    }

    @Override
    public double accept(Visitor v) {
        return v.visit(this);
    }

    @Override
    public void doAction(Context context, int abbonamento, Order o) {
        System.out.println("\nProdotto Prime " + code + ": ");
        setSconto();
        setCost(abbonamento, o);
        setConsegna();
        context.setState(this);
    }
}