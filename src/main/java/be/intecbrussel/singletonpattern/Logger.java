package be.intecbrussel.singletonpattern; // creational patterns

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger logger;
    private List<String> logs;

    private Logger() {
        this.logs = new ArrayList<>();
    }

    public static Logger getLogger() {

        if (logger == null) {
            logger = new Logger();
        }

        return logger;
    }

    public void log(String log) {
        logs.add(log);
    }

    public void printLogs() {
        logs.forEach(System.out::println);
    }
}
