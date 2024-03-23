package Zadatak1;

public abstract class Zaposlenik {
    private String ID;
    private String ime;
    private String prezime;

    public Zaposlenik(String ID, String ime, String prezime) {
        this.ID = ID;
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public abstract void radi();

    public void predstaviSe() {
        System.out.println("Ime: " + ime + " " + prezime + ", ID: " + ID);
    }
}
