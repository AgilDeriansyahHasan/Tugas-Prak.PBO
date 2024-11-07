package TugasPrakPBO8.tes;

public class Book {
    private String title;
    private String author;
    private String isbn;
    public static int totalBooks = 0;
    public Book(String tittle, String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        totalBooks++;
    }
    public static void displayTotalBooks(){
        System.out.println("Total Books : " + totalBooks);
    }
    public static main(String args[]){
        displayTotalBooks();
    }
}
