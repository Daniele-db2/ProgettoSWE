public abstract class AClient extends Subject {
    private String nome;
    private int id;
    private int abbonamento;

    public boolean createOrder(){
        return true;
    }

    public boolean stopOrder(){
        Notify();
        return true;
    }

    public int getId(){
        return id;
    }

    public int getAbbonamento(){
        return abbonamento;
    }

}
