class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " (Anjing) bergerak dengan melata.");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " (Anjing) bersuara: Guk-guk!");
    }
}