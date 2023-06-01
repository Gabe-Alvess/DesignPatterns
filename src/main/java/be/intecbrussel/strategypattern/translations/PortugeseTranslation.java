package be.intecbrussel.strategypattern.translations;

import be.intecbrussel.strategypattern.Translation;

public class PortugeseTranslation implements Translation {
    @Override
    public String translateHello() {
        return "olá";
    }

    @Override
    public String translateGoodBye() {
        return "adeus";
    }

    @Override
    public String translateHowAreYou() {
        return "como vai você";
    }
}
