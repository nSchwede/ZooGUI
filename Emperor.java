public class Emperor extends Animal
{
    public Emperor(DietBehavior dietBehavior, MoveBehavior moveBehavior, SoundBehavior soundBehavior)
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