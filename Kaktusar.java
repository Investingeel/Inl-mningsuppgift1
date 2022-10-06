package Sprint1.Inlämningsuppgift1;

// Subklassen Kaktusar ärver från superklassen växt.

public class Kaktusar extends Växt implements Interface  {


    public Kaktusar(String namn, double längd, String vätsketyp) {
        super(namn, längd, vätsketyp);
    }

    // Interface implementation
    public void getNamn() {
        System.out.println("namn: Igge");

    }


}

