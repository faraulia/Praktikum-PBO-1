import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    private String nip;
    private String nama;
    private LocalDate tanggallahir;
    private LocalDate tmt;
    private int gajiPokok;
    private int masaKerja;

    public Pegawai(String nip, String nama, String lahir, String tmt, int gajiPokok, int masaKerja) {
        this.nip = nip;
        this.nama = nama;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        this.tanggallahir = LocalDate.parse(lahir, formatter);
        this.tmt = LocalDate.parse(tmt, formatter);
        this.gajiPokok = gajiPokok;
        this.masaKerja = masaKerja;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggallahir() {
        return tanggallahir;
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public Period hitungMasaKerja() {
        return Period.between(getTmt(), LocalDate.now());
    }

    public String formatCurrency(int amount) {
        return String.format("Rp %,d,00", amount).replace(',', '.');
    }
    
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        System.out.println("Informasi Pegawai");
        System.out.println("NIP           : " + getNip());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggallahir().format(formatter));
        System.out.println("TMT           : " + getTmt().format(formatter));
        System.out.println("Gaji Pokok    : " + formatCurrency(getGajiPokok()));
    }
}
