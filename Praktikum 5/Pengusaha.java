// Nama File: Pengusaha.java
// Deskripsi: Class untuk representasi pengusaha
// Pembuat: [Farah Aulia Zahra]
// Tanggal: [21-03-2025]

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Pengusaha extends Manusia implements Pajak {
    private double pendapatan;
    private String npwp;
    private LocalDate tglMulaiKerja;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, alamat);
        this.pendapatan = pendapatan;
        this.npwp = npwp;
        this.tglMulaiKerja = tglMulaiKerja;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    public long hitungMasaKerja() {
        return ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now());
    }

    @Override
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("NPWP: " + npwp);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
    }
}