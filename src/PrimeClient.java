public class PrimeClient extends AClient{
    private String nome = "";
    private int id;
    private int abbonamento = 1;

    public PrimeClient(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public boolean createOrder(){
        return true;
    }

    public boolean stopOrder(){
        Notify();
        return true;
    }

    public void noleggioVideo(Video vid){
        if (vid.getCode() == 0){
           System.out.println("\nNoleggio serie tv al costo di "+ vid.getCost());
        } else if(vid.getCode() == 1){
            System.out.println("\nNoleggio film al costo di "+ vid.getCost());

        }
    }

    public int getId(){
        return id;
    }

    public int getAbbonamento(){
        return abbonamento;
    }
}
