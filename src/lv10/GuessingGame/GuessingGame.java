package GuessingGame;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        final int TARGET_NUMBER = 50;

        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        do {
            System.out.print("Pogodi broj: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < TARGET_NUMBER) {
                System.out.println("Broj je veci.");
            } else if (guess > TARGET_NUMBER) {
                System.out.println("Broj je manji.");
            }
        } while (guess != TARGET_NUMBER);

        System.out.println("Bravo! Pogodio/la si broj zadan u programu, trebalo ti je " + attempts + " pokusaja.");
    }
}
