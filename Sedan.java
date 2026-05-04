public class Sedan extends Mobil {
    public Sedan(String merk, String warna, int tahun) {
        super(merk, warna, tahun, "Sedan");
    }

    @Override
    public void deskripsi() {
        System.out.println("Sedan nyaman digunakan di perkotaan.");
    }
}
