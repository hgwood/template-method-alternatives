package fr.hgwood.templatemethod.processor.compound;

import fr.hgwood.templatemethod.processor.Processor;

import java.util.List;

public class SerialProcessor implements Processor {

    private final List<Processor> processors;

    public SerialProcessor(List<Processor> processors) {
        this.processors = processors;
    }

    public void process(Object o) {
        for (Processor processor : processors) {
            processor.process(o);
        }
    }
}
