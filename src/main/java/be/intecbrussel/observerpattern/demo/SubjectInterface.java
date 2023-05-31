package be.intecbrussel.observerpattern.demo;

public interface SubjectInterface {
    void attachObserver(ObserverInterface observerInterface);
    void detachObserver(ObserverInterface observerInterface);
    void notifyObservers();
}
