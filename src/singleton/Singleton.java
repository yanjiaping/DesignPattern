package singleton;

/**
 * @author admin
 * @description
 * @date 2020-07-24 14:52:01
 */
public class Singleton {

    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
