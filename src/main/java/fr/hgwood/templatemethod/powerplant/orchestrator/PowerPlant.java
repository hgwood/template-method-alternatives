package fr.hgwood.templatemethod.powerplant.orchestrator;

public interface PowerPlant {
    boolean isSecure();
    void start();
    void lockdown();
}
