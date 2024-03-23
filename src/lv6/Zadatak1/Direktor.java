package Zadatak1;

public class Direktor extends Zaposlenik {
    public Direktor(String ID, String ime, String prezime) {
        super(ID, ime, prezime);
    }

    @Override
    public void radi() {
        System.out.println("Odlucujem");
    }

    @Override
    public void predstaviSe() {
        super.predstaviSe();
        System.out.println("Tip objekta: " + this.getClass().getSimpleName());
    }
}
