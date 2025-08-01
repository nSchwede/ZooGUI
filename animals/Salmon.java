package animals;

import behavior.*;
import animal.*;

public class Salmon extends Animal {
    public Salmon(DietBehavior dietBehavior, MoveBehavior moveBehavior, SoundBehavior soundBehavior) {
        super(dietBehavior, moveBehavior, soundBehavior);
    }

}