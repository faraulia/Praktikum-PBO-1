import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTetap extends Dosen {
    private String nidn;
    private LocalDate bup;

    public DosenTetap(String nip, String nidn, String nama, String lahir, String tmt, String fakultas, int masaKerja, String bup, int gajiPokok) {
        super(nip, nama, lahir, tmt, gajiPokok, masaKerja, fakultas);
        this.nidn = nidn;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id"));
        this.bup = LocalDate.parse(bup, formatter);
    }

    public String getNidn() {
        return nidn;
    }

    public LocalDate getBup() {
        return bup;
    }

    @Override
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id"));
        Period masaKerja = hitungMasaKerja();
        int tahunMasaKerja = masaKerja.getYears();
        double tunjangan = 0.02 * tahunMasaKerja * getGajiPokok();

        System.out.println("Informasi Dosen Tetap");
        System.out.println("NIP           : " + getNip());
        System.out.println("NIDN          : " + getNidn());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal Lahir : " + getTanggallahir().format(formatter));
        System.out.println("TMT           : " + getTmt().format(formatter));
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("Fakultas      : " + getFakultas());
        System.out.println("Masa Kerja    : " + tahunMasaKerja + " tahun, " + masaKerja.getMonths() + " bulan");
        System.out.println("BUP           : " + getBup().format(formatter));
        System.out.println("Gaji Pokok    : " + formatCurrency(getGajiPokok()));
        System.out.println("Tunjangan     : 2% x " + tahunMasaKerja + " x Rp " + formatCurrency(getGajiPokok()) + " = Rp. " + formatCurrency((int) tunjangan));    }
}
