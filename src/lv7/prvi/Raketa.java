class Raketa extends Thread {
    private String ime;
    private LansirnaRampa rampa;

    Raketa(String ime, LansirnaRampa rampa) {
        this.ime = ime;
        this.rampa = rampa;
    }

    @Override
    public void run() {
        System.out.println("Raketa " + ime + " se priprema za lansiranje.");
        rampa.lansiraj();
        System.out.println("Raketa " + ime + " je uspjesno lansirana!");
    }
}
