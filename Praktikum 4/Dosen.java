public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen(String nip, String nama, String lahir, String tmt, int gajiPokok, int masaKerja, String fakultas) {
        super(nip, nama, lahir, tmt, gajiPokok, masaKerja);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan       : Dosen");
        System.out.println("Fakultas      : " + getFakultas());
    }
}
