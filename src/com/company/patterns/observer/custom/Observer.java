package com.company.patterns.observer.custom;

/**
 * @author yizhang
 */
public interface Observer {
    /**
     * update information
     * @param temp temperature
     * @param humidity humidity
     * @param pressure pressure
     */
    public void update(float temp, float humidity, float pressure);
}
