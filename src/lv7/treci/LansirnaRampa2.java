class LansirnaRampa2 {
    private boolean lansiranjeU_Tijeku = false;

    synchronized void lansiraj() {
        if (lansiranjeU_Tijeku) {
            System.out.println("Lansiranje je već u tijeku. Pokusajte kasnije.");
            return;
        }

        lansiranjeU_Tijeku = true;

        for (int i = 10; i >= 0; i--) {
            System.out.println("Odbrojavanje: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Lansiranje!");
        lansiranjeU_Tijeku = false;
    }
}
