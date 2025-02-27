import java.util.ArrayList;

public class Mahasiswa {
    /************ATRIBUT************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /************METHOD************/
    // Konstruktor tanpa parameter
    public Mahasiswa(){
        this.listMatKul = new ArrayList<>();
    }

    // Konstruktor dengan parameter nim, nama, prodi
    public Mahasiswa(String nim, String nama, String prodi, Dosen dosenWali) {
        this.nim = nim;
        this.nama = nama;
        this.dosenWali = dosenWali;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }
    public Dosen getDosenWali() {
        return dosenWali;
    }
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }
    public Kendaraan getKendaraan(){
        return kendaraan;
    }
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }
    
    // Menambahkan sebuah mata kuliah
    public void addMatKul(MataKuliah matkul) {
        listMatKul.add(matkul);
    }

    // Mendapatkan jumlah SKS 
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < listMatKul.size(); i++) {
            totalSKS += listMatKul.get(i).getSKS();
        }
        return totalSKS;
    }    
    
    // Mendapatkan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatKul(){
        return listMatKul.size();
    }
    
    // Menampilkan nim, nama, dan prodi mahasiswa
    public void printMhs(){
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Prodi: " + prodi);
    }

    public void printDosen() {
        System.out.println("Dosen Wali: " + dosenWali.getNama() + " \nNIP: " + dosenWali.getNip() + " \nProdi: " + dosenWali.getProdi() + "");
    }    

    public void printKendaraan() {
        if (kendaraan != null) {
            System.out.println("Kendaraan: " + kendaraan.getNoPlat() + " - " + kendaraan.getJenis());
        } else {
            System.out.println("Mahasiswa tidak memiliki kendaraan");
        }
    }
    
    // Menampilkan detail
    public void printDetailMhs () {
        System.out.println("===== Detail Mahasiswa =====");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Daftar Mata Kuliah:");
        int i;
        if (listMatKul.size() == 0) {
            System.out.println("Belum mengambil mata kuliah");
        } else {
            for(i = 0; i < listMatKul.size(); i++) {
                System.out.println("- " + listMatKul.get(i).getNama());
            }
        }
        printDosen();
        printKendaraan();
    }
} //end class Mahasiswa


