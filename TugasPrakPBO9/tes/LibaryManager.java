package TugasPrakPBO8.tes;

public class LibaryManager {
    private static int totalBooksAvailable=100;
    public static void addBooks(int count){
        totalBooksAvailable+=count;
        System.out.println(count+"Books Added");
    }
    public static void removeBooks(int count){
        if(count<=totalBooksAvailable){
            totalBooksAvailable-=count;
            System.out.println(count+"Books removed");
        } else{
            System.out.println("Not Enough books available to remove");
        }
    }
    public static void displayTotalBooks(){
        System.out.println("Total books availabele"+totalBooksAvailable);
    }
    public static void main(String[] args){
        Book book1 = new Book("Book1","Author1","1");
        Book book2 = new Book("Book2","Author2","2");
        Book book3 = new Book("Book3","Author3","3");

        Book.displayTotalBooks();
    }
}
