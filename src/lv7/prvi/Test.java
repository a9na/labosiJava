class Test {
    public static void main(String[] args) {
        LansirnaRampa rampa = new LansirnaRampa();

        Raketa raketa1 = new Raketa("Apollo 11", rampa);
        Raketa raketa2 = new Raketa("SpaceX Falcon 9", rampa);
        Raketa raketa3 = new Raketa("Sputnik 1", rampa);

        raketa1.start();
        raketa2.start();
        raketa3.start();
    }
}

