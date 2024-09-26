public class Main {
    public static void main(String[] args){
    Dosen ionia = new Dosen("23456","332212","Ionia");
    ionia.getinfo();
    ionia.absenPagi();
    ionia.Kerja();
    ionia.absenPulang();

    Dosen andiani = new Dosen("23455", "332211","Andiani");
    andiani.getinfo();
    andiani.absenPagi();
    andiani.Kerja();
    andiani.absenPulang();

    Karyawan ridho = new Karyawan("12345","Ridho");
    ridho.getinfo();
    ridho.absenPagi();
    ridho.Kerja();
    ridho.absenPulang();

    Karyawan melan = new Karyawan("12346", "Melan");
    melan.getinfo();
    melan.absenPagi();
    melan.Kerja();
    melan.absenPulang();
}
}
