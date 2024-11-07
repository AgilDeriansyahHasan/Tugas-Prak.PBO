public class Main {
    public static void main(String[] args){
        //Mengatur nama perpustakaan
        Library.libraryName = "Perpustakaan Kota";

        //Membuat Objek buku
        Library.Book book1 = new Library.Book("Pemogramaan Java","Budi","1234567890");
        Library.Book book2 = new Library.Book("Algoritma dan Struktur Data", "Siti", "0987654321");

        //Menampilkan Informasi buku
        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}
