public class Slither implements MoveBehavior
{
    //the slither class overrides the move function that is from the movebehavior interface
    @Override
    public String move()
    {
        // animal has to silther to move
        // https://youtu.be/RwH9Xy8JWD0?si=n7DMaJbzZVE1t7MR 
        return "this animal slithers to move";
    }

}