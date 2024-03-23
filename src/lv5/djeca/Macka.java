import Sisavac.Sisavac;

public class Macka extends Sisavac {
    private String vrsta;

    public Macka() {
        this.vrsta = "";
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public void opis() {
        System.out.println("Macka teska " + getTezina() + " kg, stara " + getDob() + " godina, vrste " + vrsta);
    }
}
