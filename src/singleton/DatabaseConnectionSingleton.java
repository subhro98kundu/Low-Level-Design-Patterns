package singleton;

public class DatabaseConnectionSingleton {
    private static DatabaseConnectionSingleton instance;
    private DatabaseConnectionSingleton() {
        // private constructor to prevent instantiation
    }
    public static DatabaseConnectionSingleton getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnectionSingleton.class) {
                if(instance == null) instance = new DatabaseConnectionSingleton();
            }
        }
        return instance;
    }
}
