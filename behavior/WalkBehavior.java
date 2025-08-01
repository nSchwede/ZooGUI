package behavior;

public class WalkBehavior implements MoveBehavior {
    @Override
    public String move() {
        return "Walking.";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Walking";
    }
}
