package behavior;

public class ChirpSound implements SoundBehavior {
    @Override
    public String sound() {
        return "Chirping.";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Chirp Chirp";
    }
}
