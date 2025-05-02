class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " (Burung) bergerak dengan terbang.");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " (Burung) bersuara: Cuit-cuit!");
    }
    
    @Override
    public String toString(){
        return nama + " (Burung)";
    }
}