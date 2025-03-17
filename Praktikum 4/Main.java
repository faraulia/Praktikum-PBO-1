public class Main {
    public static void main(String[] args) {
        // Membuat objek Pegawai
        Pegawai pegawai1 = new Pegawai("123456789", "Medeia Beliard", "5 Mei 1990", "1 Januari 2015", 5000000, 9);
        pegawai1.printInfo();
        System.out.println();

        // Membuat objek Dosen Tetap
        DosenTetap dosenTetap1 = new DosenTetap("987654321", "0123456789", "Farah Aulia Zahra", "10 Oktober 1980", 
                "1 Januari 2010", "Fakultas Sains dan Matematika", 14, "10 Oktober 2045", 8000000);
        dosenTetap1.printInfo();
        System.out.println();

        // Membuat objek Dosen Tamu
        DosenTamu dosenTamu1 = new DosenTamu("876543210", "9876543210", "Cale Henituse", "15 Maret 1985", 
                "1 Agustus 2018", "Fakultas Ekonomi", "1 Agustus 2025", 7000000);
        dosenTamu1.printInfo();
        System.out.println();

        // Membuat objek Tendik
        Tendik tendik1 = new Tendik("135792468", "Cayena Hill", "20 Desember 1975", "1 Juli 2005", 
                "20 Desember 2035", 4500000, 19, "Kemahasiswaan");
        tendik1.printInfo();
    }
}
