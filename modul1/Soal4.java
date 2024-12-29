package praktikum1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Tangan Abu: ");
        String[] abuInput = scanner.nextLine().toUpperCase().split(" ");
        System.out.print("Tangan Bagas: ");
        String[] bagasInput = scanner.nextLine().toUpperCase().split(" ");
        
        if (abuInput.length != 3 || bagasInput.length != 3) {
            System.out.println("Input tidak valid, harus terdiri dari 3 pilihan.");
            return;
        }

        int abuScore = 0;
        int bagasScore = 0;

        for (int i = 0; i < 3; i++) {
            String abu = abuInput[i];
            String bagas = bagasInput[i];

            if (abu.equals(bagas)) {
                continue;
            } else if ((abu.equals("B") && bagas.equals("G")) ||
                       (abu.equals("G") && bagas.equals("K")) ||
                       (abu.equals("K") && bagas.equals("B"))) {
                abuScore++;
            } else {
                bagasScore++;
            }
        }

        if (abuScore > bagasScore) {
            System.out.println("Pemenang: Abu");
        } else if (bagasScore > abuScore) {
            System.out.println("Pemenang: Bagas");
        } else {
            System.out.println("Pemenang: Seri");
        }
        
        scanner.close();
    }
}
