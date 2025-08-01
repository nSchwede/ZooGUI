package animals;

import behavior.*;
import animal.*;

public class Shark extends Animal {
    public Shark(DietBehavior dietBehavior, MoveBehavior moveBehavior, SoundBehavior soundBehavior) {
        super(dietBehavior, moveBehavior, soundBehavior);
    }

}