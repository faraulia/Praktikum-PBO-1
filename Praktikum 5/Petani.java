// Nama File: Petani.java
// Deskripsi: Class untuk representasi petani
// Pembuat: [Farah Aulia Zahra]
// Tanggal: [21-03-2025]

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Petani extends Manusia implements Pajak {
    private double pendapatan;
    private String daerah;
    private LocalDate tglMulaiKerja;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String daerah) {
        super(nama, alamat);
        this.pendapatan = pendapatan;
        this.daerah = daerah;
        this.tglMulaiKerja = tglMulaiKerja;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public double hitungPajak() {
        return 0; // Pajak petani 0%
    }

    public long hitungMasaKerja() {
        return ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now());
    }

    @Override
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Daerah: " + daerah);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
    }
}