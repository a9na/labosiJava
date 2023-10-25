package lv3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;

        do {
            try {
                System.out.print("Unesite broj elemenata vektora (2-10): ");
                n = Integer.parseInt(scanner.nextLine());
                if (n < 2 || n > 10) {
                    throw new IllegalArgumentException("Neispravan unos. Unesite broj iz intervala 2-10.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        do {
            try {
                System.out.print("Unesite dimenziju kvadratne matrice (1-5): ");
                m = Integer.parseInt(scanner.nextLine());
                if (m < 1 || m > 5) {
                    throw new IllegalArgumentException("Neispravan unos. Unesite broj iz intervala 1-5.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        int[] vector = new int[n];
        int[][] matrix = new int[m][m];

        for (int i = 0; i < n; ++i) {
            while (true) {
                try {
                    System.out.print("Unesite " + (i + 1) + ". element vektora: ");
                    vector[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Neispravan unos. Unesite cijeli broj.");
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                while (true) {
                    try {
                        System.out.print("Unesite element matrice [" + i + "][" + j + "]: ");
                        matrix[i][j] = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Neispravan unos. Unesite cijeli broj.");
                    }
                }
            }
        }

        int choice = 0;
        do {
            System.out.println("Odaberite opciju:");
            System.out.println("(1) Izračunati aritmetičku sredinu sporedne dijagonale.");
            System.out.println("(2) Izračunati sumu neparnih elemenata prvog retka i prvog stupca matrice.");
            System.out.println("(3) Ispisati sve brojeve na parnim indeksima vektora V.");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        double sumDiagonal = 0;
                        for (int i = 0; i < m; i++) {
                            sumDiagonal += matrix[i][m - 1 - i];
                        }
                        double averageDiagonal = sumDiagonal / m;
                        System.out.println("Aritmetička sredina sporedne dijagonale: " + averageDiagonal);
                        break;
                    case 2:
                        int sumFirstRow = 0;
                        int sumFirstColumn = 0;
                        boolean hasOddElement = false;
                        for (int i = 0; i < m; i++) {
                            sumFirstRow += matrix[0][i];
                            sumFirstColumn += matrix[i][0];
                            if (matrix[0][i] % 2 != 0 || matrix[i][0] % 2 != 0) {
                                hasOddElement = true;
                            }
                        }
                        if (hasOddElement) {
                            System.out.println("Suma neparnih elemenata prvog retka: " + sumFirstRow);
                            System.out.println("Suma neparnih elemenata prvog stupca: " + sumFirstColumn);
                        } else {
                            System.out.println("Nije bilo moguće izračunati sumu neparnih elemenata.");
                        }
                        break;
                    case 3:
                        System.out.println("Brojevi na parnim indeksima vektora V:");
                        for (int i = 0; i < n; i += 2) {
                            System.out.print(vector[i] + " ");
                        }
                        System.out.println();
                        break;
                    default:
                        System.out.println("Pogrešan unos. Molimo pokušajte ponovno.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Pogrešan unos. Molimo pokušajte ponovno.");
            }
        } while (choice != 1 && choice != 2 && choice != 3);
    }
}