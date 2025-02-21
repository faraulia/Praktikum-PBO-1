/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Farah Aulia Zahra
 * Tanggal      : 18 Februari 2025
 */

public class Garis {
    /* States/Atribut */
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0; // menyimpan banyaknya objek garis yg pernah dibuat

    /* Behavior/Method */
    // Konstruktor
    Garis() {
        this(new Titik(0,0), new Titik(1,1)); // inisialisasi titik awal (0,0) dan titik akhir (1,1)
    }

    // Konstruktor berparameter (masukan titik awal dan titik akhir)
    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Selektor untuk tiap atribut beserta mutatornya 
    void setTitikAwal(Titik t) {
        this.titikAwal = t;
    }

    void setTitikAkhir(Titik t) {
        this.titikAkhir = t;
    }

    Titik getTitikAwal() {
        return titikAwal;
    }

    Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Mengembalikan jumlah objek Garis yang sudah dibuat
    static int getCounterGaris(){
        return counterGaris;
    }

    // Mendapatkan panjang sebuah garis
    double getPanjang() {
        /* cara lain
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy); */
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // Mendapatkan gradien dari sebuah garis
    double getGradien(){
        /* cara lain tanpa ada kondisi jika tidak terdefinisi
        return ((titikAkhir.getOrdinat() - titikAwal.getOrdinat())/(titikAkhir.getAbsis() - titikAwal.getAbsis())); */
        double X = titikAwal.getAbsis() - titikAkhir.getAbsis();
            if (X == 0) {
                System.out.println("Gradien tidak terdefinisi karena pembagian nol");
            }
            return (titikAwal.getOrdinat() - titikAkhir.getOrdinat()) / X;
    }

    // Mendapatkan titik tengah dari sebuah garis
    Titik getTitikTengah() {
        return new Titik((this.titikAwal.getAbsis() + this.titikAkhir.getAbsis()) / 2, (this.titikAwal.getOrdinat() + this.titikAkhir.getOrdinat()) / 2);
    }

    // Mengecek garis sejajar dengan sebuah garis lainnya (menggunakan gradien)
    boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // Mengecek garis tegak lurus dengan sebuah garis lainnya
    boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    // Menampilkan titik awal dan titik akhir garis
    void printGaris() {
        System.out.println("Titik Awal: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // Menampilkan persamaan garis dalam bentuk string y = mx + c
    void persamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
} //end class Garis


