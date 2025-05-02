class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " (Kucing) bergerak dengan melata.");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " (Kucing) bersuara: Meong!");
    }
    
    @Override
    public String toString(){
        return nama + " (Kucing)";
    }
}