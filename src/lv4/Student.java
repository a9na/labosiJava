import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Scanner;

class Student implements Serializable {
    private final String maticniBroj;
    private final String ime;
    private final String prezime;
    private final String fakultet;
    private final String smjer;
    private final int godina;
    private final double prosjecnaOcjena;

    public Student(String maticniBroj, String ime, String prezime, String fakultet, String smjer, int godina, double prosjecnaOcjena) {
        this.maticniBroj = maticniBroj;
        this.ime = ime;
        this.prezime = prezime;
        this.fakultet = fakultet;
        this.smjer = smjer;
        this.godina = godina;
        this.prosjecnaOcjena = prosjecnaOcjena;
    }

    public double getProsjecnaOcjena() {
        return prosjecnaOcjena;
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter Student Information for Student " + (i + 1) + ":");
            System.out.print("Maticni Broj: ");
            String maticniBroj = scanner.nextLine();
            System.out.print("Ime: ");
            String ime = scanner.nextLine();
            System.out.print("Prezime: ");
            String prezime = scanner.nextLine();
            System.out.print("Fakultet: ");
            String fakultet = scanner.nextLine();
            System.out.print("Smjer: ");
            String smjer = scanner.nextLine();

            int godina = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Godina: ");
                if (scanner.hasNextInt()) {
                    godina = scanner.nextInt();
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid integer for Godina.");
                    scanner.next();
                }
            }

            System.out.print("Prosjecna Ocjena: ");
            double prosjecnaOcjena = scanner.nextDouble();

            scanner.nextLine();

            students[i] = new Student(maticniBroj, ime, prezime, fakultet, smjer, godina, prosjecnaOcjena);
        }

        scanner.close();


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("students.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            System.out.println("Student data has been serialized to students.dat.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("students.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student[] readStudents = (Student[]) objectInputStream.readObject();
            objectInputStream.close();

            double totalAverage = 0;
            for (Student student : readStudents) {
                totalAverage += student.getProsjecnaOcjena();
            }
            double averageGrade = totalAverage / readStudents.length;
            System.out.println("Average Grade for All Students: " + averageGrade);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
