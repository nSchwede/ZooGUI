public class Walk implements MoveBehavior
{
    //the walk class overrides the move function that is from the movebehavior interface
    @Override
    public String move()
    {
        // animal walks to move
        // https://youtube.com/shorts/uaLvDD3zh00?si=_DOCzhce5ZHi7X3N 
        return "this animal moves by walking"; 
    }
}