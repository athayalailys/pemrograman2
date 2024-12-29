package soal2;

public class Cat extends Animal {
	private String warnaBulu;
	
	public Cat(String name, String breed, String warnaBulu) {
		super(name, breed);
		this.warnaBulu = warnaBulu;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Memiliki warna bulu: " + warnaBulu);
	}
}
