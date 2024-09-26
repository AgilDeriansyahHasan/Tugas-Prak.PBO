public class Main {
    public static void main(String[] args) {
        // Membuat objek wahyu dari class Karyawan dengan nama "Wahyu"
        Karyawan wahyu = new Karyawan("Wahyu");

        // Membuat objek amir dari class Dosen dengan nama "Amir"
        Dosen amir = new Dosen("Amir");

        // Membuat objek melan dari class Staff dengan nama "Melan"
        Staff melan = new Staff("Melan");

        // Wahyu kerja
        wahyu.kerja();

        // Amir kerja
        amir.kerja();

        // Melan kerja
        melan.kerja();
    }
}
