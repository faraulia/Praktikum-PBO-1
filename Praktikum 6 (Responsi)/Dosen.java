class Dosen extends Karyawan {
    private Fakultas fakultas;

    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        totalDosen++;
    }

    public double hitungGaji() {
        return fakultas.getGajiPokok() + (getMasaKerja() * 0.01 * fakultas.getGajiPokok());
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIP           : " + getNIP());
        System.out.println("Fakultas      : " + fakultas.getNama());
        System.out.println("Gaji Pokok    : " + formatter.format(fakultas.getGajiPokok()));
        System.out.println("Perhitungan   : " + formatter.format(fakultas.getGajiPokok()) + " + (" + getMasaKerja() + " x 1% x " + formatter.format(fakultas.getGajiPokok()) + ")");
        System.out.println("Gaji Akhir    : " + formatter.format(hitungGaji()));
    }
}