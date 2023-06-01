package be.intecbrussel.strategypattern;

public class Person {
    private String name;
    private final Translation language;

    public Person(String name, Translation language) {
        this.name = name;
        this.language = language;
    }

    public void sayHello() {
        System.out.println(language.translateHello());
    }

    public void sayGoodBye() {
        System.out.println(language.translateGoodBye());
    }

    public void sayHowAreYou() {
        System.out.println(language.translateHowAreYou());
    }
}
