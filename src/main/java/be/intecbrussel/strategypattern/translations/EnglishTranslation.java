package be.intecbrussel.strategypattern.translations;

import be.intecbrussel.strategypattern.Translation;

public class EnglishTranslation implements Translation {
    @Override
    public String translateHello() {
        return "hello";
    }

    @Override
    public String translateGoodBye() {
        return "goodbye";
    }

    @Override
    public String translateHowAreYou() {
        return "how are you";
    }
}
