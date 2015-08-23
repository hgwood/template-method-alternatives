package fr.hgwood.templatemethod.processor.templatemethod;

import fr.hgwood.templatemethod.processor.Processor;

public abstract class ProcessorDecorator implements Processor {

    private final Processor delegate;

    public ProcessorDecorator(Processor delegate) {
        this.delegate = delegate;
    }

    public void process(Object o) {
        preprocess(o);
        delegate.process(o);
        postprocess(o);
    }

    protected void preprocess(Object o) {

    }

    protected void postprocess(Object o) {

    }

}
