class Raketa implements Runnable {
    private String ime;
    private LansirnaRampa1 rampa;

    Raketa(String ime, LansirnaRampa1 rampa) {
        this.ime = ime;
        this.rampa = rampa;
    }

    @Override
    public void run() {
        System.out.println("Raketa " + ime + " se priprema za lansiranje.");
        rampa.lansiraj();
        System.out.println("Raketa " + ime + " je uspješno lansirana!");
    }
}
