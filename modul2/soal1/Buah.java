package soal1;

class Buah {
    private String nama;
    private double beratPerUnit;
    private double hargaPerUnit;
    private double jumlahBeli;

    public Buah(String nama, double beratPerUnit, double hargaPerUnit, double jumlahBeli) {
        this.nama = nama;
        this.beratPerUnit = beratPerUnit;
        this.hargaPerUnit = hargaPerUnit;
        this.jumlahBeli = jumlahBeli;
    }

    public double hitungHargaSebelumDiskon() {
        return (jumlahBeli / beratPerUnit) * hargaPerUnit;
    }

    public double hitungDiskon() {
        int diskonPer4kg = (int) (jumlahBeli / 4);
        return diskonPer4kg * 0.02 * hargaPerUnit * 4;
    }

    public double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungDiskon();
    }

    public void tampilkanInfo() {
        System.out.printf("Nama Buah: %s%n", nama);
        System.out.printf("Berat: %.1fkg%n", beratPerUnit);
        System.out.printf("Harga: Rp%.1f%n", hargaPerUnit);
        System.out.printf("Jumlah Beli: %.1fkg%n", jumlahBeli);
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", hitungHargaSebelumDiskon());
        System.out.printf("Total Diskon: Rp%.2f%n", hitungDiskon());
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", hitungHargaSetelahDiskon());
        System.out.println();
    }
}
