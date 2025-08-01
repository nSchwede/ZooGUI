package animals;

import behavior.*;
import animal.*;

public class King extends Animal {
    public King(DietBehavior dietBehavior, MoveBehavior moveBehavior, SoundBehavior soundBehavior) {
        super(dietBehavior, moveBehavior, soundBehavior);
    }

}