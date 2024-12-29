package soal2;

import java.util.Scanner;

public class MainSoal2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
		System.out.println("1. Kucing");
		System.out.println("2. Anjing");
		System.out.println("Masukkan pilihan: ");
		int choice = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nama hewan peliharaan: ");
		String name = scanner.nextLine();
		System.out.println("Ras: ");
		String breed = scanner.nextLine();
		
		if (choice == 1) {
			System.out.println("Warna Bulu: ");
			String warnaBulu = scanner.nextLine();
			
			Cat cat = new Cat(name, breed, warnaBulu);
			cat.display();
		} else if (choice == 2) {
			System.out.println("Kemampuan (pisahkan dengan koma): ");
			String skills = scanner.nextLine();
			
			Dog dog = new Dog(name, breed, skills);
			dog.display();
		} else {
			System.out.println("Pilihan tidak valid.");
		}
	}
}
