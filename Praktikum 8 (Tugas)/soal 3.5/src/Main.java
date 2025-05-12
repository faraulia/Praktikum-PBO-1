public class Main {
    public static void main(String[] args) {
        Koleksi<Character> K = new Koleksi<>();

        // menambahkan 10 elemen atau karakter ke dalam koleksi
        K.add('F');
        K.add('A');
        K.add('R');
        K.add('A');
        K.add('H');
        K.add('A');
        K.add('U');
        K.add('L');
        K.add('I');
        K.add('A');

        System.out.println("Koleksi awal");
        K.showAll();

        System.out.println("\nMengubah elemen di indeks 9 menjadi Z");
        K.setIsi(9, 'Z');
        K.showAll();

        System.out.println("\nUkuran koleksi: " + K.getSize());

        System.out.println("\nMengubah ukuran koleksi");
        System.out.println("Ukuran koleksi sebelum perubahan: " + K.getSize());
        K.setSize(5);
        System.out.println("Ukuran koleksi setelah perubahan: " + K.getSize());
        K.showAll();

        System.out.println("Elemen di indeks 0: " + K.getIsi(0));

        System.out.println("Elemen yang dihapus: " + K.delete());

        System.out.println("\nSemua elemen dalam koleksi akhir");
        K.showAll();
    }
}
