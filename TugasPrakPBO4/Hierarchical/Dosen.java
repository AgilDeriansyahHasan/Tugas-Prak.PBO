public class Dosen extends Karyawan {
    // Constructor untuk inisialisasi nama dosen
    public Dosen(String nama) {
        super(nama); // Memanggil constructor dari superclass (Karyawan)
    }

    // Override method kerja() di class Dosen
    @Override
    public void kerja() {
        System.out.println(nama + " kerja: mengajar");
    }
}
