public class Library {
    static {
        System.out.println("Library System initialized");
    }

    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        String result = Library.convertToUpperCase("hello library");
        System.out.println(result);
    }
}
