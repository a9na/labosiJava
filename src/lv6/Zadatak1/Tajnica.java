public class Tajnica extends Zaposlenik {
    public Tajnica(String ID, String ime, String prezime) {
        super(ID, ime, prezime);
    }

    @Override
    public void radi() {
        System.out.println("Dogovaram");
    }
}
