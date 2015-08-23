package fr.hgwood.templatemethod.processor.templatemethod;

import fr.hgwood.templatemethod.processor.Processor;

public class LoggingProcessor extends ProcessorDecorator {

    public LoggingProcessor(Processor delegate) {
        super(delegate);
    }

    @Override
    protected void preprocess(Object o) {
        System.out.println("before");
    }

    @Override
    protected void postprocess(Object o) {
        System.out.println("after");
    }
}
