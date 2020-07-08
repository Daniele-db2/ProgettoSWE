//public class Main {
//    public static void main(String[] args) {
//        Video vid = new Video(1);
//        Client c = new Client("Olivia", 2681);
//        PrimeClient pc = new PrimeClient("Luca", 6392, vid);
//        Order oc = new Order(3528, c);
//        Order op = new Order(3548, pc);
//
//        if (c.abbonamento == 0){
//            if (c.createOrder()) {
//                System.out.println("Cliente base "+c.id+", codice dell'ordine "+oc.code );
//                int consegnaC = 0;
//
//                StdProduct p1 = new StdProduct(1425);
//                System.out.print("Prodotto " + p1.code + ": ");
//                p1.setCost(p1.cost);
//                p1.setConsegna(p1.consegna);
//                if (consegnaC < p1.consegna)
//                    consegnaC = p1.consegna;
//                StdProduct p2 = new StdProduct(2355);
//                System.out.print("\nProdotto " + p2.code + ": ");
//                p2.setCost(p2.cost);
//                p2.setConsegna(p2.consegna);
//                if (consegnaC < p2.consegna)
//                    consegnaC = p2.consegna;
//                StdProduct p3 = new StdProduct(3325);
//                System.out.print("\nProdotto " + p3.code + ": ");
//                p3.setCost(p3.cost);
//                p3.setConsegna(p3.consegna);
//                if (consegnaC < p3.consegna)
//                    consegnaC = p3.consegna;
//                StdProduct p4 = new StdProduct(4767);
//                System.out.print("\nProdotto " + p4.code + ": ");
//                p4.setCost(p4.cost);
//                p4.setConsegna(p4.consegna);
//                if (consegnaC < p4.consegna)
//                    consegnaC = p4.consegna;
//                StdProduct p5 = new StdProduct(5836);
//                System.out.print("\nProdotto " + p5.code + ": ");
//                p5.setCost(p5.cost);
//                p5.setConsegna(p5.consegna);
//                if (consegnaC < p5.consegna)
//                    consegnaC = p5.consegna;
//
//                oc.Q.add(p1);
//                oc.Q.add(p2);
//                oc.Q.add(p3);
//                oc.Q.add(p4);
//                oc.Q.add(p5);
//
//                if (c.stopOrder()){
//                    double TOT = oc.costoTotale(oc.Q);
//                    System.out.println("- Il costo totale è: " + TOT + "€.");
//                    System.out.println("- Tempo di consegna: " + consegnaC);
//                }
//            }
//        }
//        c.detach(oc);
//
//        if (pc.abbonamento == 1){
//            if (pc.createOrder()) {
//                System.out.println("\nCliente Prime "+pc.id+", codice dell'ordine "+op.code );
//                int consegnaPC = 0;
//                PrimeProduct p6 = new PrimeProduct(6134);
//                System.out.print("Prodotto " + p6.code + ": ");
//                p6.setSconto(p6.sconto);
//                p6.setCost(p6.cost);
//                p6.setConsegna(p6.consegna);
//                if (consegnaPC < p6.consegna)
//                    consegnaPC = p6.consegna;
//                PrimeProduct p7 = new PrimeProduct(7324);
//                System.out.print("\nProdotto " + p7.code + ": ");
//                p7.setSconto(p7.sconto);
//                p7.setCost(p7.cost);
//                p7.setConsegna(p7.consegna);
//                if (consegnaPC < p7.consegna)
//                    consegnaPC = p7.consegna;
//                PrimeProduct p8 = new PrimeProduct(8582);
//                System.out.print("\nProdotto " + p8.code + ": ");
//                p8.setSconto(p8.sconto);
//                p8.setCost(p8.cost);
//                p8.setConsegna(p8.consegna);
//                if (consegnaPC < p8.consegna)
//                    consegnaPC = p8.consegna;
//                PrimeProduct p9 = new PrimeProduct(9396);
//                System.out.print("\nProdotto " + p9.code + ": ");
//                p9.setSconto(p9.sconto);
//                p9.setCost(p9.cost);
//                p9.setConsegna(p9.consegna);
//                if (consegnaPC < p9.consegna)
//                    consegnaPC = p9.consegna;
//                PrimeProduct p10= new PrimeProduct(10782);
//                System.out.print("\nProdotto " + p10.code + ": ");
//                p10.setSconto(p10.sconto);
//                p10.setCost(p10.cost);
//                p10.setConsegna(p10.consegna);
//                if (consegnaPC < p10.consegna)
//                    consegnaPC = p10.consegna;
//
//                op.Q.add(p6);
//                op.Q.add(p7);
//                op.Q.add(p8);
//                op.Q.add(p9);
//                op.Q.add(p10);
//
//                if (c.stopOrder()){
//                    double TOT = op.costoTotale(op.Q);
//                    TOT += vid.cost;
//                    System.out.println("\n- Il costo totale è: " + TOT + "€.");
//                    System.out.println("- Tempo di consegna: " + consegnaPC);
//                }
//            }
//        }
//        pc.detach(op);
//
//
//    }
//}

public class Main {
    public static void main(String[] args) {
        Video vid = new Video(1);
        vid.setCost(vid.getCost());
        Client c = new Client("Olivia", 2681);
        PrimeClient pc = new PrimeClient("Luca", 6392);
        Order oc = new Order(3528, c);
        Order op = new Order(3548, pc);
        Context context = new Context();

        if (c.getAbbonamento() == 0) {
            if (c.createOrder()) {
                System.out.println("CLIENTE BASE " + c.getId() + ", CODICE DELL'ORDINE " + oc.getCode());
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

               if (c.stopOrder(oc)){
                    double TOT = oc.costoTotale(oc.getQ());
                    TOT = Math.floor(TOT * 100.0) / 100.0;
                    System.out.println("- Il costo totale è: " + TOT + "€.");
                    System.out.println("- Tempo di consegna: " + consegnaC + " giorni.");
                }
            }
        }
        c.detach(oc);

        if (pc.getAbbonamento() == 1){
            if (pc.createOrder()) {
                System.out.println("\nCLIENTE PRIME " + pc.getId() + ", CODICE DELL'ORDINE " + op.getCode());
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

                if (c.stopOrder(op)){
                    double TOT = op.costoTotale(op.getQ());
                    TOT += vid.getCost();
                    TOT = Math.floor(TOT * 100.0) / 100.0;
                    System.out.println("- Il costo totale è: " + TOT + "€.");
                    System.out.println("- Tempo di consegna: " + consegnaPC + " giorni.");
                }
            }
        }
        pc.detach(op);
    }
}