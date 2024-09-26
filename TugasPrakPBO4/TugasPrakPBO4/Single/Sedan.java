public class Sedan extends Mobil {
    // Constructor untuk inisialisasi nama mobil di Sedan
    public Sedan(String nama) {
        super(nama); // Memanggil constructor dari superclass (Mobil)
    }

    // Override method klakson() di class Sedan
    @Override
    public void klakson() {
        System.out.println(nama + " klakson: Tiin");
    }
}
