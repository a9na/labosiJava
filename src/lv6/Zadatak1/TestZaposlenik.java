import Zadatak1.Direktor;
import Zadatak1.Tajnica;

public class TestZaposlenik {
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
