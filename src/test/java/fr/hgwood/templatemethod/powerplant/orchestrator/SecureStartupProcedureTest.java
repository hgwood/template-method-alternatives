package fr.hgwood.templatemethod.powerplant.orchestrator;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class SecureStartupProcedureTest {
    SecureStartupProcedure sut = new SecureStartupProcedure();

    @Test
    public void locks_down_power_plant_if_it_is_not_secured() throws Exception {
        PowerPlant powerPlant = mock(PowerPlant.class);
        when(powerPlant.isSecure()).thenReturn(false);
        sut.startSafely(powerPlant);
        verify(powerPlant).lockdown();
    }

    @Test
    public void starts_power_plant_if_it_is_secured() throws Exception {
        PowerPlant powerPlant = mock(PowerPlant.class);
        when(powerPlant.isSecure()).thenReturn(true);
        sut.startSafely(powerPlant);
        verify(powerPlant).start();
    }
}
