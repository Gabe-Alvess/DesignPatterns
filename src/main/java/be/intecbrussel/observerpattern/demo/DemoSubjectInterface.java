package be.intecbrussel.observerpattern.demo;

import java.util.ArrayList;
import java.util.List;

public class DemoSubjectInterface implements SubjectInterface {
    private List<ObserverInterface> observerInterfaceList = new ArrayList<>();

    @Override
    public void attachObserver(ObserverInterface observerInterface) {
        observerInterfaceList.add(observerInterface);
    }

    @Override
    public void detachObserver(ObserverInterface observerInterface) {
        observerInterfaceList.remove(observerInterface);
    }

    @Override
    public void notifyObservers() {
        observerInterfaceList.forEach(ObserverInterface::update);
    }
}
