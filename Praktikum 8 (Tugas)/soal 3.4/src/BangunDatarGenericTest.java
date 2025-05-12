/**
 * File : BangunDatarGenericTest.java
 * Deskripsi : main class untuk generic bangun datar
 */
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        // Lingkaran
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdgL = new BangunDatarGeneric<>();
        bdgL.set(l);
        System.out.println("=== Lingkaran ===");
        System.out.println("keliling: " + bdgL.hitungKeliling());
        System.out.println("luas: " + bdgL.get().hitungLuas());
        System.out.println("tipe generic: " + bdgL.get().getClass().getName());
        System.out.println();

        // Persegi
        Persegi p = new Persegi(4);
        BangunDatarGeneric<Persegi> bdgP = new BangunDatarGeneric<>();
        bdgP.set(p);
        System.out.println("=== Persegi ===");
        System.out.println("keliling: " + bdgP.hitungKeliling());
        System.out.println("luas: " + bdgP.get().hitungLuas());
        System.out.println("tipe generic: " + bdgP.get().getClass().getName());
        System.out.println();

        // Persegi Panjang
        Persegipanjang pp = new Persegipanjang(5, 3);
        BangunDatarGeneric<Persegipanjang> bdgPP = new BangunDatarGeneric<>();
        bdgPP.set(pp);
        System.out.println("=== Persegi Panjang ===");
        System.out.println("keliling: " + bdgPP.hitungKeliling());
        System.out.println("luas: " + bdgPP.get().hitungLuas());
        System.out.println("tipe generic: " + bdgPP.get().getClass().getName());
        System.out.println();

        // Test Segitiga
        Segitiga s = new Segitiga(3, 4, 5, 3, 4);
        BangunDatarGeneric<Segitiga> bdgS = new BangunDatarGeneric<>();
        bdgS.set(s);
        System.out.println("=== Segitiga ===");
        System.out.println("keliling: " + bdgS.hitungKeliling());
        System.out.println("luas: " + bdgS.get().hitungLuas());
        System.out.println("tipe generic: " + bdgS.get().getClass().getName());
    }
}
