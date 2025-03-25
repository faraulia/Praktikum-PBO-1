class CivitasAkademika {
    private String nama;
    private String email;
    protected static int totalMahasiswa = 0;
    protected static int totalDosen = 0;
    protected static int totalTendik = 0;

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void tampilkanInfo() {
        System.out.println("Nama          : " + nama);
        System.out.println("Email         : " + email);
    }
}