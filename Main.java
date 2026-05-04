public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new SUV("Toyota Fortuner", "Hitam", 2023);
        Mobil mobil2 = new Sedan("Honda Civic", "Putih", 2022);
        Mobil mobil3 = new MPV("Mitsubishi Xpander", "Abu-Abu", 2024);

        System.out.println("=== KATALOG MOBIL ===\n");

        mobil1.tampilkanInfo();
        mobil1.deskripsi();
        System.out.println();

        mobil2.tampilkanInfo();
        mobil2.deskripsi();
        System.out.println();

        mobil3.tampilkanInfo();
        mobil3.deskripsi();
    }
}