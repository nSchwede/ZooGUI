public abstract class Animal {
    protected DietBehavior dietBehavior;
    protected MoveBehavior moveBehavior;
    protected SoundBehavior soundBehavior;

    public Animal(DietBehavior dietBehavior, MoveBehavior moveBehavior, SoundBehavior soundBehavior) {
        this.dietBehavior = dietBehavior;
        this.moveBehavior = moveBehavior;
        this.soundBehavior = soundBehavior;
    }

    public DietBehavior getDiet() {
        return dietBehavior;
    }

    public void setDiet(DietBehavior dietBehavior) {
        this.dietBehavior = dietBehavior;
    }

    public MoveBehavior getMove() {
        return moveBehavior;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public SoundBehavior getSound() {
        return soundBehavior;
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
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

}