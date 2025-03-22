// Nama File: Manusia.java
// Deskripsi: Abstract class untuk representasi manusia
// Pembuat: [Farah Aulia Zahra]
// Tanggal: [21-03-2025]

abstract class Manusia {
    protected String nama;
    protected String alamat;
    protected static int counterMns = 0;

    public Manusia(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        counterMns++;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public abstract void cetakInfo();
}