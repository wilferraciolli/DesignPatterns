package design.patterns.mediator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Button {

    private Mediator mediator;

    // constructor, getters and setters

    public void press() {
        mediator.press();
    }
}
