package fr.hgwood.templatemethod.powerplant.templatemethod;

public abstract class PowerPlant {

    public abstract boolean isSecure();

    public abstract void start();

    public abstract void lockdown();

    public final void startSafely() {
        if (this.isSecure()) {
            this.start();
        } else {
            this.lockdown();
        }
    }
}
