public class Kendaraan {
    /***ATRIBUT***/
    private String noPlat;
    private String jenis;
    
    /***METHOD***/
    // Konstruktor tanpa parameter
    public Kendaraan(){
        noPlat = " ";
        jenis = " ";
    }
    // Konstruktor dengan parameter noPlat dan jenis
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }
    
    public String getNoPlat(){
        return noPlat;
    }
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }
    public String getJenis(){
        return jenis;
    }
    public void setJenis(String jenis){this.jenis = jenis;
    }
    
}
