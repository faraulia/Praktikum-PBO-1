public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek mata kuliah
        MataKuliah PBO = new MataKuliah ("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah ("MBD", "Manajemen Basis Data", 3);
        // Membuat objek dosen wali
        Dosen D1 = new Dosen("123", "Inej Ghafa", "Informatika");
        Dosen D2 = new Dosen("456", "Nikolai Lantsov", "Teknik Elektro");

        // Mahasiswa 1 memiliki kendaraan dan mata kuliah
        Mahasiswa M1 = new Mahasiswa ("017", "Fara Aulia", "Informatika", D1);
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");
        M1.setKendaraan(K1);
        M1.addMatKul (PBO);
        M1.addMatKul (MBD);
        System.out.println("======= Mahasiswa 1 =======");
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());

        // Mahasiswa 2 tidak memiliki kendaraan, tetapi mengambil mata kuliah
        Mahasiswa M2 = new Mahasiswa("210", "Kaz Brekker", "Teknik Elektro", D2);
        M2.addMatKul(PBO);
        System.out.println("\n======= Mahasiswa 2 =======");
        M2.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M2.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M2.getJumlahSKS());
 
        // Mahasiswa 3 tidak memiliki kendaraan dan belum mengambil mata kuliah
        Mahasiswa M3 = new Mahasiswa("019", "Jesper Fahey", "Teknik Elektro", D2);
        System.out.println("\n======= Mahasiswa 3 =======");
        M3.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M3.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M3.getJumlahSKS());
 
        // Mahasiswa 4 mengambil banyak mata kuliah dan memiliki kendaraan
        Mahasiswa M4 = new Mahasiswa("114", "Nina Zenik", "Informatika", D1);
        Kendaraan K4 = new Kendaraan("H9708TS", "mobil");
        M4.setKendaraan(K4);
        M4.addMatKul(PBO);
        M4.addMatKul(MBD);
        M4.addMatKul(new MataKuliah("ASA", "Analisis dan Strategi Algoritma", 3));
        System.out.println("\n======= Mahasiswa 4 =======");
        M4.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M4.getJumlahMatKul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M4.getJumlahSKS());
    }
}

