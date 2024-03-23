package Sisavac;

import djeca.Macka;
import djeca.Pas;

public class Test {
    public static void main(String[] args) {
        Pas pas = new Pas();
        pas.setTezina(10.5);
        pas.setDob(3);
        pas.setVrsta("Njemacki ovcar");
        pas.opis();

        Macka macka = new Macka();
        macka.setTezina(5.0);
        macka.setDob(2);
        macka.setVrsta("Perzijska macka");
        macka.opis();
    }
}
