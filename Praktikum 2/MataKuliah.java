public class MataKuliah {
    /***ATRIBUT***/
    private String idMatKul;
    private String nama;
    private int sks;
    
    /***METHOD***/
    // Konstruktor tanpa parameter
    public MataKuliah(){
        idMatKul = " ";
        nama = " ";
        sks = 0;
    }
    // Konstruktor dengan parameter idMatkul, nama, sks
    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }
    
    public String getIdMatKul(){
        return idMatKul;
    }
    public void setIdMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getSKS(){
        return sks;
    }
    public void setSKS(int sks){
        this.sks = sks;
    }
}
