public class Dosen extends Karyawan{
    private String NIDN;

    Dosen(String kodeKaryawan, String NIDN, String nama){ 
    super(kodeKaryawan,nama);    
    this.NIDN=NIDN;
    }
    public String setNIDN(String NIDN){
        return this.NIDN;
    }

    public void getNIDN(){
        System.out.println("NIDN" + this.NIDN);
    }
}
