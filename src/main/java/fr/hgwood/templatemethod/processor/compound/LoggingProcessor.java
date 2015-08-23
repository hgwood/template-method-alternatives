package fr.hgwood.templatemethod.processor.compound;

import fr.hgwood.templatemethod.processor.Processor;

public class LoggingProcessor implements Processor {

    private final String message;

    public LoggingProcessor(String message) {
        this.message = message;
    }

    public void process(Object o) {
        System.out.println(message);
    }

}
