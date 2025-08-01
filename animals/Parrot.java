package animals;

import behavior.*;
import animal.*;

public class Parrot extends Animal {
    public Parrot(DietBehavior dietBehavior, MoveBehavior moveBehavior, SoundBehavior soundBehavior) {
        super(dietBehavior, moveBehavior, soundBehavior);
    }

}