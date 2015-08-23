package com.zenika.debates.templatemethod.powerplant.templatemethod;

public abstract class PowerPlant {
    public abstract boolean isSecure();
    public abstract void start();
    public abstract void lockdown();
    public final void startSafely() {
        if (isSecure()) start();
        else lockdown();
    }
}
