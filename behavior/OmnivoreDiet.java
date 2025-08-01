package behavior;

public class OmnivoreDiet implements DietBehavior {
    @Override
    public String eat() {
        return "Eating both plants and meat.";
    }

    @Override
    public String toString() {
        return "Eating both plants and meat.";
    }
}