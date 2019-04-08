package design.patterns.mediator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fan {

    private Mediator mediator;
    private boolean isOn = false;

    // constructor, getters and setters

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }
}
