package fr.hgwood.templatemethod.decorator.compound;

import java.util.List;

public class CompoundProcessor implements Processor {

    private final List<Processor> processors;

    public CompoundProcessor(List<Processor> processors) {
        this.processors = processors;
    }

    public void process(Object o) {
        for (Processor processor : processors) {
            processor.process(o);
        }
    }
}
