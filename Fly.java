public class Fly implements MoveBehavior
{
    //the fly class overrides the move function that is from the movebehavior interface
    @Override
    public String move()
    {
        //The animal is able to fly, with wings
        return "animal flys with wings";
    }
}