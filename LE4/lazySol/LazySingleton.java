class LazySingleton {
    private static LazySingleton instance;
    private static int counter = 0;

    private LazySingleton() {
        if (counter > 0) {
            throw new IllegalStateException("Singleton instance already created!");
        }
        counter++;  
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public static int getCounter() {
        return counter;
    }
}