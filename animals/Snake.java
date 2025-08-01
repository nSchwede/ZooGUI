package animals;

import behavior.*;
import animal.*;

public class Snake extends Animal {
    public Snake(DietBehavior dietBehavior, MoveBehavior moveBehavior, SoundBehavior soundBehavior) {
        super(dietBehavior, moveBehavior, soundBehavior);
    }

}