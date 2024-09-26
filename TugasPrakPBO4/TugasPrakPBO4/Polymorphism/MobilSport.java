public class MobilSport {
    private String nama;

    // Constructor untuk memberikan nama pada mobil sport
    public MobilSport(String nama) {
        this.nama = nama;
    }

    // Method untuk gigi tanpa turbo
    public void gigi(int g) {
        System.out.println(nama + " masuk gigi ke-" + g);
    }

    // Method untuk gigi dengan turbo
    public void gigi(int g, int t) {
        System.out.println(nama + " masuk gigi ke-" + g + " dengan turbo " + t);
    }
}
