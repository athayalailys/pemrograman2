package soal3;

public class Soal3Main {
	public static void main(String[] args) {
		 Pegawai p1 = new Pegawai();
		 //Pada baris ini terjadi error karena kurang titik koma ';' di akhir pernyataan
		 //p1.nama = "Roi"
		 p1.nama = "Roi";
		 //Pada baris ini terjadi error karena sebelumnya tipe data dideklarasikan sebagai char, bukan String. Setelah tipe data diubah, sudah tidak error lagi
		 p1.asal = "Kingdom of Orvel";
		 //Pada baris ini awalnya terjadi error, karena pada class objek terjadi kesalahan pada parameter String
		 p1.setJabatan("Assasin");
		 //tidak ada inisialisasi umur, sehingga saat di-run umur tertera sebagai 0
		 p1.umur = 22;
		 
		 System.out.println("Nama Pegawai : " + p1.getNama());	 
		 System.out.println("Asal         : " + p1.getAsal());
		 System.out.println("Jabatan      : " + p1.jabatan);
		 System.out.println("Umur         : " + p1.umur);
	}
}
