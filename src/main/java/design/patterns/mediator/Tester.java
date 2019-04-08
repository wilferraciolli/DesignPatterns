package design.patterns.mediator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Tester {

    private Button button;
    private Fan fan;

    @Before
    public void setUp() {
        this.button = new Button();
        this.fan = new Fan();
        PowerSupplier powerSupplier = new PowerSupplier();
        Mediator mediator = new Mediator();

        mediator.setButton(this.button);
        mediator.setFan(fan);
        mediator.setPowerSupplier(powerSupplier);
    }

    @Test
    public void givenTurnedOffFan_whenPressingButtonTwice_fanShouldTurnOnAndOff() {
        assertFalse(fan.isOn());

        button.press();
        assertTrue(fan.isOn());

        button.press();
        assertFalse(fan.isOn());
    }
}
