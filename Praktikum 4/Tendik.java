import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tendik extends Pegawai {
    private String bidang;
    private LocalDate bup;

    public Tendik(String nip, String nama, String lahir, String tmt, String bup, int gajiPokok, int masaKerja, String bidang) {
        super(nip, nama, lahir, tmt, gajiPokok, masaKerja);
        this.bidang = bidang;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id"));
        this.bup = LocalDate.parse(bup, formatter);
    }

    public String getBidang() {
        return bidang;
    }

    public LocalDate getBup() {
        return bup;
    }

    @Override
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id"));
        Period masaKerja = hitungMasaKerja();
        int tahunMasaKerja = masaKerja.getYears();
        double tunjangan = 0.01 * tahunMasaKerja * getGajiPokok();
        System.out.println("Informasi Tendik");
        System.out.println("NIP           : " + getNip());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggallahir().format(formatter));
        System.out.println("TMT           : " + getTmt().format(formatter));
        System.out.println("Bidang        : " + getBidang());
        System.out.println("BUP           : " + getBup().format(formatter));
        System.out.println("Gaji Pokok    : " + formatCurrency(getGajiPokok()));
        System.out.println("Tunjangan     : 1% x " + tahunMasaKerja + " x Rp " + formatCurrency(getGajiPokok()) + " = Rp. " + formatCurrency((int) tunjangan));    
    }
}
