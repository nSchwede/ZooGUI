
import animal.*;
import behavior.*;

public class Main {
    // implementation to fix compilation error
    public static AnimalContainer animalContainer = new AnimalContainer();

    public static void main(String[] args) {
        // Create an instance of Main to access non-static members
        // Create GUI object
        GUI gui = new GUI();
        // Construct the GUI
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