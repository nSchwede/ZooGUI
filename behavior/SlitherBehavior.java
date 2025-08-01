package behavior;

public class SlitherBehavior implements MoveBehavior {
    @Override
    public String move() {
        return "Slithering";
    }

    @Override
    public String toString() {
        return "slithering";
    }

}