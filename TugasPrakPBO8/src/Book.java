public class Book {
    private String title;
    private String author;
    private String isbn;
    public static int totalBooks = 0;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    public static void displayTotalBooks(){
        System.out.println("Total Books : " + totalBooks);
    }

    public static void main(String[] args){
        Book book1 = new Book("Judul 1", "Author 1", "ISBN001");
        Book book2 = new Book("Judul 2", "Author 2", "ISBN002");

        displayTotalBooks(); 
    }
}
