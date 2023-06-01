package be.intecbrussel.strategypattern.translations;

import be.intecbrussel.strategypattern.Translation;

public class RomanianTranslation implements Translation {
    @Override
    public String translateHello() {
        return "bonjour";
    }

    @Override
    public String translateGoodBye() {
        return "la revedere";
    }

    @Override
    public String translateHowAreYou() {
        return "ce face";
    }
}
