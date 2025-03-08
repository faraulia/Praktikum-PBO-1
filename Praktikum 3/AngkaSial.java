/**
 * File        : AngkaSial.java
 * Deskripsi   : Program penggunaan exception buatan sendiri
 *              Pengenalan klausa 'throw' dan 'throws'
 */

 public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/* PERTANYAAN
 * Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * 
 * Apakah baris 21 pada AngkaSial.java di atas dieksekusi? Jelaskan!
 * 
 * 
 * JAWABAN
 * Ketika eksepsi terjadi, baris 12 tidak dieksekusi jika angka yang dimasukkan adalah 13,
 * karena "AngkaSialException" langsung dilempar (throw) sebelum mencapai baris tersebut.
 * Akibatnya, eksekusi "cobaAngka()" berhenti dan dialihkan ke blok catch di main().
 * 
 * Baris 21 juga tidak dieksekusi, karena setelah "as.cobaAngka(13);" melempar eksepsi,
 * program langsung masuk ke blok catch, sehingga "as.cobaAngka(12);"" tidak dijalankan.*/