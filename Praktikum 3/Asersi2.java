/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi,yang akan menolak input
 *             jari-jari lingkaran yang bernilai nol
 */
//class Lingkaran
class Lingkaran{
    private double jariJari;
    
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
//class Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "
            +kelilingLingkaran);
    }
}

/* PERTANYAAN
 * Secara konsep, ada yang kurang tepat pada program Asersi 2 di atas. Jelaskan!
 * 
 * JAWABAN
 * Konsep yang kurang tepat adalah penempatan asersi sebelum objek dibuat, sehingga validasi tidak berlaku untuk semua instance Lingkaran.
 * "assert(jariJari > 0)" sebaiknya diletakkan di dalam konstruktor Lingkaran agar setiap objek yang dibuat memiliki jari-jari yang valid.
 * Selain itu, karena asersi dapat dinonaktifkan saat runtime, lebih disarankan menggunakan "IllegalArgumentException" untuk validasi yang lebih efektif.
 */
