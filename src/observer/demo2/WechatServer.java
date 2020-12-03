package observer.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，也就是微信公众号服务
 * 实现了Observable接口，对Observable接口的三个方法进行了具体实现
 *
 * @author admin
 * @description
 * @date 2020-12-02 15:43:11
 */
public class WechatServer implements Observable {
    private List<Observer> observerList;
    private String message;

    public WechatServer() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!observerList.isEmpty()) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }

    public void setInformation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息：" + s);
        this.notifyObservers();
    }
}
