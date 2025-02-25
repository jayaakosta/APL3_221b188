public class EagerSingletonTest {
    public static void main(String[] args) {
        EagerSingleton.getInstance();
        EagerSingleton.getInstance();
        System.out.println("Eager Singleton Instances Created: " + EagerSingleton.getCounter());
    }
}

class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private static int counter = 1;

    private EagerSingleton() {
        if (counter > 1) {
            throw new IllegalStateException("Singleton instance already created!");
        }
        counter++;  
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public static int getCounter() {
        return counter;
    }
}