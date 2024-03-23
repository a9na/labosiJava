package MatricaNiti;

import java.util.Scanner;

public class MatricaNiti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;

        do {
            System.out.print("Unesite broj M (2-10): ");
            m = scanner.nextInt();
        } while (m < 2 || m > 10);

        int[][] matrica = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrica[i][j] = scanner.nextInt();
            }
        }

        Nit[] niti = new Nit[m];
        for (int i = 0; i < m; i++) {
            niti[i] = new Nit(matrica[i]);
            niti[i].start();
        }
    }
}
