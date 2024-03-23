package djeca;

import Sisavac.Sisavac;

public class Pas extends Sisavac {
    private String vrsta;

    public Pas() {
        this.vrsta = "";
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public void opis() {
        System.out.println("Pas tezak " + getTezina() + " kg, star " + getDob() + " godina, vrste " + vrsta);
    }
}
