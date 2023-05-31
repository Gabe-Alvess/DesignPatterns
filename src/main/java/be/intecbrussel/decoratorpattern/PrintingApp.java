package be.intecbrussel.decoratorpattern;

import be.intecbrussel.decoratorpattern.printerdecorators.TrimmingPrinter;
import be.intecbrussel.decoratorpattern.printerdecorators.UppercasePrinter;

public class PrintingApp {
    public static void main(String[] args) {
        BasicPrinter bp = new BasicPrinter();

        PrinterDecorator uppercase = new UppercasePrinter(bp);
        PrinterDecorator printer = new TrimmingPrinter(uppercase);

        printer.print("   Hello everyone!    ");

        // Of

        Printer printer1 = new TrimmingPrinter(new UppercasePrinter(bp));
        printer1.print("   Hello everyone!    ");
    }
}
