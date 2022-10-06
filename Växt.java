package Sprint1.Inlämningsuppgift1;

public class Växt{

    //Inkapsling med getters och setters.
    private String namn;

    private double längd;

    private String vätsketyp;

    private double dagligtVätskeintag;

    public Växt(String namn, double längd, String vätsketyp) {
        this.namn = namn;
        this.längd = längd;
        this.vätsketyp = vätsketyp;
    }

    public String getNamn(String namn) {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public double getLängd() {
        return längd;
    }

    public void setLängd(double längd) {
        this.längd = längd;
    }

    public String getVätsketyp() {
        return vätsketyp;
    }

    public void setVätsketyp(String vätsketyp) {
        this.vätsketyp = vätsketyp;
    }

    public double getdagligtVätskeintag() {
        return dagligtVätskeintag;
    }

    public double calculateDagligtIntag(String vätsketyp) {
        if (vätsketyp.equals("Mineralvatten")) {
            this.setdagligtVätskeintag(0.02);
            return this.getdagligtVätskeintag();
        } else if (vätsketyp.equals("Kranvatten")) {
            this.setdagligtVätskeintag(0.5 * längd);
            return this.getdagligtVätskeintag();
        } else if (vätsketyp.equals("Proteindryck")) {
            this.setdagligtVätskeintag(0.1 + (0.2 * längd));
            return this.getdagligtVätskeintag();

        }
        else {
            System.out.println("Du har angett fel värde");
        }
        return 0;
    }

    public void setdagligtVätskeintag(double dagligtVätskeintag) {
        this.dagligtVätskeintag = dagligtVätskeintag;
    }


}
