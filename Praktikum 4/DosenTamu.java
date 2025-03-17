import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DosenTamu extends Dosen {
    private LocalDate tanggalBerakhirKontrak;
    private String nidk;

    public DosenTamu(String nip, String nidk, String nama, String lahir, String tmt, String fakultas, String tanggalBerakhirKontrak, int gajiPokok) {
        super(nip, nama, lahir, tmt, gajiPokok, 0, fakultas);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id"));
        this.tanggalBerakhirKontrak = LocalDate.parse(tanggalBerakhirKontrak, formatter);
        this.nidk = nidk;
    }

    public String getNidk() {
        return nidk;
    }

    public LocalDate getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }

    @Override
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id"));
        double tunjangan = 0.025 * getGajiPokok();
        System.out.println("Informasi Dosen Tamu");
        System.out.println("NIP                      : " + getNip());
        System.out.println("NIDK                     : " + getNidk());
        System.out.println("Nama                     : " + getNama());
        System.out.println("Tanggal Lahir            : " + getTanggallahir().format(formatter));
        System.out.println("TMT                      : " + getTmt().format(formatter));
        System.out.println("Jabatan                  : Dosen Tamu");
        System.out.println("Fakultas                 : " + getFakultas());
        System.out.println("Tanggal Berakhir Kontrak : " + getTanggalBerakhirKontrak().format(formatter));
        System.out.println("Gaji Pokok               : " + formatCurrency(getGajiPokok()));
        System.out.println("Tunjangan                : 2.5% x Rp " + formatCurrency(getGajiPokok()) + " = Rp. " + formatCurrency((int) tunjangan));   
    }
}
