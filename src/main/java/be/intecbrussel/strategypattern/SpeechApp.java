package be.intecbrussel.strategypattern;

import be.intecbrussel.strategypattern.translations.*;

public class SpeechApp {
    public static void main(String[] args) {
        Person person = new Person("Jan", new FrenchTranslation());
        speak(person);
    }

    private static void speak(Person person) {
        System.out.println("How do you say hello?");
        person.sayHello();
        System.out.println("How do you say goodbye?");
        person.sayGoodBye();
        System.out.println("How do you say how are you?");
        person.sayHowAreYou();
    }
}

