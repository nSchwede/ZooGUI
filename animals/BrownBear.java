package animals;

import animal.*;
import behavior.*;

public class BrownBear extends Animal {
    public BrownBear(DietBehavior dietBehavior, MoveBehavior moveBehavior, SoundBehavior soundBehavior) {
        super(dietBehavior, moveBehavior, soundBehavior);
    }

}