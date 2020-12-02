package observer;

/**
 * @author admin
 * @description
 * @date 2020-11-30 14:45:57
 */
public interface Subject {
    /**
     * 订阅
     *
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 取消
     *
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 通知所有人
     */
    void notifyObservers();
}
