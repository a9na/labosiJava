class Test {
    public static void main(String[] args) {
        LansirnaRampa1 rampa = new LansirnaRampa1();

        Thread raketa1 = new Thread(new Raketa("Apollo 11", rampa));
        Thread raketa2 = new Thread(new Raketa("SpaceX Falcon 9", rampa));
        Thread raketa3 = new Thread(new Raketa("Sputnik 1", rampa));

        raketa1.start();
        raketa2.start();
        raketa3.start();
    }
}
