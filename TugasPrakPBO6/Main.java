public class Main {
    public static void main(String[] args) {
        Jagoan jakaSembung = new Jagoan("Jaka Sembung");
        Jubah jubahPutih = new Jubah("Jubah Putih", 7, 50);
        Senjata golok = new Senjata("Golok", 25);
        jakaSembung.setJubah(jubahPutih);
        jakaSembung.setSenjata(golok);

        Jagoan pitung = new Jagoan("Si Pitung");
        Jubah jubahHitam = new Jubah("Jubah Hitam", 8, 52);
        Senjata toya = new Senjata("Toya", 24);
        pitung.setJubah(jubahHitam);
        pitung.setSenjata(toya);

        // Menampilkan info awal
        jakaSembung.display();
        pitung.display();

        // Saling serang
        jakaSembung.attack(pitung);
        jakaSembung.attack(pitung);

        pitung.attack(jakaSembung);

        jakaSembung.attack(pitung);

        pitung.attack(jakaSembung);
    }
}
