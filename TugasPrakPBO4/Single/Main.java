public class Main {
    public static void main(String[] args) {
        // Membuat objek m1 dari class Mobil dengan nama "Hino"
        Mobil m1 = new Mobil("Hino");
        
        // Membuat objek s1 dari class Sedan dengan nama "Vios"
        Sedan s1 = new Sedan("Vios");
        
        // Mobil m1 melakukan klakson
        System.out.println("Hino melakukan klakson:");
        m1.klakson();
        
        // Sedan s1 melakukan klakson
        System.out.println("Vios melakukan klakson:");
        s1.klakson();
    }
}
