package animal;

import behavior.*;

public class Animal {
    private DietBehavior dietBehavior;
    private MoveBehavior moveBehavior;
    private SoundBehavior soundBehavior;

    public Animal(DietBehavior dietBehavior, MoveBehavior moveBehavior, SoundBehavior soundBehavior) {
        this.dietBehavior = dietBehavior;
        this.moveBehavior = moveBehavior;
        this.soundBehavior = soundBehavior;
    }

    public DietBehavior getDiet() {
        return dietBehavior;
    }

    public MoveBehavior getMove() {
        return moveBehavior;
    }

    public SoundBehavior getSound() {
        return soundBehavior;
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