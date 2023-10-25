package lv2;

class Zarulja {
    private boolean stanje;

    public Zarulja() {
        this.stanje = false;
    }

    public void pritisniPrekidac() {
        stanje = !stanje;
    }

    public void provjeri() {
        if (stanje) {
            System.out.println("Svijetli");
        } else {
            System.out.println("Mrak je");
        }
    }
}