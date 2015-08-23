package fr.hgwood.templatemethod.processor.templatemethod;

import fr.hgwood.templatemethod.processor.SomeProcessor;

public class Main {

    public static void main(String[] args) {
        new LoggingProcessor(new SomeProcessor()).process(new Object());
    }

}
