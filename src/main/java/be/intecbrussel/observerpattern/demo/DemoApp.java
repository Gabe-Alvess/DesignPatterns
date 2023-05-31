package be.intecbrussel.observerpattern.demo;

public class DemoApp {
    public static void main(String[] args) {
        DemoSubjectInterface subject = new DemoSubjectInterface();

        DemoObserverInterface observer1 = new DemoObserverInterface();
        DemoObserverInterface observer2 = new DemoObserverInterface();
        DemoObserverInterface observer3 = new DemoObserverInterface();
        DemoObserverInterface observer4 = new DemoObserverInterface();
        DemoObserverInterface observer5 = new DemoObserverInterface();

        observer1.name = "o1";
        observer2.name = "o2";
        observer3.name = "o3";
        observer4.name = "o4";
        observer5.name = "o5";

        subject.attachObserver(observer1);
        subject.attachObserver(observer2);
        subject.attachObserver(observer3);
        subject.attachObserver(observer4);
        subject.attachObserver(observer5);

        subject.detachObserver(observer4);

        subject.notifyObservers();
    }


}
