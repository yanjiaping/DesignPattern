package observer.demo1;

/**
 * @author admin
 * @description
 * @date 2020-12-02 11:10:29
 */
public class WeatherDisplay2 implements Observer {
    private float temperature;

    public WeatherDisplay2(Subject weather) {
        weather.registerObserver(this);
    }

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("display2****:" + this.temperature);
    }
}
