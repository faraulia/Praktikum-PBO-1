import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {
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
    }
}