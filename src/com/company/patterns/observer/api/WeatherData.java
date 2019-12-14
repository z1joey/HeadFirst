package com.company.patterns.observer.api;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * @author yizhang
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData() {}

    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    float getTemperature() {
        return temperature;
    }

    float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}