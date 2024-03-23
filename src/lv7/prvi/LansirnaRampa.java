class LansirnaRampa {
    synchronized void lansiraj() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("Odbrojavanje: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Lansiranje!");
    }
}
