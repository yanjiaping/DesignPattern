package observer.demo1;

/**
 * @author admin
 * @description
 * @date 2020-12-02 11:16:56
 */
public class Test {
    public static void main(String[] args) {
        Weather weather = new Weather();
        WeatherDisplay1 d1 = new WeatherDisplay1(weather);
        WeatherDisplay2 d2 = new WeatherDisplay2(weather);
        weather.removeObserver(d1);
        weather.removeObserver(d2);
        weather.setTemperature(27);
        weather.setTemperature(26);
    }
}
