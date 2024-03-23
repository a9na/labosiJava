package Zadatak1;

import Zadatak1.Zaposlenik;

public class Vozac extends Zaposlenik {
    public Vozac(String ID, String ime, String prezime) {
        super(ID, ime, prezime);
    }

    @Override
    public void radi() {
        System.out.println("Vozim");
    }
}
