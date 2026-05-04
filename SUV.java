public class SUV extends Mobil {
    public SUV(String merk, String warna, int tahun) {
        super(merk, warna, tahun, "SUV");
    }

    @Override
    public void deskripsi() {
        System.out.println("SUV cocok untuk perjalanan jauh dan medan berat.");
    }
}