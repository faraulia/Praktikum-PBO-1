import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {
        System.out.println("Tugas Lanjutan Praktikum UGM");
        
        Anabul anabul1 = new Kucing("Ciloi");
        Anabul anabul2 = new Anjing("Blackie");
        Anabul anabul3 = new Burung("Tweety");
        
        // ArrayList untuk menampung objek anabul
        ArrayList<Anabul> anabuls = new ArrayList<>();
        
        // Menambahkan objek ke dalam ArrayList
        anabuls.add(anabul1);
        anabuls.add(anabul2);
        anabuls.add(anabul3);
        
        // Data semua anabul
        System.out.println("TUGAS LANJUTAN PRAKTIKUM PBO: POLIMORFISME");
        System.out.println(" ");
        for (Anabul anabul : anabuls) {
            System.out.println("Hewan: " + anabul.getNama());
            anabul.bergerak();
            anabul.bersuara();
            System.out.println();
        }
        
        System.out.println("Simulasi dengan Generik");
        
        Datum<Anabul> datumKucing = new Datum<>(new Kucing("Mbis"));
        Datum<Anabul> datumAnjing = new Datum<>(new Anjing("Bruno"));
        Datum<Anabul> datumBurung = new Datum<>(new Burung("Piko"));
    
        ContohMetodeGenerik util = new ContohMetodeGenerik();

        util.tampilkanDatum(datumKucing);
        util.tampilkanPerilakuAnabul(datumKucing);
        System.out.println();

        util.tampilkanDatum(datumAnjing);
        util.tampilkanPerilakuAnabul(datumAnjing);
        System.out.println();

        util.tampilkanDatum(datumBurung);
        util.tampilkanPerilakuAnabul(datumBurung);
        System.out.println();

        // Ubah isi datum
        util.ubahIsi(datumBurung, new Burung("Rio"));
        System.out.println();

        // Bandingkan dua datum
        Datum<Anabul> datumKucingLain = new Datum<>(new Kucing("Mimi"));
        boolean hasilBanding = util.samaDatum(datumKucing, datumKucingLain);
        System.out.println("Apakah datumKucing dan datumKucingLain sama? " + hasilBanding);
    }
}