// Class App untuk implementasi dari nomor 1 hingga 4
public class App {
    public static void main(String[] args) {
        // Membuat objek jaguar dari class MobilSport
        MobilSport jaguar = new MobilSport("Jaguar");

        // Output sesuai yang diinginkan
        jaguar.gigi(1);
        jaguar.gigi(2);
        jaguar.gigi(3);
        jaguar.gigi(4);
        jaguar.gigi(5);

        // Output dengan turbo
        for (int t = 1; t <= 5; t++) {
            jaguar.gigi(5, t);
        }
    }
}
