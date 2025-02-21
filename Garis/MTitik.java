public class MTitik {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Titik==========");
        // Membuat titik T1
        System.out.println("Titik T1:");
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        System.out.println("Titik setelah geser:");
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        System.out.println("Titik T2 = T1:");
        T2.printTitik();

        //Titik T3 = T3;
        //Titik T3 = new Titik(); 
        //T3.printTitik();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        //System.out.println("Jumlah Objek Titik = " + T1.getCounterTitik());
        
        // Geser
        T1.geser(2, -1);
        System.out.println("\nSetelah menggeser T1 (2, -1):");
        T1.printTitik();

        // getKuadran
        System.out.println("Kuadran T1 = " + T1.getKuadran());

        // jarakPusat
        System.out.println("\nJarak T1 ke pusat: " + T1.getJarakPusat());

        // jarakTitikLain
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));

        // refleksiX
        T1.refleksiX();
        System.out.println("Refleksi sumbu X");
        T1.printTitik();

        // refleksiY
        T1.refleksiY();
        System.out.println("Refleksi sumbu Y");
        T1.printTitik();

        // getRefleksiX
        Titik T1RefleksiX = T1.getRefleksiX();
        System.out.println("\nRefleksi T1 terhadap sumbu X:");
        T1RefleksiX.printTitik();

        // getRefleksiY
        Titik T2RefleksiY = T2.getRefleksiY();
        System.out.println("Refleksi T2 terhadap sumbu Y:");
        T2RefleksiY.printTitik();
    }
}
