
public class DatabaseConnection {
    private static DatabaseConnection instance = null;

    private DatabaseConnection() {
        System.out.println("Database Connection Created");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        System.out.println(connection1 == connection2); 
    }
}