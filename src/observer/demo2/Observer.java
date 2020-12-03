package observer.demo2;

/**
 * 抽象观察者
 * 定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
 * @author admin
 * @description
 * @date 2020-12-02 15:31:34
 */
public interface Observer {
    /**
     * 更新
     *
     * @param message
     */
    void update(String message);
}
