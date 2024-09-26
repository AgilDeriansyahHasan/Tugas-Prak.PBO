// Class untuk produk
class Produk {
    String caffeLatte;
    String matchaLatte;

    Produk(String caffeLatte, String matchaLatte) {
        this.caffeLatte = caffeLatte;
        this.matchaLatte = matchaLatte;
    }

    void tampilkanProduk() {
        System.out.println("Produk yang tersedia:");
        System.out.println("1. Caffe Latte: " + caffeLatte);
        System.out.println("2. Matcha Latte: " + matchaLatte);
    }
}

// Class untuk tentang kami
class TentangKami {
    String sejarah;
    String lokasi;

    TentangKami(String sejarah, String lokasi) {
        this.sejarah = sejarah;
        this.lokasi = lokasi;
    }

    void tampilkanTentangKami() {
        System.out.println("Tentang Kami:");
        System.out.println("Sejarah: " + sejarah);
        System.out.println("Lokasi: " + lokasi);
    }
}

// Class utama
public class CaffeNongkrong {
    public static void main(String[] args) {
        // Membuat objek produk
        Produk produk = new Produk("Kopi klasik yang dibuat dengan espresso dan susu", "Minuman teh hijau Jepang");

        // Membuat objek tentang kami
        TentangKami tentangKami = new TentangKami("Didirikan dari tahun 1987", "Jln. Jagakarsa No 58");

        // Menampilkan produk dan tentang kami
        produk.tampilkanProduk();
        tentangKami.tampilkanTentangKami();
    }
}
