//public abstract class Product{
//    public int code;
//    public double cost;
//    public int consegna;
//
//    public void setCost(double cost){this.cost = cost;}
//
//    public double getCost(){return cost;}
//
//    public void setConsegna(int consegna){this.consegna = consegna;}
//}

public interface State{
    public void doAction(Context context, int abbonamento, Order o);
}