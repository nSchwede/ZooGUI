package animals;

public class Wolf extends Animal {
    public Wolf(DietBehavior dietBehavior, MoveBehavior moveBehavior, SoundBehavior soundBehavior) {
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