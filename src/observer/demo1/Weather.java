package observer.demo1;

import java.util.ArrayList;

/**
 * @author admin
 * @description
 * @date 2020-11-30 14:52:10
 */
public class Weather implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < this.observers.size(); i++) {
            this.observers.get(i).update(temperature);
        }
    }

    public void weatherChange() {
        this.notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    }
}
