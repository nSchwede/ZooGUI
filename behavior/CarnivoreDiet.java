package behavior;

public class CarnivoreDiet implements DietBehavior {
    @Override
    public String eat() {
        return "Eating meat.";
    }
}
