
package soal2;

public class Animal {
	private String name;
	private String breed;
	
	public Animal(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public void display() {
		System.out.println("Detail Hewan Peliharaan:");
		System.out.println("Nama hewan peliharaanku adalah: " + name);
		System.out.println("Dengan ras: " + breed);
	}
}
