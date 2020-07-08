public class Main {
    public static void main(String[] args) {
        Video vid = new Video(1);
        vid.setCost(vid.getCost());
        Client c = new Client("Olivia", 2681);
        PrimeClient pc = new PrimeClient("Luca", 6392);
        Order oc = new Order(3528, c);
        Order op = new Order(3548, pc);
        Context context = new Context();

        if (c.getAbbonamento() == 0){
            if (c.createOrder()) {
                System.out.println("CLIENTE BASE "+c.getId()+", CODICE DELL'ORDINE "+oc.getCode() );
                int consegnaC = 0;

                StdProduct p1 = new StdProduct(1425);
                p1.doAction(context,c.getAbbonamento(), oc);
                if (consegnaC < p1.getConsegna())
                    consegnaC = p1.getConsegna();
                StdProduct p2 = new StdProduct(2355);
                p2.doAction(context,c.getAbbonamento(), oc);
                if (consegnaC < p2.getConsegna())
                    consegnaC = p2.getConsegna();
                StdProduct p3 = new StdProduct(3325);
                p3.doAction(context,c.getAbbonamento(), oc);
                if (consegnaC < p3.getConsegna())
                    consegnaC = p3.getConsegna();
                StdProduct p4 = new StdProduct(4767);
                p4.doAction(context,c.getAbbonamento(), oc);
                if (consegnaC < p4.getConsegna())
                    consegnaC = p4.getConsegna();
                StdProduct p5 = new StdProduct(5836);
                p5.doAction(context,c.getAbbonamento(), oc);
                if (consegnaC < p5.getConsegna())
                    consegnaC = p5.getConsegna();
                PrimeProduct perr = new PrimeProduct(6134);
                perr.doAction(context,c.getAbbonamento(), oc);
                StdProduct p15 = new StdProduct(15836);
                p15.doAction(context,c.getAbbonamento(), oc);
                if (consegnaC < p15.getConsegna())
                    consegnaC = p15.getConsegna();
                PrimeProduct perr1 = new PrimeProduct(64839);
                perr1.doAction(context, c.getAbbonamento(), oc);

               if (c.stopOrder()){
                    double TOT = oc.costoTotale(oc.getQ());
                    TOT = Math.floor(TOT * 100.0) / 100.0;
                    System.out.println("- Il costo totale è: " + TOT + "€.");
                    System.out.println("- Tempo di consegna: " + consegnaC);
                }
            }
        }
        c.detach(oc);

        if (pc.getAbbonamento() == 1){
            if (pc.createOrder()) {
                System.out.println("\nCLIENTE PRIME "+pc.getId()+", CODICE DELL'ORDINE "+op.getCode() );
                int consegnaPC = 0;
                PrimeProduct p6 = new PrimeProduct(6134);
                p6.doAction(context,pc.getAbbonamento(), op);
                if (consegnaPC < p6.getConsegna())
                    consegnaPC = p6.getConsegna();
                PrimeProduct p7 = new PrimeProduct(7324);
                p7.doAction(context,pc.getAbbonamento(), op);
                if (consegnaPC < p7.getConsegna())
                    consegnaPC = p7.getConsegna();
                PrimeProduct p8 = new PrimeProduct(8582);
                p8.doAction(context,pc.getAbbonamento(), op);
                if (consegnaPC < p8.getConsegna())
                    consegnaPC = p8.getConsegna();
                PrimeProduct p9 = new PrimeProduct(9396);
                p9.doAction(context,pc.getAbbonamento(), op);
                if (consegnaPC < p9.getConsegna())
                    consegnaPC = p9.getConsegna();
                StdProduct p11 = new StdProduct(11283);
                p11.doAction(context, pc.getAbbonamento(), op);
                if (consegnaPC < p11.getConsegna())
                    consegnaPC = p11.getConsegna();
                pc.noleggioVideo(vid);


                if (c.stopOrder()){
                    double TOT = op.costoTotale(op.getQ());
                    TOT += vid.getCost();
                    TOT = Math.floor(TOT * 100.0) / 100.0;
                    System.out.println("- Il costo totale è: " + TOT + "€.");
                    System.out.println("- Tempo di consegna: " + consegnaPC);
                }
            }
        }
        pc.detach(op);
    }
}
