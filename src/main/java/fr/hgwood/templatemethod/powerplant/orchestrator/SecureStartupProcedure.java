package fr.hgwood.templatemethod.powerplant.orchestrator;

public class SecureStartupProcedure {
    public void startSafely(PowerPlant powerPlant) {
        if (powerPlant.isSecure()) powerPlant.start();
        else powerPlant.lockdown();
    }
}
