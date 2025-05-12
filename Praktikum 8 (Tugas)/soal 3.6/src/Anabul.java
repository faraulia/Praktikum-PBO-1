abstract class Anabul {
    protected String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return nama + " (" + this.getClass().getSimpleName() + ")";
    }

    public abstract void bergerak();
    public abstract void bersuara();
}