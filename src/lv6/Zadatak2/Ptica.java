package Zadatak2;


public class Ptica implements Zivotinja {
    protected String vrsta;

    public Ptica() {
        this.vrsta = "Ptica";
    }

    @Override
    public void kreciSe() {
        System.out.println("Letim");
    }
}
