package observer.demo2;

/**
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 * @author admin
 * @description
 * @date 2020-12-02 15:30:22
 */
public interface Observable {
    /**
     * 添加
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知
     */
    void notifyObservers();
}
