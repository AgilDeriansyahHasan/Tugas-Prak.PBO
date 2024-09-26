public class Cemeng extends Kucing {
    // Constructor untuk inisialisasi nama cemeng
    public Cemeng(String name) {
        super(name); // Memanggil constructor dari superclass (Kucing)
    }

    // Override method bersuara() di class Cemeng
    @Override
    public void bersuara() {
        System.out.println(name + " bersuara: Meoong");
    }
}
