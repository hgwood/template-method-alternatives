package com.zenika.debates.templatemethod.powerplant.orchestrator;

public class NuclearPowerPlant implements PowerPlant {

    public boolean isSecure() {
        return false;
    }

    public void start() {
        // light that uranium!
    }

    public void lockdown() {
        // shoot that drone!
    }
}
