package behavior;

public class HissSound implements SoundBehavior {
    @Override
    public String sound() {
        return "Hissing.";
    }

    @Override
    public String toString() {
        return "Hiss";
    }

}
