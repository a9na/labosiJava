package Zadatak2;

public class Riba implements Zivotinja {
    protected String vrsta;

    public Riba() {
        this.vrsta = "Riba";
    }

    @Override
    public void kreciSe() {
        System.out.println("Plivam");
    }
}
