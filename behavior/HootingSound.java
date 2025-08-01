package behavior;

public class HootingSound implements SoundBehavior {
    @Override
    public String sound() {
        return "Hooting";
    }

    @Override
    public String toString() {
        return "OOH AHH";
    }

}