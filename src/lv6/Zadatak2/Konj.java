package Zadatak2;


public class Konj implements Zivotinja {
    protected String vrsta;

    public Konj() {
        this.vrsta = "Konj";
    }

    @Override
    public void kreciSe() {
        System.out.println("Trcim");
    }
}
