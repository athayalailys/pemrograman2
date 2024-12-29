package praktikum1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = scanner.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = scanner.nextInt();

        System.out.print("Masukkan Bulan Lahir (1-12): ");
        int bulanLahir = scanner.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        System.out.print("Masukkan Tinggi Badan (cm): ");
        int tinggiBadan = scanner.nextInt();

        System.out.print("Masukkan Berat Badan (kg): ");
        double beratBadan = scanner.nextDouble();

        String namaBulan = "";

        switch (bulanLahir) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                System.out.println("Bulan tidak valid. Harap masukkan angka antara 1 hingga 12.");
                scanner.close();
                return;
        }

        System.out.println("\nOutput:");
        System.out.println("Nama Lengkap: " + namaLengkap + ", Lahir di " + tempatLahir + 
            " pada Tanggal " + tanggalLahir + " " + namaBulan + " " + tahunLahir);
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm dan Berat Badan: " + beratBadan + " kg");

        scanner.close();
    }
}
