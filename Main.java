
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
        // Demonstrate behaviors for all animals
        for (Animal animal : animalContainer.animals) {
            animal.performEat();
            animal.performMove();
            animal.performSound();
            System.out.println("Animal: " + animal.getClass().getSimpleName());
            System.out.println("------------------");
        }

    }
}