package TugasPrakPBO8.tes;

public class DatabaseConnection {
    private static DatabaseConnection instance=null;
    private DatabaseConnection(){
        System.out.println("Database Connection Created");
    }
    public static DatabaseConnection(){
        if(instance==null){
            instance=new DatabaseConnection();
        }
        return instance;
    }
}
