package lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Program 1
        System.out.println("    J    a   v     v  a");
        System.out.println("    J   a a   v   v  a a");
        System.out.println("J   J  aaaaa   V V  aaaaa");
        System.out.println("  JJ  a     a   V  a     a");

        // Program 2
        System.out.println("Hello");
        System.out.println("Ana Novkovic");

        // Program 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int broj1 = scanner.nextInt();
        System.out.print("Unesite drugi broj: ");
        int broj2 = scanner.nextInt();
        int suma = broj1 + broj2;
        System.out.println("Suma brojeva " + broj1 + " i " + broj2 + " je: " + suma);

        // Program 4
        System.out.print("Unesite prvi broj: ");
        double broj1Double = scanner.nextDouble();
        System.out.print("Unesite drugi broj: ");
        double broj2Double = scanner.nextDouble();
        if (broj2Double != 0) {
            double rezultat = broj1Double / broj2Double;
            System.out.println("Rezultat dijeljenja " + broj1Double + " / " + broj2Double + " je: " + rezultat);
        } else {
            System.out.println("Greška: Drugi broj ne može biti nula.");
        }

        // Program 5
        System.out.print("Unesite prvi broj: ");
        int broj3 = scanner.nextInt();
        System.out.print("Unesite drugi broj: ");
        int broj4 = scanner.nextInt();
        int umnozak = broj3 * broj4;
        System.out.println(broj3 + " x " + broj4 + " = " + umnozak);

        // Program 6
        System.out.print("Unesite prvi broj: ");
        int broj5 = scanner.nextInt();
        System.out.print("Unesite drugi broj: ");
        int broj6 = scanner.nextInt();
        System.out.println(broj5 + " + " + broj6 + " = " + (broj5 + broj6));
        System.out.println(broj5 + " - " + broj6 + " = " + (broj5 - broj6));
        System.out.println(broj5 + " x " + broj6 + " = " + (broj5 * broj6));
        System.out.println(broj5 + " / " + broj6 + " = " + (broj5 / broj6));
        System.out.println(broj5 + " mod " + broj6 + " = " + (broj5 % broj6));

        scanner.close();
    }
}
