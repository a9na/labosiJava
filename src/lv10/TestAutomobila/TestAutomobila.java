package TestAutomobila;

public class TestAutomobila {
    private String naziv;
    private double potrosioGoriva;
    private double prijedjenPut;


    public double getProsjecnaPotrosnja() {
        return potrosioGoriva / prijedjenPut;
    }
}
