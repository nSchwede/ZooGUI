
import animal.*;

public class Main {
    // implementation to fix compilation error
    public static AnimalContainer animalContainer = new AnimalContainer();
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.ConstructGUI();
        animalContainer.getAnimalMap();
        // Demonstrate behaviors for all animals
        for (Animal animal : animalContainer.getAnimalMap().values()) {
            System.out.println("Animal: " + animal.getClass().getSimpleName());
            animal.performSound();
            animal.performMove();
            animal.performEat();
            System.out.println();
        }

    }
}