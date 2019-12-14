package com.company.patterns.observer.custom;

/**
 * @author yizhang
 */
public interface Subject {
    /**
     * Register an observer
     * @param o observer
     */
    public void registerObserver(Observer o);

    /**
     * Remove an observer
     * @param o observer
     */
    public void removeObserver(Observer o);

    /**
     * Notify all observers
     */
    public void notifyObservers();
}
