public class Client extends AClient {
    private String nome;
    private int id;
    private int abbonamento = 0;

    public Client(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public boolean createOrder(){
        return true;
    }

    public boolean stopOrder(Order ord) {
        Notify(ord);
        return true;
    }

    public int getId() {
        return id;
    }

    public int getAbbonamento(){
        return abbonamento;
    }
}

