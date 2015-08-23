package fr.hgwood.templatemethod.powerplant.templatemethod;

public class CoalPowerPlant extends PowerPlant {

    @Override
    public boolean isSecure() {
        return false;
    }

    @Override
    public void start() {
        // burn some coal!
    }

    @Override
    public void lockdown() {
        // this is CHINAAAAAAA!!!
    }
}
