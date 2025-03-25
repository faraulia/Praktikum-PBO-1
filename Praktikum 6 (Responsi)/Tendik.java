class Tendik extends Karyawan {
    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
        totalTendik++;
    }

    public double hitungGaji() {
        return 4000000 + (getMasaKerja() * 0.01 * 4000000);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIP           : " + getNIP());
        System.out.println("Gaji Pokok    : " + formatter.format(4000000.0));
        System.out.println("Perhitungan   : Rp 4.000.000 + (" + getMasaKerja() + " x 1% x Rp 4.000.000)");
        System.out.println("Gaji Akhir    : " + formatter.format(hitungGaji()));
    }
}