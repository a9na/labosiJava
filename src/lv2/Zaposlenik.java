package lv2;

class Zaposlenik {
    private int staz;
    private int starost;
    private double placa;

    public Zaposlenik(int staz, int starost, double placa) {
        this.staz = staz;
        this.starost = starost;
        this.placa = placa;
    }

    public void postaviPodatke(int staz, int starost, double placa) {
        this.staz = staz;
        this.starost = starost;
        this.placa = placa;
    }

    public int getStaz() {
        return staz;
    }

    public int getStarost() {
        return starost;
    }

    public double getPlaca() {
        return placa;
    }

    public double izracunajZaradu() {
        return staz * 12 * placa;
    }

    public static double izracunajZaradu(Zaposlenik zaposlenik) {
        return zaposlenik.staz * 12 * zaposlenik.placa;
    }
}