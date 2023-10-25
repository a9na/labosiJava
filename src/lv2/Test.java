package lv2;

class Test {
    public static void main(String[] args) {

        Zarulja osram = new Zarulja();
        osram.pritisniPrekidac();
        osram.provjeri();
        osram.pritisniPrekidac();
        osram.provjeri();

        Zaposlenik zaposlenik = new Zaposlenik(5, 30, 3000.0);
        System.out.println("Zarada zaposlenika: " + zaposlenik.izracunajZaradu() + " kn");

        Zaposlenik drugiZaposlenik = new Zaposlenik(10, 35, 3500.0);
        System.out.println("Zarada drugog zaposlenika: " + Zaposlenik.izracunajZaradu(drugiZaposlenik) + " kn");
    }
}