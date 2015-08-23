package fr.hgwood.templatemethod.processor.compound;

import fr.hgwood.templatemethod.processor.SomeProcessor;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        new SerialProcessor(asList(
            new LoggingProcessor("before"),
            new SomeProcessor(),
            new LoggingProcessor("after")
        )).process(new Object());
    }

}
