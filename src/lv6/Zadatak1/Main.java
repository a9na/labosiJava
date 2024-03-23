package Zadatak1;


public class Main {
    public static void main(String[] args) {


        Direktor direktor = new Direktor("D123", "Ivan", "Ivanovic");
        Tajnica tajnica = new Tajnica("T456", "Ana", "Anic");
        Vozac vozac = new Vozac("V789", "Marko", "Markovic");

        direktor.predstaviSe();
        direktor.radi();

        tajnica.predstaviSe();
        tajnica.radi();

        vozac.predstaviSe();
        vozac.radi();
    }
}
