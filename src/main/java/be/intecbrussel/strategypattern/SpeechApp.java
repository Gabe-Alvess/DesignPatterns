package be.intecbrussel.strategypattern;

import be.intecbrussel.strategypattern.translations.*;

public class SpeechApp {
    public static void main(String[] args) {
        line();
        System.out.println("English");
        line();
        Person michael = new Person("Michael", new EnglishTranslation());
        speak(michael);
        line();

        System.out.println("Dutch");
        line();
        Person jan = new Person("Jan", new DutchTranslation());
        speak(jan);
        line();

        System.out.println("French");
        line();
        Person jean = new Person("Jean", new FrenchTranslation());
        speak(jean);
        line();

        System.out.println("Portuguese");
        line();
        Person jose = new Person("José", new PortugeseTranslation());
        speak(jose);
        line();

        System.out.println("Romanian");
        line();
        Person bogdan = new Person("Bogdan", new RomanianTranslation());
        speak(bogdan);
    }

    private static void speak(Person person) {
        System.out.println("How do you say hello?");
        person.sayHello();
        System.out.println("How do you say goodbye?");
        person.sayGoodBye();
        System.out.println("How do you say how are you?");
        person.sayHowAreYou();
    }

    private static void line() {
        System.out.println("-".repeat(50));
    }
}

