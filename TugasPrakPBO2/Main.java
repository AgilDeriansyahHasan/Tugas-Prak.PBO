public class Main {
    public static void main(String[] args) {
        // Membuat objek Person
        Person person1 = new Person("Agil", 20,"Bekasi");

        person1.displayInfo();

        System.out.println("Mengubah Data");

        person1 = new Person("Seira",21,"Jakarta");
        // Menampilkan informasi setelah dimodifikasi
        person1.displayInfo();
    }
}
