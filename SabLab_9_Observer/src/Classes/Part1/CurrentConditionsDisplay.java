package Classes.Part1;

import Interfaces.DisplayElement;
import Interfaces.Observer;
import Interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherDate;

    public CurrentConditionsDisplay(Subject weatherDate) {

        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    public void update(float temperature,
                       float humidity,
                       float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humidity and " + pressure + " pressure");
    }
}
