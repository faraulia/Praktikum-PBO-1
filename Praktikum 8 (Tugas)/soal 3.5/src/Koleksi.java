public class Koleksi<T> {
    private T[] wadah;
    private int nbelm;

    public Koleksi() {
        wadah = (T[]) new Object[10]; // objek koleksi yang berisi 10 karakter
        nbelm = 0;
    }
    
    public T getIsi(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return wadah[indeks];
        }
        return null;
    }
    
    public void setIsi(int indeks, T e) {
        if (indeks >= 0 && indeks < nbelm) {
            wadah[indeks] = e;
        }
    }
    
    public int getSize() {
        return nbelm;
    }
    
    public void setSize(int x) {
        nbelm = x;
    }
    
    public void add(T e) {
        if (nbelm < wadah.length) {
            wadah[nbelm] = e;
            nbelm++;
        } else {
            System.out.println("Koleksi penuh.");
        }
    }
    
    public T delete() {
        if (nbelm > 0) {
            nbelm--;
            T e = wadah[nbelm];
            wadah[nbelm] = null;
            return e;
        } else {
            System.out.println("Koleksi kosong.");
            return null;
        }
    }
    
    public void showAll() {
        System.out.print("Isi koleksi: ");
        for (int i = 0; i < nbelm; i++) {
            System.out.print(wadah[i] + " ");
        }
        System.out.println();
    }
}