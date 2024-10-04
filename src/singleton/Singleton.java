package src.singleton;

public class Singleton {

    //Eager Initialization
//    private static Singleton instance;
//    private String str;
//
//    private Singleton(String str) {
//    this.str = str;
//    }
//
//    public static synchronized Singleton getInstance() {
//
//        if (singleton == null) {
//            instance = new Singleton("adsffd");
//        }
//        return instance;
//    }

    //Eager Initialization
//    private static final Singleton instance = new Singleton();
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        return instance;
//    }

//    Thread-Safe Singleton using synchronized
//    private static Singleton instance;
//
//    private Singleton() {}
//
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }


//    Double-Checked Locking Singleton

    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}




