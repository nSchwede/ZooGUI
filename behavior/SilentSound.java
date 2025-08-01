package behavior;

public class SilentSound implements SoundBehavior {
    @Override
    public String sound() {
        return "No sound.";
    }

    @Override
    public String toString() {
        return "Silent";
    }
}
