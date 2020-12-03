package observer.demo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author admin
 * @description
 * @date 2020-12-02 15:55:18
 */
public class Test {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInformation("Java最牛逼！！！");

        server.removeObserver(userZhang);
        server.setInformation("Go也牛逼！！！");

        Collection c = Collections.emptyList();
        ArrayList<Integer> list = new ArrayList<>(c);

        Object[] elementData = {};
        System.out.println(elementData.getClass());
        System.out.println(Object[].class);
    }
}
