package behavior;

public class OmnivoreDiet implements DietBehavior {
    @Override
    public String eat() {
        return "Eating both plants and meat.";
    }
}