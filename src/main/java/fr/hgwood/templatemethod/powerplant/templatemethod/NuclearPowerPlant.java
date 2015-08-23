package fr.hgwood.templatemethod.powerplant.templatemethod;

public class NuclearPowerPlant extends PowerPlant {

    @Override
    public boolean isSecure() {
        return false;
    }

    @Override
    public void start() {
        // light that uranium!
    }

    @Override
    public void lockdown() {
        // shoot that drone!
    }
}
