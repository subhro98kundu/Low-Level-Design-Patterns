import singleton.SingletonHandler;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! \n\nWelcome to the world of Design Patterns!\n\n");

        // Code to testify singleton design pattern in multithreaded environment
        for(int i = 0; i<=10; i++) {
            Thread t = new Thread(new SingletonHandler());
            t.start();
        }
    }
}