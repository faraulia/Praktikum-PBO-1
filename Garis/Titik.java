/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Farah Aulia Zahra
 * Tanggal      : 18 Februari 2025
 */

 public class Titik {
    /* States/Atribut */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* Behavior/Method */

    // Konstruktor
    /*Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }*/

    static int getCounterTitik(){
        return counterTitik;
    }

    // untuk membuat nilai absis dan ordinat tertentu
    // absis dan ordinat real
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    Titik(){
        this(0,0);
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengubah nilai absis
    void setAbsis(double x) {
        this.absis = x;
    }

    // Mengubah nilai ordinat
    void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // Kuadran
    int getKuadran(){
        if (getAbsis() > 0 && getOrdinat() > 0){
            return 1;
        }else if (getAbsis() < 0 && getOrdinat() > 0){
            return 2;
        }else if (getAbsis() < 0 && getOrdinat() < 0){
            return 3;
        }else if (getAbsis() > 0 && getOrdinat() < 0){
            return 4;
        }
        return 0;
    }

    // Jarak Pusat
    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Jarak
    double getJarak(Titik t) {
        //cara lain
        //double dx = t.absis - this.absis;
        //double dy = t.ordinat - this.ordinat;
        //return Math.sqrt(dx * dx + dy * dy);
        return Math.sqrt(Math.pow((t.absis - this.absis), 2) + Math.pow((t.ordinat - this.ordinat), 2));
    }

    // Refleksi X
    void refleksiX(){
        this.ordinat = this.ordinat * (-1);
    }

    // Refleksi Y
    void refleksiY(){
        this.absis = this.absis * (-1);
    }

    Titik getRefleksiX() {
        return new Titik(this.absis, (-1) * this.ordinat);
    }

    Titik getRefleksiY() {
        return new Titik((-1) * this.absis, this.ordinat);
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    void printCounterTitik(){
        System.out.println(counterTitik);
    }
}