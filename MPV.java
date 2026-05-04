public class MPV extends Mobil {
    public MPV(String merk, String warna, int tahun) {
        super(merk, warna, tahun, "MPV");
    }

    @Override
    public void deskripsi() {
        System.out.println("MPV cocok untuk keluarga dengan kapasitas besar.");
    }
}

