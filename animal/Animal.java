package animal;

import behavior.*;

public class Animal {
    protected DietBehavior dietBehavior;
    protected MoveBehavior moveBehavior;
    protected SoundBehavior soundBehavior;

    public Animal(DietBehavior dietBehavior, MoveBehavior moveBehavior, SoundBehavior soundBehavior) {
        this.dietBehavior = dietBehavior;
        this.moveBehavior = moveBehavior;
        this.soundBehavior = soundBehavior;
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

    public DietBehavior getDietBehavior() {
        return dietBehavior;
    }

    public MoveBehavior getMoveBehavior() {
        return moveBehavior;
    }

    public SoundBehavior getSoundBehavior() {
        return soundBehavior;
    }

}