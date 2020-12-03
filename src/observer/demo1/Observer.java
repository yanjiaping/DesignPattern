package observer.demo1;

/**
 * @author admin
 * @description
 * @date 2020-11-30 15:01:56
 */
public interface Observer {
    /**
     * 更新温度
     *
     * @param temp
     */
    void update(float temp);
}
