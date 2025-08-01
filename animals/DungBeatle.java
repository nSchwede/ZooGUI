package animals;

import behavior.*;
import animal.*;

public class DungBeatle extends Animal {
    public DungBeatle(DietBehavior dietBehavior, MoveBehavior moveBehavior, SoundBehavior soundBehavior) {
        super(dietBehavior, moveBehavior, soundBehavior);
    }

    public void performSound() {
        soundBehavior.sound();
    }

    public void performMove() {
        moveBehavior.move();
    }

    public void performEat() {
        dietBehavior.eat();
    }

}