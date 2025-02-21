public class MGaris {
    public static void main(String[] args) {
        System.out.println("===Membuat Objek Garis G1===");
        Garis G1 = new Garis();  // titikAwal = (0,0), titikAkhir = (1,1)
        G1.printGaris();
        System.out.println("Panjang G1: " + G1.getPanjang());
        System.out.println("Gradien G1: " + G1.getGradien());

        System.out.println("\n===Membuat Objek Garis G2 (konstruktor berparameter)===");
        Titik tA = new Titik(2, 2);
        Titik tB = new Titik(3, 3);
        Garis G2 = new Garis(tA, tB);
        G2.printGaris();
        System.out.println("Panjang G2: " + G2.getPanjang());
        System.out.println("Gradien G2: " + G2.getGradien());

        // Tampilkan titik tengah G2
        System.out.println("Titik tengah G2: (" + G2.getTitikTengah().getAbsis() + ", " + G2.getTitikTengah().getOrdinat() + ")");

        // Cek sejajar dan tegak lurus
        System.out.println("\nApakah G1 sejajar dengan G2? " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus dengan G2? " + G1.isTegakLurus(G2));

        // Menampilkan jumlah objek Garis
        System.out.println("Jumlah objek Garis saat ini: " + Garis.getCounterGaris());

        // Menampilkan persamaan garis dalam bentuk string y = mx + c
        System.out.println("\nGaris yang dibuat dari titik (-2,0) dan (0,4)");
        Titik tC = new Titik(-2, 0);
        Titik tD = new Titik(0, 4);
        Garis G3 = new Garis(tC, tD);
        //G3.printGaris();
        G3.persamaanGaris();
    }
}
