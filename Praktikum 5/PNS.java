// Nama File: PNS.java
// Deskripsi: Class untuk representasi PNS
// Pembuat: [Farah Aulia Zahra]
// Tanggal: [21-03-2025]

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class PNS extends Manusia implements Pajak {
    private double pendapatan;
    private String nip;
    private LocalDate tglMulaiKerja;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, alamat);
        this.pendapatan = pendapatan;
        this.nip = nip;
        this.tglMulaiKerja = tglMulaiKerja;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    public long hitungMasaKerja() {
        return ChronoUnit.YEARS.between(tglMulaiKerja, LocalDate.now());
    }

    @Override
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("NIP: " + nip);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
    }
}