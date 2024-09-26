public class Kucing extends Binatang {
    // Constructor untuk inisialisasi nama kucing
    public Kucing(String name) {
        super(name); // Memanggil constructor dari superclass (Binatang)
    }

    // Override method bersuara() di class Kucing
    @Override
    public void bersuara() {
        // Sekarang bisa langsung menggunakan 'name' karena 'protected'
        System.out.println(name + " bersuara: Ngeoong");
    }
}
