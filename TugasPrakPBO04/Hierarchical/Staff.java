public class Staff extends Karyawan {
    // Constructor untuk inisialisasi nama staff
    public Staff(String nama) {
        super(nama); // Memanggil constructor dari superclass (Karyawan)
    }

    // Override method kerja() di class Staff
    @Override
    public void kerja() {
        System.out.println(nama + " kerja: bantu dosen");
    }
}
