public class Karyawan{
    protected String nama;
    protected String kodeKaryawan;

    Karyawan (String kodeKaryawan, String nama){
        this.kodeKaryawan = kodeKaryawan;
        this.nama = nama;
    }

        public void absenPagi(){
            System.out.println(nama + " Absen Pagi");
        }
        public void Kerja(){
            System.out.println(nama + " Kerja");
        }
        public void absenPulang(){
            System.out.println(nama + " Absen Pulang");
        }
    
    public void getinfo(){
        System.out.println(" Kode Karyawan : " + this.kodeKaryawan);
        System.out.println(" Nama : " + this.nama);
    }
}