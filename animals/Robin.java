package animals;

import behavior.*;
import animal.*;

public class Robin extends Animal {
    public Robin(DietBehavior dietBehavior, MoveBehavior moveBehavior, SoundBehavior soundBehavior) {
        super(dietBehavior, moveBehavior, soundBehavior);
    }

}