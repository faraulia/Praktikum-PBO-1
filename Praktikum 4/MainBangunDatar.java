//package praktikum4;

public class MainBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi2 = new Persegi();
        System.out.println("Informasi Persegi:");
        persegi2.printInfo();
        System.out.println();

        Persegi persegi = new Persegi(5.0, "Merah", "Solid");
        System.out.println("Informasi Persegi:");
        persegi.printInfo(); 
        System.out.println();

        BangunDatar.printCounterBangunDatar();
        Persegi.printCounterBangunDatar();

    }
}