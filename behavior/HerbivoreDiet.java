package behavior;

public class HerbivoreDiet implements DietBehavior {
    @Override
    public String eat() {
        return "Eating plants.";
    }
}
