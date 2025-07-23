public class Lion extends Animal 
{
    public Lion(DietBehavior dietBehavior, MoveBehavior moveBehavior, SoundBehavior soundBehavior)
    {
        super(dietBehavior);
        super(moveBehavior);
        super(soundBehavior);
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

}