package fr.hgwood.templatemethod.powerplant.templatemethod;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class PowerPlantTest {

    PowerPlant sut = mock(PowerPlant.class, Mockito.CALLS_REAL_METHODS);

    @Test
    public void locks_down_if_not_secured() throws Exception {
        when(sut.isSecure()).thenReturn(false);
        sut.startSafely();
        verify(sut).lockdown();
    }

    @Test
    public void starts_if_secured() throws Exception {
        when(sut.isSecure()).thenReturn(true);
        sut.startSafely();
        verify(sut).start();
    }

}
