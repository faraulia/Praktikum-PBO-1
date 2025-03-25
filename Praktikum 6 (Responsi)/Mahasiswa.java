import java.text.DecimalFormat;

class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private int semester;
    private Fakultas fakultas;
    private static final DecimalFormat formatter = new DecimalFormat("Rp #,###,###.00");

    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        totalMahasiswa++;
    }
    
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public double hitungUKT() {
        return fakultas.getTarifUKT() * Math.pow(0.95, semester - 1);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIM           : " + NIM);
        System.out.println("Semester      : " + semester);
        System.out.println("Fakultas      : " + fakultas.getNama());
        System.out.println("Biaya UKT     : " + formatter.format(hitungUKT()));    }
}