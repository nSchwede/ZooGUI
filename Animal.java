public abstract class Animal
{
    protected DietBehavior dietBehavior;
    protected MoveBehavior moveBehavior;
    protected SoundBehavior soundBehavior;

    public Animal(DietBehavior dietBehavior, MoveBehavior moveBehavior, SoundBehavior soundBehavior)
    {
        this.dietBehavior = dietBehavior;
        this.moveBehavior = moveBehavior;
        this.soundBehavior = soundBehavior;
    }

    public void performSound()
    {
        soundBehavior.sound();
    }

    public void performMove()
    {
        moveBehavior.move();
    }

    public void performEat()
    {
        dietBehavior.eat();
    }

    public abstract String getDescription();


}