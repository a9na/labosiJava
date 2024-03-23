import TestAutomobila.TestAutomobila;

public class UsporedbaPotrosnje {
    public static void usporedi(TestAutomobila auto1, TestAutomobila auto2) {
        double prosjek1 = auto1.getProsjecnaPotrosnja();
        double prosjek2 = auto2.getProsjecnaPotrosnja();

        System.out.println("Prosječna potrosnja automobila 1: " + prosjek1);
        System.out.println("Prosječna potrosnja automobila 2: " + prosjek2);

        if (prosjek1 < prosjek2) {
            System.out.println("Automobil 1 je stedljiviji.");
        } else if (prosjek1 > prosjek2) {
            System.out.println("Automobil 2 je stedljiviji.");
        } else {
            System.out.println("Prosjecna potrosnja je jednaka za oba automobila.");
        }
    }
}
