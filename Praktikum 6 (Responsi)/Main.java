public class Main {
    public static void main(String[] args) {
        Universitas undip = new Universitas("Universitas Diponegoro");
        Fakultas fsm = new Fakultas("Sains dan Matematika", 5000000, 7000000);
        Mahasiswa mhs1 = new Mahasiswa("Farah Aulia Zahra", "fara@undip.ac.id", "24060123120017", 4, fsm);
        Dosen dosen1 = new Dosen("Dr. Kaz Brekker", "kaz@undip.ac.id", "12345678", 5, fsm);
        Tendik tendik1 = new Tendik("Inej Ghafa", "inej@undip.ac.id", "87654321", 10);

        System.out.println("Nama Universitas : " + undip.getNama());
        System.out.println();
        System.out.println("Informasi Mahasiswa");
        mhs1.tampilkanInfo();
        System.out.println();
        System.out.println("Informasi Dosen");
        dosen1.tampilkanInfo();
        System.out.println();
        System.out.println("Informasi Tendik");
        tendik1.tampilkanInfo();
        System.out.println();
    }
}