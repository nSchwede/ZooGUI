package animal;

import animals.*;
import behavior.*;

import java.util.HashMap;
import java.util.Map;

public class AnimalContainer {

    DietBehavior carnivore = new CarnivoreDiet();
    DietBehavior herbivore = new HerbivoreDiet();
    DietBehavior omnivore = new OmnivoreDiet();
    MoveBehavior walk = new WalkBehavior();
    MoveBehavior slither = new SlitherBehavior(); 
    MoveBehavior fly = new FlyBehavior();
    MoveBehavior swim = new SwimBehavior();
    SoundBehavior chirp = new ChirpSound();
    SoundBehavior growl = new GrowlSound();
    SoundBehavior roar = new RoarSound();
    SoundBehavior silent = new SilentSound();
    SoundBehavior howl = new HowlSound();
    SoundBehavior hiss = new HissSound();
    SoundBehavior creepy = new CreepyLaughSound(); 
    SoundBehavior hooting = new HootingSound();
    Animal[] animals = null;

    public AnimalContainer() {
        // Bears
        Animal brownBear = new BrownBear(herbivore, walk, growl);
        Animal blackBear = new BlackBear(omnivore, walk, growl);

        // Felines
        Lion lion = new Lion(carnivore, walk, roar);
        Ocelot ocelot = new Ocelot(carnivore, walk, growl);

        // Monkeys
        Orangatang orangutan = new Orangatang(herbivore, walk, hooting);
        Baboon baboon = new Baboon(herbivore, walk, hooting);

        // Canines
        // Todo A wolf woulk more bark
        Wolf wolf = new Wolf(carnivore, walk, howl);
        Hyena hyena = new Hyena(carnivore, walk, growl);

        // Arachnids
        BlackWidow blackWidow = new BlackWidow(carnivore, walk, silent);
        Scorpion scorpion = new Scorpion(carnivore, walk, hiss);

        // Insects
        PrayingMantis prayingMantis = new PrayingMantis(carnivore, walk, silent);
        DungBeatle dungBeetle = new DungBeatle(herbivore, walk, silent);

        // Birds
        Robin robin = new Robin(herbivore, fly, chirp);
        Parrot parrot = new Parrot(herbivore, fly, chirp);

        // Penguins
        Emperor emperorPenguin = new Emperor(carnivore, swim, chirp);
        King kingPenguin = new King(carnivore, swim, chirp);

        // Reptiles
        Snake snake = new Snake(carnivore, slither, hiss);
        KomodoDragon komodoDragon = new KomodoDragon(carnivore, walk, hiss);

        // fish
        Salmon salmon = new Salmon(herbivore, swim, silent);
        Shark shark = new Shark(carnivore, swim, silent);

        // Create an array of all animals
        Animal[] animalList = {
                brownBear, blackBear, lion, ocelot, orangutan, baboon,
                wolf, hyena, blackWidow, scorpion, prayingMantis, dungBeetle,
                robin, parrot, emperorPenguin, kingPenguin, snake,
                komodoDragon, salmon, shark
        };

        // Assign the array to the instance variable
        this.animals = animalList;

    }

    public Map<String, Animal> getAnimalMap() {
        AnimalContainer container = new AnimalContainer();
        Map<String, Animal> animalMap = new HashMap<>();

        String[] names = {
                "Brown Bear", "Black Bear", "Lion", "Ocelot", "Orangutang", "Baboon",
                "Wolf", "Hyena", "Black Widow", "Scorpion", "Praying Mantis", "Dung Beetle",
                "Robin", "Parrot", "Emperor Penguin", "King Penguin", "Snake", "Komodo Dragon",
                "Salmon", "Shark"
        };

        for (int i = 0; i < names.length; i++) {
            animalMap.put(names[i], container.getAnimal(i));
        }

        return animalMap;
    }

    public Animal getAnimal(String name) {
        // Getter method to return the array of animals

        return getAnimalMap().get(name);

    }

    public Animal getAnimal(int index) {
        // Getter method to return a specific animal by index
        if (index >= 0 && index <= animals.length) {
            return animals[index];
        } else {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

}
