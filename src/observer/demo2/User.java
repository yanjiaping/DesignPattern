package observer.demo2;

/**
 * @author admin
 * @description
 * @date 2020-12-02 15:52:41
 */
public class User implements Observer {
    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        this.read();
    }

    private void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
