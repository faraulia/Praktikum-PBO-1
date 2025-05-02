public class ContohMetodeGenerik {
    
    // Metode generik untuk menampilkan informasi Datum
    public <T> void tampilkanDatum(Datum<T> datum) {
        System.out.println(datum);
    }
    
    // Metode generik untuk mengubah nilai isi Datum
    public <T> void ubahIsi(Datum<T> datum, T isiBaru) {
        datum.setIsi(isiBaru);
        System.out.println("Isi Datum telah diubah menjadi: " + datum);
    }
    
    // Metode generik khusus untuk Anabul
    public <T extends Anabul> void tampilkanPerilakuAnabul(Datum<T> datum) {
        T anabul = datum.getIsi();
        if (anabul != null) {
            System.out.println("Perilaku " + anabul.getNama() + ":");
            anabul.bersuara();
            anabul.bergerak();
        } else {
            System.out.println("Datum tidak berisi Anabul!");
        }
    }
    
    // Metode generik untuk membandingkan dua Datum
    public <T> boolean samaDatum(Datum<T> datum1, Datum<T> datum2) {
        if (datum1.getIsi() == null && datum2.getIsi() == null) {
            return true;
        }
        if (datum1.getIsi() == null || datum2.getIsi() == null) {
            return false;
        }
        return datum1.getIsi().equals(datum2.getIsi());
    }
}