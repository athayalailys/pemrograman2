package praktikum1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int angkaAwal = scanner.nextInt();
        
        int hitung = 0;
        
        while (hitung < 11) {
            if (angkaAwal % 5 == 0) {
                System.out.print((angkaAwal / 5 - 1) + " ");
            } else {
                System.out.print(angkaAwal + " ");
            }
            
            angkaAwal++;
            hitung++;
        }
        
        scanner.close();
    }
}
