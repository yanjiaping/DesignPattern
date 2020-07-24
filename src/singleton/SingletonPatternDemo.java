package singleton;

/**
 * @author admin
 * @description
 * @date 2020-07-24 14:53:07
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        Singleton singleton = Singleton.getSingleton();

        //显示消息
        singleton.showMessage();
    }
}
