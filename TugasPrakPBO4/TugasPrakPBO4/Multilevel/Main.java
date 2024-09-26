public class Main {
    public static void main(String[] args) {
        // Membuat objek kambing dari class Binatang dengan nama "Kambing"
        Binatang kambing = new Binatang("Kambing");

        // Membuat objek mudreg dari class Kucing dengan nama "Mudreg"
        Kucing mudreg = new Kucing("Mudreg");

        // Membuat objek mocha dari class Cemeng dengan nama "Mocha"
        Cemeng mocha = new Cemeng("Mocha");

        // Kambing bersuara
        kambing.bersuara();

        // Mudreg bersuara
        mudreg.bersuara();

        // Mocha bersuara
        mocha.bersuara();
    }
}
