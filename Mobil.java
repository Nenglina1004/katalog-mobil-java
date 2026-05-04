public class Mobil {
    protected String merk;
    protected String warna;
    protected int tahun;
    protected String tipe;

    public Mobil(String merk, String warna, int tahun, String tipe) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
        this.tipe = tipe;
    }

    public void tampilkanInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
        System.out.println("Tipe  : " + tipe);
    }

    public void deskripsi() {
        System.out.println("Ini adalah mobil umum.");
    }
}