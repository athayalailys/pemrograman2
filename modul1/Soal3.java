package praktikum1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int bilanganAwal = input.nextInt();
        
        int count = 0;
        int bilanganSekarang = bilanganAwal;
        
        do {
            if (bilanganSekarang % 2 != 0) {
                if (count == N - 1) {
                    System.out.print(bilanganSekarang);
                } else {
                    System.out.print(bilanganSekarang + ", ");
                }
                count++;
            }
            bilanganSekarang++;
        } while (count < N);

        input.close();
    }
}
