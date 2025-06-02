package singleton;
public class SingletonHandler implements Runnable {
    public void run() {
        DatabaseConnectionSingleton connection = DatabaseConnectionSingleton.getInstance();
        System.out.println("Current Database Connection from thread " + Thread.currentThread() + " is: " + System.identityHashCode(connection));
    }
}
