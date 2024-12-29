package soal3;

//Nama file dan nama kelas harus sama, sebelumnya Employee diganti menjadi Pegawai
//public class Employee
public class Pegawai {
	 public String nama;
	 //Pada baris ini seharusnya menggunakan tipe data String untuk mendeklarasikan asal, bukan tipe data char
	 //public char asal;
	 public String asal;
	 public String jabatan;
	 public int umur;
	 
	 public String getNama() {
		 return nama;
	 }

	 //pada baris ini terjadi error karena mengembalikan tipe data String, sedangkan tipe data asal adalah char. Setelah tipe data diubah ke String, tidak terjadi error lagi
	 public String getAsal() {
		 return asal;
	 }
	 
	 //Pada baris ini terjadi error karena parameter pada method setJabatan belum didefinisikan. Diperlukan parameter bertipe data String untuk menentukan jabatan
	 //public void setJabatan() {
	 public void setJabatan(String jabatan) {
		 this.jabatan = jabatan;
	 }
}
